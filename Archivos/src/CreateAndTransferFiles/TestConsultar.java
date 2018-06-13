package CreateAndTransferFiles;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;
import org.apache.commons.io.FileUtils;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell.XWPFVertAlign;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openqa.selenium.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;


class TestConsultar {

	private static final String TimeSpan = null;
	private static String UserName="";
	private static String PathFiles="";
	private static String FileConfig="";
	private static String[][] DataConfig= new String[10][12];
	private static WebDriver driver = null;
	private static int Browser;
	private static WebDriverWait wait;
	private static int TotFiles;
	private static XWPFDocument documento;
	private static InputStream fs;
	private static InputStream pic;
	private static String OS = System.getProperty("os.name").toLowerCase();
	private static String OSArch = System.getProperty("os.arch").toLowerCase();
	private static String OSVersion = System.getProperty("os.version").toLowerCase();
	private static File imagen;


	public static void main(String[] args) throws Exception {

		try {
			
			UserName = System.getProperty("user.name");
			
			crearword();
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			inicio();
		    System.out.println("(" + hora("") + ") * Fin de la prueba");
		    crearLog("(" + hora("") + ") * Fin de la prueba");
		    escribeword("* Fin de la prueba",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("--Fecha y hora del fin de la prueba: (" + hora("") + ")--",false,8,false,"Lucida Sans Unicode","izquierda");
		    cerrarword(PathFiles,"FOR-DES-502_H2HS_Flujo H2H Transferencia Mismo Banco");
		    
			}
		catch(NullPointerException e)
			{
			e.printStackTrace();
			System.out.println("Error (main): " + e);
			crearLog("Error (main): " + e);
			error();
			}

	}

	private static void inicio() throws Exception
	{
		try{
		
			FileConfig = "FileConfig.csv";

			int ciclos;
			int tiempo;

			System.out.println("******** Prueba de Validación de procesamiento de archivos en el Sistema H2H ********" + "\r\n");
			crearLog("******** Prueba de Validación de procesamiento de archivos en el Sistema H2H ********" + "\r\n");
			escribeword(" ",false,12,true,"Lucida Sans Unicode","izquierda");
			System.out.println(" ");
			crearLog("");
			System.out.println("* Usuario ejecutor de la prueba" + UserName + " *");
			crearLog("* Usuario ejecutor de la prueba: " + UserName);
			escribeword("* Ejecutor de la prueba: " + UserName,false,8,false,"Lucida Sans Unicode","izquierda");
			escribeword("* Fecha y hora del inicio de la prueba: (" + hora("") + ")",false,8,false,"Lucida Sans Unicode","izquierda");
			System.out.println(" ");
			crearLog("");
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("(" + hora("") + ") 1. Indicación de ruta y lectura de archivos de configuración");
			crearLog("(" + hora("") + ") 1. Indicación de ruta y lectura de archivos de configuración");
			escribeword("Preparación de creación de archivos",true,10,true,"Lucida Sans Unicode","izquierda");
			System.out.println(" ");
			crearLog("");
			System.out.println("Favor de ingresar la ruta donde se encuentran los archivos de configuración");
			crearLog("Favor de ingresar la ruta donde se encuentran los archivos de configuración");

			PathFiles = scanner.nextLine() + "\\";
			crearLog(PathFiles);
			
			PropiedadesWord();
			
			System.out.println(" ");
			crearLog("");
			
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			
			CreateAndTransferFiles.main(PathFiles);

			System.out.println(" ");
			crearLog("");
			
			LecturaArchivos(FileConfig,PathFiles);

			System.out.println("(" + hora("") + ") 3. Seleccionamos el navegador para realizar la prueba");
			crearLog("(" + hora("") + ") 3. Seleccionamos el navegador para realizar la prueba");
			System.out.println(" ");
			crearLog("");
			/*
			System.out.println("* Favor de seleccionar el navegador con el cual se realizará la prueba (Indicar el número)");
			crearLog("* Favor de seleccionar el navegador con el cual se realizará la prueba (Indicar el número)");
			System.out.println("1. Firefox");
			crearLog("1. Firefox");
			//System.out.println("2. Internet Explorer");
			//crearLog("2. Internet Explorer");
			System.out.println("2. Chrome");
			crearLog("2. Chrome");
			System.out.println(" ");
			crearLog("");
			Browser = scanner.nextInt();
			crearLog(Integer.toString(Browser));
			*/
			
			Browser=3;

			System.out.println(" ");
			crearLog("");
			System.out.println("(" + hora("") + ") 4. Definición de ciclos y tiempo de espera de ejecución entre ciclos");
			crearLog("(" + hora("") + ") 4. Definición de ciclos y tiempo de espera de ejecución entre ciclos");

			System.out.println(" ");
			crearLog("");
			System.out.println("* Favor de indicar cuantos ciclos de tiempo desea que se ejecuten en la prueba");
			crearLog("* Favor de indicar cuantos ciclos de tiempo desea que se ejecuten en la prueba");
			ciclos = scanner.nextInt();
			crearLog(String.valueOf(ciclos));

			System.out.println(" ");
			crearLog("");
			System.out.println("* Favor de indicar el tiempo de espera que se deberá realizar entre ciclos (Indicarlos en minutos)");
			crearLog("* Favor de indicar el tiempo de espera que se deberá realizar entre ciclos (Indicarlos en minutos)");
			tiempo = scanner.nextInt();
			crearLog(String.valueOf(tiempo));

			scanner.close();
			
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			
			BrowserOpen();
			
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			escribeword("Se realizaron " + ciclos + " ciclos con un tiempo de espera entre los ciclos de " + tiempo + " minutos",false,8,false,"Lucida Sans Unicode","izquierda");
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			

			TimeUnit.SECONDS.sleep(15);

			for (int c=1;c<=ciclos;c++)
			{
				
				System.out.println("(" + hora("") + ") * Inicio del Ciclo: " + c);
				crearLog("(" + hora("") + ") * Inicio del Ciclo: " + c);
				escribeword("Inicio del Ciclo No. " + c,false,10,false,"Lucida Sans Unicode","izquierda");
				escribeword(" " + c,false,10,false,"Lucida Sans Unicode","izquierda");
				
				for (int a=1;a<=TotFiles;a++)
				{
					if (DataConfig[a][0].equals(null)==true)
					{
						a=TotFiles;
					}
					else
					{
						if (DataConfig[a][5]!="ENVIADO AL CLIENTE" ||DataConfig[a][5]!="DUPLICADO" ||DataConfig[a][5]!="RECHAZADO")
						{
							ValidaCuenta(a,c);
							ValidaOperaciones(a,c);
						}
						else
						{
							System.out.println("(" + hora("") + ") * La cuenta " + DataConfig[a][1] + " con el archivo " +  DataConfig[a][0] + "tiene el estatus final " + DataConfig[a][5]);
							crearLog("(" + hora("") + ") * La cuenta " + DataConfig[a][1] + " con el archivo " +  DataConfig[a][0] + "tiene el estatus final " + DataConfig[a][5]);
							escribeword("* La cuenta " + DataConfig[a][1] + " con el archivo " +  DataConfig[a][0] + "tiene el estatus final " + DataConfig[a][5],false,8,false,"Lucida Sans Unicode","izquierda");
						}
					}
				}

				resultados();

				System.out.println("(" + hora("") + ") * Fin de la validación de archivos del ciclo " + c);
				crearLog("(" + hora("") + ") * Fin de la validación de archivos del ciclo" + c);
				escribeword("* Fin de la validación de archivos del ciclo" + c,false,8,false,"Lucida Sans Unicode","izquierda");
				
				if (c<ciclos)
				{

					System.out.println("(" + hora("") + ") * Inicio del tiempo de espera del ciclo: " + c);
					crearLog("(" + hora("") + ") * Inicio del tiempo de espera del ciclo: " + c);
					escribeword("* Inicio del tiempo de espera del ciclo: " + c,false,8,false,"Lucida Sans Unicode","izquierda");
					
					TimeUnit.MINUTES.sleep(tiempo);
					
					System.out.println("(" + hora("") + ") * Fin del tiempo de espera del ciclo: " + c);
					crearLog("(" + hora("") + ") * Fin del tiempo de espera del ciclo: " + c);
					escribeword("* Fin del tiempo de espera del ciclo: " + c,false,8,false,"Lucida Sans Unicode","izquierda");
				
				}
				
			}

			BrowserClose();
		}

		catch(NullPointerException e)
		{
		      System.out.println("Error (Inicio): " + e);
		      crearLog("Error (Inicio): " + e);
		      error();
		}

	}

	private static void resultados() throws IOException, InterruptedException
	{
		try
		{
			System.out.println("");
			crearLog("");
			System.out.println("Los resultados de las validaciones de las cuentas y sus archivos son las siguientes:");
			crearLog("Los resultados de las validaciones de las cuentas y sus archivos son las siguientes:");
			escribeword("Los resultados de las validaciones de las cuentas y sus archivos son las siguientes:",false,8,false,"Lucida Sans Unicode","izquierda");
			System.out.println("");
			crearLog("");

			for (int b=1;b<=TotFiles;b++)
			{
				if (DataConfig[b][0].equalsIgnoreCase(null)==false)
				{

					System.out.println("* Cuenta: " + DataConfig[b][1]);
					crearLog("* Cuenta: " + DataConfig[b][1]);
					escribeword("* Cuenta: " + DataConfig[b][1],false,8,false,"Lucida Sans Unicode","izquierda");
					System.out.println("* Archivo: " + DataConfig[b][0]);
					crearLog("* Archivo: " + DataConfig[b][0]);
					escribeword("* Archivo: " + DataConfig[b][0],false,8,false,"Lucida Sans Unicode","izquierda");
					System.out.println("* Estado: " + DataConfig[b][5]);
					crearLog("* Estado: " + DataConfig[b][5]);
					escribeword("* Estado: " + DataConfig[b][5],false,8,false,"Lucida Sans Unicode","izquierda");
					System.out.println("* Estado de los movimientos del Archivo: \r\n");
					crearLog("* Estado: \r\n");
					escribeword("* Estado: \r\n",false,8,false,"Lucida Sans Unicode","izquierda");

					String movimiento = DataConfig[b][6].toString();
					String ctacargo = DataConfig[b][7].toString();
					String producto = DataConfig[b][8].toString();
					String status = DataConfig[b][9].toString();
					String importe = DataConfig[b][10].toString();

					int x=1;

					
					XWPFTable tableresultadoencabezado = documento.createTable();
					
					XWPFTableRow tableresultadoRowOne = tableresultadoencabezado.getRow(0);
					tableresultadoRowOne.getCell(0).setText("No.");
					tableresultadoRowOne.getCell(0).setColor("100000");
					tableresultadoRowOne.getCell(0).setVerticalAlignment(XWPFVertAlign.CENTER);
					tableresultadoRowOne.addNewTableCell().setText("Movimiento");
					tableresultadoRowOne.getCell(1).setColor("100000");
					tableresultadoRowOne.getCell(1).setVerticalAlignment(XWPFVertAlign.CENTER);
					tableresultadoRowOne.addNewTableCell().setText("Cuenta Cargo");
					tableresultadoRowOne.getCell(2).setColor("100000");
					tableresultadoRowOne.getCell(2).setVerticalAlignment(XWPFVertAlign.CENTER);
					tableresultadoRowOne.addNewTableCell().setText("Producto");
					tableresultadoRowOne.getCell(3).setColor("100000");
					tableresultadoRowOne.getCell(3).setVerticalAlignment(XWPFVertAlign.CENTER);
					tableresultadoRowOne.addNewTableCell().setText("Estatus");
					tableresultadoRowOne.getCell(4).setColor("100000");
					tableresultadoRowOne.getCell(4).setVerticalAlignment(XWPFVertAlign.CENTER);
					tableresultadoRowOne.addNewTableCell().setText("Importe");
					tableresultadoRowOne.getCell(5).setColor("100000");
					tableresultadoRowOne.getCell(5).setVerticalAlignment(XWPFVertAlign.CENTER);
					
					do
					{


			    		System.out.println(
			    				" * No. " + x
			    				+ " | Movimiento: " + movimiento.substring(0, movimiento.indexOf(";"))
			    				+ " | Cuenta Cargo: " + ctacargo.substring(0, ctacargo.indexOf(";"))
			    				+ " | Producto: " + producto.substring(0, producto.indexOf(";"))
			    				+ " | Estatus: " + status.substring(0, status.indexOf(";"))
			    				+ " | Importe: " + importe.substring(0, importe.indexOf(";"))
			    				);
			    		crearLog(
			    				" * Movimiento: " + movimiento.substring(0, movimiento.indexOf(";"))
			    				+ " | CuentaCargo: " + ctacargo.substring(0, ctacargo.indexOf(";"))
			    				+ " | Producto: " + producto.substring(0, producto.indexOf(";"))
			    				+ " | Estatus: " + status.substring(0, status.indexOf(";"))
			    				+ " | Importe: " + importe.substring(0, importe.indexOf(";"))
			    				);
			    		
			    		XWPFTableRow tableresultadoRowData = tableresultadoencabezado.createRow();
			    		tableresultadoRowData.getCell(0).setText(Integer.toString(x));
			    		tableresultadoRowData.getCell(0).setVerticalAlignment(XWPFVertAlign.CENTER);
			    		tableresultadoRowData.getCell(1).setText(movimiento.substring(0, movimiento.indexOf(";")));
			    		tableresultadoRowData.getCell(1).setVerticalAlignment(XWPFVertAlign.CENTER);
			    		tableresultadoRowData.getCell(2).setText(ctacargo.substring(0, ctacargo.indexOf(";")));
			    		tableresultadoRowData.getCell(2).setVerticalAlignment(XWPFVertAlign.CENTER);
			    		tableresultadoRowData.getCell(3).setText(producto.substring(0, producto.indexOf(";")));
			    		tableresultadoRowData.getCell(4).setText(status.substring(0, status.indexOf(";")));
						tableresultadoRowData.getCell(5).setText(importe.substring(0, importe.indexOf(";")));
						tableresultadoRowData.getCell(5).setVerticalAlignment(XWPFVertAlign.CENTER);
			    		
			    		movimiento = movimiento.substring(movimiento.indexOf(";")+1);
			    		ctacargo = ctacargo.substring(ctacargo.indexOf(";")+1);
			    		producto = producto.substring(producto.indexOf(";")+1);
			    		status = status.substring(status.indexOf(";")+1);
			    		importe = importe.substring(importe.indexOf(";")+1);
			    		x++;

					}while (status.indexOf(";") > 0);

					System.out.println("");
					crearLog("");

					if (DataConfig[b][5].equals("ENVIADO AL CLIENTE")==true)
					{
						System.out.println("* Resultado: Procesado y enviado al cliente");
						crearLog("* Resultado: Procesado y enviado al cliente");
						escribeword("* Resultado: Procesado y enviado al cliente",false,8,false,"Lucida Sans Unicode","izquierda");
					}
					else if (DataConfig[b][5].equals("DUPLICADO")==true ||DataConfig[b][5].equals("RECHAZADO")==true)
					{
						System.out.println("* Resultado: Se rechazo por duplicación o error en los archivos");
						crearLog("* Resultado: Se rechazo por duplicación o error en los archivos");
						escribeword("* Resultado: Se rechazo por duplicación o error en los archivos",false,8,false,"Lucida Sans Unicode","izquierda");
					}
					else
					{
						System.out.println("* Resultado: Al momento de evaluar aún sigue en proceso");
						crearLog("* Resultado: Al momento de evaluar aún sigue en proceso");
						escribeword("* Resultado: Al momento de evaluar aún sigue en proceso",false,8,false,"Lucida Sans Unicode","izquierda");
					}

					System.out.println("");
					crearLog("");
				}
			}
		}
		catch(NullPointerException e)
		{
		      System.out.println("Error (resultados): " + e);
		      crearLog("Error (resultados): " + e);
		      error();
		}

	}

	private static void BrowserOpen() throws IOException, InterruptedException, InvalidFormatException
	{
		String NameScreenShotTest="";
		
		try
		{
			System.out.println("");
			crearLog("");
			System.out.println("(" + hora("") + ") * El Sistema Operativo del equipo es: " + OS +
					" con una arquitectura de " + OSArch +
					" y versión de " + OSVersion);
			crearLog("(" + hora("") + ") * El Sistema Operativo del equipo es: " + OS +
					" con una arquitectura de " +OSArch +
					" y versión de " + OSVersion);

			if (Browser==1)
			{
				System.out.println("(" + hora("") + ") * Configurar el navegador Firefox");
				crearLog("(" + hora("") + ") * Configurar el navegador Firefox");
				escribeword("* Se abrirá el Navegador Firefox",false,8,false,"Lucida Sans Unicode","izquierda");
				System.out.println("");
				crearLog("");
				if (OSArch.indexOf("64")>=0)
				{
					System.setProperty("webdriver.gecko.driver","Drivers/Firefox/win64/geckodriver.exe");
				}
				else
				{
					System.setProperty("webdriver.gecko.driver","Drivers/Firefox/win32/geckodriver.exe");
				}
				
				
				FirefoxOptions options = new FirefoxOptions();
				//options.addArguments("--silent");
				driver = new FirefoxDriver(options);
			}
			else if(Browser==2)
				{
					System.out.println("(" + hora("") + ") * Configurar el navegador Internet Explorer");
					crearLog("(" + hora("") + ") * Configurar el navegador Internet Explorer");
					escribeword("* Se abrirá el Navegador Internet Explorer",false,8,false,"Lucida Sans Unicode","izquierda");
					System.out.println("");
					crearLog("");
					if (OSArch.indexOf("64")>=0)
					{
						System.setProperty("webdriver.ie.driver","Drivers/IE/win64/IEDriverServer.exe");
					}
					else
					{
						System.setProperty("webdriver.ie.driver","Drivers/IE/win32/IEDriverServer.exe");
					}
						InternetExplorerOptions options = new InternetExplorerOptions();
						//options.addArguments("--silent");
						driver = new InternetExplorerDriver();
					}
				else
				{
					System.out.println("(" + hora("") + ") * Configurar el navegador Chrome");
					crearLog("(" + hora("") + ") * Configurar el navegador Chrome");
					escribeword("Se abrira el Navegador Chrome",false,8,false,"Lucida Sans Unicode","izquierda");
					System.out.println("");
					crearLog("");
					if (OSArch.indexOf("64")>=0)
					{
						System.setProperty("webdriver.chrome.driver","Drivers/Chrome/win64/chromedriver.exe");
					}
					else
					{
						System.setProperty("webdriver.chrome.driver","Drivers/Chrome/win32/chromedriver.exe");
					}
					
					ChromeOptions options = new ChromeOptions();
					//options.addArguments("--start-maximized");
					options.addArguments("--start-fullscreen");
				    //options.addArguments("--silent");
				    driver = new ChromeDriver(options);
				}
			    
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

			System.out.println("(" + hora("") + ") 5. Abrimos la URL de Acceso al Sistema");
			crearLog("(" + hora("") + ") 5. Abrimos la URL de Acceso al Sistema");
			escribeword("* Abrimos la URL de Acceso al Sistema",false,8,false,"Lucida Sans Unicode","izquierda");

			String baseUrl = URL();

		   	//driver.manage().deleteAllCookies();
		   	driver.manage().deleteCookieNamed("JSESSIONID");
		    driver.get(baseUrl);

		    TimeUnit.SECONDS.sleep(5);
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "Pantalla_Inicio_H2H",imagen);

		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		}
		catch(NullPointerException e)
		{
		      System.out.println("Error (BrowserOpen): " + e);
		      crearLog("Error (BrowserOpen): " + e);
		      error();
		}
	}

