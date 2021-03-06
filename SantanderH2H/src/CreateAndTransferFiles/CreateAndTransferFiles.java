package CreateAndTransferFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import com.jcraft.jsch.*;


public class CreateAndTransferFiles {

	private static String FilePath="";
	private static String FileConfig="";

	public static void main (String PathFile) throws Exception
	{
		Iniciar(PathFile);
	}

	private static void Iniciar (String FilePaths) throws Exception
	{
		FileConfig = "FileConfig.csv";
		FilePath = FilePaths + "\\";

		System.out.println("******** Inicio de  Ejecuci�n de Creaci�n de Archivos ********" + "\r\n");
		System.out.println("(" + hora("") + ") 1. Indicar Rutas y Archivo de Configuraci�n");
		System.out.println("(" + hora("") + ") 2. Abrir archivo de configuraci�n");

		ViewFileConfig();

		System.out.println("(" + hora("") + ") 4. Fin de Generaci�n de archivos");
	}

	private static void ViewFileConfig()throws IOException
	{
		System.out.println("(" + hora("") + ") 3. Lectura del archivo de configuraci�n" + "\r\n");

		System.out.println("******** Creaci�n de archivos y transferencia al Servidor SFTP ********" + "\r\n");

		String fichero = FilePath + FileConfig;

		    try {
		      FileReader fr = new FileReader(fichero);
		      BufferedReader br = new BufferedReader(fr);
		      String linea;
		      int i=0;
		      if (!br.toString().equals(""))
		      {
			      while((linea = br.readLine()) != null)
			      {
			    	  i=i+1;
			    	  if (i>1 )
			    	  {
			    		  System.out.println("(" + hora("") + ") * Envi� de L�nea del archivo para separaci�n de campos");
			    		  ViewData(linea);
			    	  }
			      }
		      }

		      fr.close();
		    }
		    catch(Exception e) {
		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
		    }

	}

	private static void ViewData (String Linea) throws Exception
	{
		String LineaN=Linea;
		String User="";
		String Pwd="";
		String Host="";
		int Port=0;
		String PathSFTP ="";

		System.out.println("(" + hora("") + ") * Separaci�n de los valores por campo");

		//String Posicion = LineaN.substring(0, LineaN.indexOf(";"));
		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		String FileName = LineaN.substring(0, LineaN.indexOf(";"));		
		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		String FileBase = LineaN.substring(0, LineaN.indexOf(";"));
		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		String Cuenta = LineaN.substring(0, LineaN.indexOf(";"));
		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		String Cliente = LineaN.substring(0, LineaN.indexOf(";"));
		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		String Fecha = LineaN.substring(0, LineaN.indexOf(";"));

		User = TestConsultar.leerproperties("usersftp");
		Pwd = TestConsultar.leerproperties("pwdsftp");
		Host = TestConsultar.leerproperties("hostsftp");
		Port = Integer.parseInt(TestConsultar.leerproperties("portsftp"));
		PathSFTP = TestConsultar.leerproperties("pathsftp");

		System.out.println("(" + hora("") + ") * Creaci�n del archivo con base a los datos obtenidos");
		CreateFile(FileBase,FileName,Cuenta,Fecha);
		//DeleteFile(User, Pwd, Host, Port, FileName, FilePath, PathSFTP);
		TransferFiles(User, Pwd, Host, Port, FileName, FilePath, PathSFTP);
		ValidaRespaldoArchivos(User, Pwd, Host, Port, FileName, PathSFTP);
		//DownloadFiles(User, Pwd, Host, Port, "Ok.txt", FilePath, PathSFTP);
		System.out.println("****************"+ "\r\n");
		
	}

	private static void CreateFile(String sourceFile, String destinationFile, String Cuenta, String Fecha) throws IOException {

		String FicheroSource = FilePath + sourceFile;
		FileWriter FicheroDestination= null;
		PrintWriter pw = null;

	    try {

	      FileReader fr1 = new FileReader(FicheroSource);
	      BufferedReader br1 = new BufferedReader(fr1);

	      int cont = (int) br1.lines().count();

	      fr1.close();
	      br1.close();

	      FileReader fr = new FileReader(FicheroSource);
	      BufferedReader br = new BufferedReader(fr);

	      FicheroDestination = new FileWriter(FilePath + "\\Evidencias\\" + destinationFile);
          pw = new PrintWriter(FicheroDestination);

	      System.out.println("(" + hora("") + ") * Se genera el archivo " + destinationFile + "\r\n");

          int i=0;
	      String linea;
	      String lineaD="";

	      while((linea = br.readLine()) != null)
	      {
	    	i=i+1;
	    	if (i==1)
	    	{
	    		lineaD = linea.substring(0,23) + Fecha + linea.substring(31);
	    	}
	    	else if (i<cont)
		    	{
		    		lineaD = linea.substring(0,79) + Cuenta + linea.substring(90);
		    	}

	    	else if (i==cont)
	    	{
	    		lineaD = linea;
	    	}

	    	pw.println(lineaD);
	      }

	      fr.close();
	      pw.close();
	    }
	    catch(Exception e) {
	      System.out.println("(" + hora("") + ") * Excepcion leyendo fichero "+ FicheroSource + ": " + e);
	    }
	}

