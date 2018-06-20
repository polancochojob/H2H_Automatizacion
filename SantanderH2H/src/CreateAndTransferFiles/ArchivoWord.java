package CreateAndTransferFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.POIXMLProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.CTProperty;


public class ArchivoWord{
	
	public ArchivoWord(String PathFiles, String FileWord) {
		this.PathFiles = PathFiles;
		this.FileWord = FileWord;
	}
	
	private static InputStream pic;
	private static InputStream fs;
	private static String PathFiles;
	private static String FileWord;
	private static XWPFDocument documento;
	
	//variables para almacenar el formato y evitar pasarlo muchas veces si no cambia
	private static Boolean Bold;
	private static int Font;
	private static Boolean Shadow;
	private static String FontFamily;
	private static String Alineacion;
	
	public static void estableceFormatoTextoNormal() {
		Bold = false;
		Font = 8;
		Shadow = false;
		FontFamily = "Lucida Sans Unicode";
		Alineacion = "izquierda";
	}
	
	public static void alineaIzquierda() {
		Alineacion = "izquierda";
	}
	
	public static void alineaCentro() {
		Alineacion = "Centro";
	}
	
	public static void alineaDerecha() {
		Alineacion = "Derecha";
	}
	
	public static void alineaDistribuida() {
		Alineacion = "Distribuida";
	}
	//Metodo cambia parametro para el tamaño de fuente.
	public static void cambiaTamanoFuente(int tamano) {
		Font = tamano;
		
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
	
	public static void crearword() throws InvalidFormatException, IOException
	{	
		System.err.println("Ruta archivo:"+PathFiles + FileWord);
		fs = new FileInputStream(PathFiles + FileWord);      
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
	
	public static void escribeword(String linea)
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
	
	public static void cerrarword() throws IOException
	{
		String docWord = PathFiles + FileWord;
		
		documento.write(new FileOutputStream(new File(docWord)));
		fs.close();
        
	}

}