	private static String URL() throws IOException, InterruptedException
	{
		String URL="";

		try
		{
			String Linea="";
			System.out.println("(" + hora("") + ") * Lectura del archivo de URL" + "\r\n");
			crearLog("(" + hora("") + ") * Lectura del archivo de URL" + "\r\n");
			FileReader fr = new FileReader(PathFiles + "url.txt");
		    BufferedReader br = new BufferedReader(fr);

		    while((Linea = br.readLine()) != null)
		      {
		    		URL = Linea.substring(0, Linea.indexOf(";"));
		      }
		    fr.close();
		}
		catch(NullPointerException e)
		{
		      System.out.println("Error (URL): " + e);
		      crearLog("Error (URL): " + e);
		      error();
		}

		return URL;

	}

	private static void LecturaArchivos(String FileConfig, String FilePath) throws IOException, InterruptedException
	{
		try
		{
			String LineaN="";
			String Linea="";
			System.out.println("(" + hora("") + ") 2. Lectura del archivo de configuracion" + "\r\n");
			crearLog("(" + hora("") + ") 2. Lectura del archivo de configuración" + "\r\n");
			FileReader fr = new FileReader(FilePath + FileConfig);
		    BufferedReader br = new BufferedReader(fr);

		    int i=0;
		    int j=0;

		    while((Linea = br.readLine()) != null)
		      {
		    	i=i+1;
		    	if (i>1 )
		    	 {
		    		LineaN=Linea;
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		//Obtenemos el nombre del archivo
		    		DataConfig[j][0] = LineaN.substring(0, LineaN.indexOf(";"));//+".in";
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		//Obtenemos el numero de cliente
		    		DataConfig[j][1] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		//Obtenemos la fecha
		    		DataConfig[j][2] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		//Obtenemos el usuario del sistema H2H
		    		DataConfig[j][3] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
		    		//Obtenemos la contraseña del sistema H2H
		    		DataConfig[j][4] = LineaN.substring(0, LineaN.indexOf(";"));
		    		DataConfig[j][5] = "Sin estado";
		    		TotFiles=j;
		    	 }
		    	j=j+1;
		      }

		    fr.close();
		}
		catch(Exception e)
		{
		      System.out.println("Error (LecturaArchivos): " + e);
		      crearLog("Error (LecturaArchivos): " + e);
		      error();
		}
	}