	private static void DeleteFile (String pUser, String pPass,String pHost, int pPort, String FileName, String pOutputStream, String pPathFile) throws Exception
	{
		   String user = pUser;
		   String password = pPass;
		   String host = pHost;
		   int port=22;
		   Session session = null;

		    try
		    {

		    	System.out.println("(" + hora("") + ") * Eliminar existente del archivo " + FileName + " del repositorio SFTP");

		        JSch jsch = new JSch();
		        session = jsch.getSession(user, host,port);
		        session.setPassword(password);
		        session.setConfig("StrictHostKeyChecking", "no");
		        System.out.println("(" + hora("") + ") * Establishing Connection...");
		        session.connect();
		        System.out.println("(" + hora("") + ") * Connection established.");
		        System.out.println("(" + hora("") + ") * Creating SFTP Channel.");
		        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
		        sftpChannel.connect();
		        System.out.println("(" + hora("") + ") * SFTP Channel created.");
		        //sftpChannel.put(pOutputStream + FileName, pPathFile + FileName);
		        sftpChannel.rm(pPathFile + FileName);

		        sftpChannel.disconnect();
		        session.disconnect();
		        System.out.println("");
		    }
		    catch(JSchException | SftpException e)
		    {
		        System.out.println("(" + hora("") + ") * Error al eliminar el archivo" + e);
		    }
	}

	private static void TransferFiles(String pUser, String pPass,String pHost, int pPort, String FileName, String pOutputStream, String pPathFile) throws Exception
	{
		   String user = pUser;
		   String password = pPass;
		   String host = pHost;
		   int port=22;
		   Session session = null;

		    try
		    {

		    	System.out.println("(" + hora("") + ") * Transferencia del archivo " + FileName + " al repositorio SFTP");

		        JSch jsch = new JSch();
		        session = jsch.getSession(user, host,port);
		        session.setPassword(password);
		        session.setConfig("StrictHostKeyChecking", "no");
		        System.out.println("(" + hora("") + ") * Establishing Connection...");
		        session.connect();
		        System.out.println("(" + hora("") + ") * Connection established.");
		        System.out.println("(" + hora("") + ") * Creating SFTP Channel.");
		        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
		        sftpChannel.connect();
		        System.out.println("(" + hora("") + ") * SFTP Channel created.");
		        sftpChannel.put(pOutputStream + "\\Evidencias\\" + FileName, pPathFile + FileName);

		        sftpChannel.disconnect();
		        session.disconnect();
		        System.out.println("");
		    }
		    catch(JSchException | SftpException e)
		    {
		        System.out.println(e);
		    }
	}

	private static void DownloadFiles(String pUser, String pPass,String pHost, int pPort, String FileName, String pOutputStream, String pPathFile) throws Exception
	{
		String SFTPHOST = pHost;
        int SFTPPORT = pPort;
        String SFTPUSER = pUser;
        String SFTPPASS = pPass;
        String SFTPWORKINGDIR = pPathFile;

        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;

        try {

        	System.out.println("(" + hora("") + ") * Descarga del archivo de finalizaci�n de transferencia");

            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            System.out.println("(" + hora("") + ") * Establishing Connection...");
            session.connect();
            System.out.println("(" + hora("") + ") * Connection established.");
	        System.out.println("(" + hora("") + ") * Creating SFTP Channel.");
            channel = session.openChannel("sftp");
            channel.connect();
            System.out.println("(" + hora("") + ") * SFTP Channel created.");
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(SFTPWORKINGDIR);
            byte[] buffer = new byte[1024];
            BufferedInputStream bis = new BufferedInputStream(channelSftp.get(FileName));
            File newFile = new File(pOutputStream);
            OutputStream os = new FileOutputStream(newFile);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            int readCount;
            while ((readCount = bis.read(buffer)) > 0) {
                System.out.println("(" + hora("") + ") * Writing: ");
                bos.write(buffer, 0, readCount);
            }
            bis.close();
            bos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


	}

	private static void ValidaRespaldoArchivos(String pUser, String pPass,String pHost, int pPort, String FileName, String pPathFile) throws Exception
	{
		  String user = pUser;
		  String password = pPass;
		  String host = pHost;
		  int port=22;
		  Session session = null;

		  try
		  {

			pPathFile = pPathFile + "respaldo/";

		    System.out.println("(" + hora("") + ") * Validar el respaldo del archivo " + FileName + " en el repositorio SFTP");
		    JSch jsch = new JSch();
		    session = jsch.getSession(user, host,port);
		    session.setPassword(password);
		    session.setConfig("StrictHostKeyChecking", "no");
		    System.out.println("(" + hora("") + ") * Establishing Connection...");
		    session.connect();
		    System.out.println("(" + hora("") + ") * Connection established.");
		    System.out.println("(" + hora("") + ") * Creating SFTP Channel.");
		    ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
		    sftpChannel.connect();
		    System.out.println("(" + hora("") + ") * SFTP Channel created.");

            int p=0;
            int cont=0;
            do
            {
            	int i=0;
            	@SuppressWarnings("rawtypes")
    			Vector filelist = sftpChannel.ls(pPathFile);

            	for (i = 0; i < filelist.size(); i++)
            	{
            		if (filelist.get(i).toString().indexOf(FileName)>0)
            		{
            			System.out.println("(" + hora("") + ") * Se realiz� el respaldo del archivo " + FileName);
            			p=1;
            			break;
            		}
            	}

            	if (cont >= 24)
            	{
            		System.out.println("(" + hora("") + ") * No se realiz� el respaldo del archivo " + FileName);
            		p=1;
            		break;
            	}

            	TimeUnit.SECONDS.sleep(5);
            	cont++;
            } while (p==0);

		    sftpChannel.disconnect();
		    session.disconnect();
		    System.out.println("");
		}
		catch(JSchException e)
		{
		    System.out.println("(" + hora("") + ") * Error al buscar el archivo" + e);
		}
	}

	private static String hora (String hora)
	{
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("dd/MM/YYYY - HH:mm:ss");

		hora = hourFormat.format(date);
		return hora;
	}

}