	private static void BrowserClose() throws IOException, InterruptedException
	{
		try
		{
			TimeUnit.SECONDS.sleep(15);
			System.out.println("(" + hora("") + ") * Se cierra el navegador");
			crearLog("(" + hora("") + ") * Se cierra el navegador");
			escribeword("* Se cierra el navegador",false,8,false,"Lucida Sans Unicode","izquierda");
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    System.out.println("Error (BrowserClose): " + e);
		    crearLog("Error (BrowserClose): " + e);
		}
	}

	private static void ValidaCuenta(int registro, int ciclos) throws IOException, InterruptedException
	{
		
		String NameScreenShotTest="";
		
		try
		{
			wait = new WebDriverWait(driver,100);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario");
		    crearLog("(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario");
		    escribeword("* Esperamos que se muestre el campo para ingresar el Nombre de Usuario",false,8,false,"Lucida Sans Unicode","izquierda");

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));

		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") 6. Ingresamos el Usuario " + DataConfig[registro][3]);
		    crearLog("(" + hora("") + ") 6. Ingresamos el Usuario " + DataConfig[registro][3]);
		    escribeword("1. Ingresamos el Usuario " + DataConfig[registro][3],false,8,false,"Lucida Sans Unicode","izquierda");

		    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(DataConfig[registro][3]);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario");
		    crearLog("(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario");
		    escribeword("* Esperamos que se muestre el campo para ingresar el Nombre de Usuario",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pssPassword']")));

		    System.out.println("(" + hora("") + ") 7. Ingresamos la contraseña");
		    crearLog("(" + hora("") + ") 7. Ingresamos la contraseña");
		    escribeword("2. Ingresamos la contraseña",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    driver.findElement(By.xpath("//input[@id='pssPassword']")).sendKeys(DataConfig[registro][4]);
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaLogin_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);

		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    System.out.println("(" + hora("") + ") 8. Pulsamos el botón Aceptar");
		    crearLog("(" + hora("") + ") 8. Pulsamos el boton Aceptar");
		    escribeword("3. Pulsamos el boton Aceptar",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    driver.findElement(By.id("idAceptar")).click();

		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el menú Monitoreo");
		    crearLog("(" + hora("") + ") * Esperamos que se muestre el menú Monitoreo");
		    escribeword("* Esperamos que se muestre el menú Monitoreo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#monitoreo a")));
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaInicial_"+ DataConfig[registro][0] + "(" + ciclos +")",imagen);
		    
		    TimeUnit.SECONDS.sleep(2);
		    
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");

		    System.out.println("(" + hora("") + ") 9. Abrimos el menú Monitoreo");
		    crearLog("(" + hora("") + ") 9. Abrimos el menú Monitoreo");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("4. Abrimos el menú Monitoreo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    driver.findElement(By.cssSelector("#monitoreo a")).click();

		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") 10. Pulsar en la opción Gestión Tracking de Archivo");
		    crearLog("(" + hora("") + ") 10. Pulsar en la opción Gestión Tracking de Archivo");
		    escribeword("5. Pulsar en la opción Gestión Tracking de Archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaSubMenus_"+ DataConfig[registro][0] + "(" + ciclos +")",imagen);
		    
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");

		    driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/gestiontraking/inicio.do?origen=tracking']")).click();

		    TimeUnit.SECONDS.sleep(10);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo de búsqueda de clientes");
		    crearLog("(" + hora("") + ") * Esperamos que se muestre el campo de búsqueda de clientes");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("* Esperamos que se muestre el campo de búsqueda de clientes",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codigoCliente"))).getLocation();

		    System.out.println("(" + hora("") + ") 11. Buscamos al cliente " + DataConfig[registro][1] + " que deseamos consultar el estatus del envió del archivo");
		    crearLog("(" + hora("") + ") 11. Buscamos al cliente " + DataConfig[registro][1] + " que deseamos consultar el estatus del envió del archivo");
		    escribeword("6. Buscamos al cliente " + DataConfig[registro][1] + " que deseamos consultar el estatus del envió del archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    driver.findElement(By.id("codigoCliente")).sendKeys(DataConfig[registro][1]);

		    TimeUnit.SECONDS.sleep(3);

		    driver.findElement(By.className("frameBuscadorSimple")).getLocation();
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaBusquedaCliente_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    driver.findElement(By.cssSelector("#tab tbody tr td.texto_izquierda a")).submit();

		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']")));

		    driver.findElement(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']")).getLocation();

		    TimeUnit.SECONDS.sleep(10);

		    List<WebElement> elems = driver.findElements(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']"));

		    for (WebElement rowElem : elems)
		    {
		    	List<WebElement> cells = rowElem.findElements(By.xpath("td"));

		    	if (cells.get(1).getText() == DataConfig[registro][1]);
		    	{
		    		System.out.println("(" + hora("") + ") 12. Pulsamos el total de los archivos procesados (" +cells.get(2).getText() + ")" );
		    		crearLog("(" + hora("") + ") 12. Pulsamos el total de los archivos procesados (" +cells.get(2).getText() + ")" );
		    		escribeword("7. Pulsamos el total de los archivos procesados (" +cells.get(2).getText() + ")",false,8,false,"Lucida Sans Unicode","izquierda");
		    		escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    		
		    		cells.get(2).getLocation();
		    		
		    		imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    		NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultadoBusquedaClientes_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);		    		
		    		pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");

		    		TimeUnit.SECONDS.sleep(2);

		    		cells.get(2).click();

		    	}
		    }

		    TimeUnit.SECONDS.sleep(20);

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table']/tbody/tr[@class='odd1']")));
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaBusquedaArchivo_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");

		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    Object tamanodocument = js.executeScript("return document.body.scrollHeight");
		    
		    int largo =Integer.parseInt(tamanodocument.toString());
		    int divlargo=largo/500;
	       
	        for (int i=1;i<=divlargo;i++)
	        {
	        	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        	NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultado" + i + "_" + DataConfig[registro][0] + "(" + ciclos + ")",imagen);
	    		pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
	    		escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
	        	
	        	js.executeScript("window.scrollBy(0,500)");
	        	TimeUnit.SECONDS.sleep(3);
	        }

		    List<WebElement> felems = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

		    System.out.println("(" + hora("") + ") 13. Obtenemos el Estatus del Archivo");
		    crearLog("(" + hora("") + ") 13. Obtenemos el Estatus del Archivo");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("8. Obtenemos el Estatus del Archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    int col=1;
	    	int encontrado=0;
	    	String Archivo="";


		    for (WebElement rowfElem : felems)
		    {

		    	List<WebElement> cells = rowfElem.findElements(By.xpath("td"));

		    	col=1;
		    	encontrado=0;
		    	Archivo="";

		    	for (WebElement elemt : cells)
		    	{
		    		String valor=elemt.getText();

			    	if (DataConfig[registro][0].equals(valor)==true)
			    	{
			    		encontrado = 1;
			    		Archivo = elemt.getText();
			    	}
			    	if (encontrado==1 && col==4)
			    	{
			    		
			    		elemt.getLocation();
			    		System.out.println("(" + hora("") + ") * (Validación Archivo) El archivo " + Archivo + " tiene el estatus " + elemt.getText());
			    		crearLog("(" + hora("") + ") * (Validación Archivo) El archivo " + Archivo + " tiene el estatus " + elemt.getText());
			    		escribeword("* (Validación Archivo) El archivo " + Archivo + " tiene el estatus " + elemt.getText(),false,8,false,"Lucida Sans Unicode","izquierda");
			    		DataConfig[registro][5]=elemt.getText();
			    		encontrado=0;
			    		Archivo="";
			    	}
		    		col=col+1;
		    	}
		    }
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultadoBusquedaArchivo_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
		    
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    TimeUnit.SECONDS.sleep(20);
		}

		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error (ValidaCuenta): " + e);
			crearLog("Error (ValidaCuenta): " + e);
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			takeFullScreenShot(driver, "Error (ValidaCuenta)",imagen);
			error();
		}
	}

	private static void ValidaOperaciones(int registro,  int ciclos) throws IOException, InterruptedException, InvalidFormatException
	{
		
		String NameScreenShotTest = "";
		
		try
		{
			System.out.println("(" + hora("") + ") 14. Pulsar en la opción Monitoreo > Monitor de Operaciones");
			crearLog("(" + hora("") + ") 14. Pulsar en la opción Monitoreo > Monitor de Operaciones");
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			escribeword("9. Pulsar en la opción Monitoreo > Monitor de Operaciones",false,8,false,"Lucida Sans Unicode","izquierda");
			escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
			
			driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")).getLocation();
			
		    driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")).click();
		    
		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo de búsqueda por Nombre de Archivo");
		    crearLog("(" + hora("") + ") * Esperamos que se muestre el campo de búsqueda por Nombre de Archivo");
		    escribeword("* Esperamos que se muestre el campo de búsqueda por Nombre de Archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtNombreArchivo")));

		    System.out.println("(" + hora("") + ") 15. Buscamos al cliente " + DataConfig[registro][0] + " que deseamos consultar el estatus del envió del archivo");
		    crearLog("(" + hora("") + ") 15. Buscamos al cliente " + DataConfig[registro][0] + " que deseamos consultar el estatus del envió del archivo");
		    escribeword("10. Buscamos al cliente " + DataConfig[registro][0] + " que deseamos consultar el estatus del envió del archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    driver.findElement(By.id("txtNombreArchivo")).sendKeys(DataConfig[registro][0]);
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaMonitorOperacionesResultados_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
		    
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    driver.findElement(By.id("btnConsultar")).click();

		    List<WebElement> felems =driver.findElements(By.xpath("//table[@id='tblOperaciones']/tbody/tr[@class='odd2']"));

		    System.out.println("(" + hora("") + ") * Obtenemos el Estatus del Procesamiento del Archivo");
		    crearLog("(" + hora("") + ") * Obtenemos el Estatus del Procesamiento del Archivo");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("* Obtenemos el Estatus del Procesamiento del Archivo",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");

		    String movimiento = "";
		    String ctacargo = "";
		    String producto = "";
		    String status = "";
		    String importe = "";

		    for (WebElement rowfElem : felems)
		    {
		    	List<WebElement> cells = rowfElem.findElements(By.xpath("td"));

		    	if (cells.get(6).getText().equals(DataConfig[registro][0])==true)
		    	{
		    		movimiento = movimiento + cells.get(2).getText() + ";";
		    		ctacargo = ctacargo + cells.get(3).getText() + ";";
		    		producto = producto + cells.get(5).getText() + ";";
		    		status = status + cells.get(9).getText() + ";";
		    		importe = importe + cells.get(10).getText() + ";";
		    	}
		    }

		    DataConfig[registro][6]=movimiento;
		    DataConfig[registro][7]=ctacargo;
		    DataConfig[registro][8]=producto;
		    DataConfig[registro][9]=status;
		    DataConfig[registro][10]=importe;
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultadoBusquedaArchivo_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);

		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") 16. Cerramos la sesión");
		    crearLog("(" + hora("") + ") 16. Cerramos la sesión");
		    
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword("9. Cerramos la sesión",false,8,false,"Lucida Sans Unicode","izquierda");
		    escribeword(" ",false,8,false,"Lucida Sans Unicode","izquierda");
		    
		    driver.findElement(By.id("buttonSalir")).click();
		    
		    TimeUnit.SECONDS.sleep(3);
		    
		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaCierreSesion_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
		    
		    pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
		    
		    
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("(" + hora("") + ") * No se encontro el archivo en el monitor de operaciones");
			crearLog("(" + hora("") + ") * No se encontro el archivo en el monitor de operaciones");
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			NameScreenShotTest = takeFullScreenShot(driver, "PantallaMonOperaSinResultado_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen);
			escribeword("* No se encontro el archivo en el monitor de operaciones",false,8,false,"Lucida Sans Unicode","izquierda");
			pegaimagenword(PathFiles +"Evidencias\\Pantallas\\" + NameScreenShotTest + ".png");
			OperSinResult();
		}

	}


	private static void OperSinResult() throws IOException, InterruptedException
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup_ok")));
			driver.findElement(By.id("popup_ok")).click();
		    driver.findElement(By.id("buttonSalir")).click();
		}

		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Error (ValidaOperaciones): " + e);
			crearLog("Error (ValidaOperaciones): " + e);
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			takeFullScreenShot(driver, "Error (ValidaOperaciones)",imagen);
			error();
		}
	}

	private static String hora (String hora)
	{
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("dd/MM/YYYY - HH:mm:ss");

		hora = hourFormat.format(date);
		return hora;
	}

	private static void crearLog(String Operacion) throws IOException, InterruptedException {

		try
		{

			FileWriter archivo;

	        if (new File(PathFiles + "CreateAndTransferFiles.log").exists()==false)
	        {
	        	archivo=new FileWriter(new File(PathFiles + "CreateAndTransferFiles.log"),false);
	        }

	        archivo = new FileWriter(new File(PathFiles + "CreateAndTransferFiles.log"), true);

	        archivo.write(Operacion+"\r\n");

	        archivo.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error (ValidaOperaciones): " + e);
			error();
		}
  }

	private static void error() throws InterruptedException, IOException
	{
		TimeUnit.SECONDS.sleep(20);
		
		cerrarword(PathFiles,"FOR-DES-502_H2HS_Flujo H2H Transferencia Mismo Banco");
	    System.out.println("(" + hora("") + ") * Cerramos la sesión por error presentado");
	    crearLog("(" + hora("") + ") * Cerramos la sesión por error presentado");
	    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    takeFullScreenShot(driver, "Cierre de Sesión por error presentado",imagen);
	    driver.findElement(By.id("buttonSalir")).click();
	}

	private static String takeFullScreenShot(WebDriver driver, String imageName,File imagen)

	{
		//Directorio donde quedaran las imagenes guardadas
		File directory = new File(PathFiles+"\\Evidencias\\Pantallas");

		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("dd-mm-yyyy HH-mm-ss");

		String horas = hourFormat.format(date);
		String Nombre="";

		try {
			if (directory.isDirectory()) {
				Nombre = imageName + " (" + horas + ")";
				FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()	+ "\\" + Nombre + ".png"));
			}
			else
			{
				//Se lanza la excepcion cuando no encuentre el directorio
				throw new IOException("ERROR : La ruta especificada no es un directorio!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Nombre;
	}
	
	private static void PropiedadesWord() throws IOException
	{
		
		String LineaN="", Autor="", Release="", Version="", ResponsableCambio="", CausaCambio="", FechaCambio="", Elaborado="", ClaveProyecto="", NombreProyecto="";
		FileReader fr = new FileReader(PathFiles + "DatosReporte.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i=0;
		
	    while((LineaN = br.readLine()) != null)
	      {
	    	i=i+1;
	    	if (i>1 )
	    	 {
	    		Autor = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		Release = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		Version = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		ResponsableCambio = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		CausaCambio = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		FechaCambio = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		Elaborado = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		ClaveProyecto = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    		
	    		NombreProyecto = LineaN.substring(0, LineaN.indexOf(";"));
	    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);
	    	 }
	      }

	    fr.close();
		
		POIXMLProperties props = documento.getProperties();
		org.apache.poi.POIXMLProperties.CustomProperties cp = props.getCustomProperties();
		
		if (cp != null) {
			List<CTProperty> ctProperties = cp.getUnderlyingProperties()
					.getPropertyList();
			for (CTProperty ctp : ctProperties) 
			{
				//System.out.println(ctp.getName());
				if (ctp.getName().equals("_Author"))
	            {
	            	ctp.setLpwstr(Autor);
	            }
				else if (ctp.getName().equals("Release"))
	            {
	            	ctp.setLpwstr(Release);
	            }
				else if (ctp.getName().equals("Version"))
	            {
	            	ctp.setLpwstr(Version);
	            }
				else if (ctp.getName().equals("Responsable del Cambio")) 
		        {
		                ctp.setLpwstr(ResponsableCambio);
		        }
				else if (ctp.getName().equals("Causa del Cambio"))
	            {
	            	ctp.setLpwstr(CausaCambio);
	            }
				else if (ctp.getName().equals("Fecha del Cambio"))
	            {
	            	ctp.setLpwstr(FechaCambio);
	        	}
				else if (ctp.getName().equals("Elaborado por"))
		        {
		            	ctp.setLpwstr(Elaborado);
		        }
				else if (ctp.getName().equals("Clave del Proyecto"))
		        {
		            	ctp.setLpwstr(ClaveProyecto);
		        }
				else if (ctp.getName().equals("Nombre del Proyecto"))
		        {
		            	ctp.setLpwstr(NombreProyecto);
		        }
			}
		}
		
		documento.enforceUpdateFields();
	}
	
	private static void crearword() throws InvalidFormatException, IOException
	{	
		
		fs = new FileInputStream("FormatoWord/FOR-DES-502.docx");      
		documento = new XWPFDocument(OPCPackage.open(fs));
		
		XWPFParagraph paragraph = documento.createParagraph();
		paragraph.setBorderBottom(Borders.BASIC_BLACK_DASHES);
		paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);
	    paragraph.setAlignment(ParagraphAlignment.BOTH);
	    XWPFRun runInicio = paragraph.createRun();
	    runInicio.setBold(true);
	    runInicio.setFontSize(12);
	    runInicio.setShadow(true);
	    //runInicio.setColor("000128");
	    runInicio.setText("Inicio de evidencias de la ejecución de pruebas");
	    runInicio.setFontFamily("Lucida Sans Unicode");
	    runInicio.addBreak();
	}
	
	public static void escribeword(String linea,Boolean Bold, int Font, Boolean Shadow, String FontFamily, String Alineacion )
	{
		XWPFParagraph paragraph = documento.createParagraph();
		XWPFRun runlinea = paragraph.createRun();
		runlinea.setText(linea);
		runlinea.setFontSize(Font);
		runlinea.setBold(Bold);
		runlinea.setFontFamily(FontFamily);
		runlinea.setShadow(Shadow);
		if (Alineacion.equals("Centro"))
		{
			paragraph.setAlignment(ParagraphAlignment.CENTER);
		}
		else if (Alineacion.equals("Derecha"))
		{
			paragraph.setAlignment(ParagraphAlignment.RIGHT);
		}
		else if (Alineacion.equals("Distribuida"))
		{
			paragraph.setAlignment(ParagraphAlignment.BOTH);
		}
		else
		{
			paragraph.setAlignment(ParagraphAlignment.LEFT);
		}
		
	}
	
	public static void pegaimagenword(String imagen) throws InvalidFormatException, IOException
	{
		pic = new FileInputStream(imagen);
		XWPFParagraph parrafoimage = documento.createParagraph();
		parrafoimage.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun paragraphimage = parrafoimage.createRun();
        paragraphimage.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG,imagen,Units.toEMU(400), Units.toEMU(200));
	}
	
	public static void cerrarword(String PathFiles,String FileWord) throws IOException
	{
		String docWord = PathFiles + FileWord;
		
		documento.write(new FileOutputStream(new File(docWord + ".docx")));
		fs.close();
        
	}
}


