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

public class CrearReporte {
	
	private static XWPFDocument documento;
	private static InputStream fs;
	private static InputStream pic;
	private static String PathFiles;
	
	public static void Reporte(String PathFiles) throws InvalidFormatException, IOException
	{
		PathFiles=PathFiles + "\\";
		System.out.println("RUTA: " + PathFiles);
		CrearWord();
		PropiedadesWord();
		CerrarWord(PathFiles,"FOR-DES-502_H2HS_Flujo H2H Transferencia Mismo Banco");
	}
	
	private static void CrearWord() throws InvalidFormatException, IOException
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
	
	private static void EscribeWord(String linea,Boolean Bold, int Font, Boolean Shadow, String FontFamily, String Alineacion )
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
	
	private static void PegaImagenWord(String imagen) throws InvalidFormatException, IOException
	{
		pic = new FileInputStream(imagen);
		XWPFParagraph parrafoimage = documento.createParagraph();
		parrafoimage.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun paragraphimage = parrafoimage.createRun();
        paragraphimage.addPicture(pic, XWPFDocument.PICTURE_TYPE_PNG,imagen,Units.toEMU(400), Units.toEMU(200));
	}
	
	private static void PropiedadesWord() throws IOException
	{
		
		String LineaN="", Autor="", Release="", Version="", ResponsableCambio="", CausaCambio="", FechaCambio="", Elaborado="", ClaveProyecto="", NombreProyecto="";
	    
		Autor = TestConsultar.leerproperties("autor");
		Release = TestConsultar.leerproperties("release");
		Version = TestConsultar.leerproperties("version");
		ResponsableCambio = TestConsultar.leerproperties("responsablecambio");
		CausaCambio = TestConsultar.leerproperties("causacambio");
		FechaCambio = TestConsultar.leerproperties("fechacambio");
		Elaborado = TestConsultar.leerproperties("elaborado");
		ClaveProyecto = TestConsultar.leerproperties("claveproyecto");
		NombreProyecto = TestConsultar.leerproperties("nombreproyecto");
		
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
	
	private static void CerrarWord(String PathFiles,String FileWord) throws IOException
	{
		String docWord = PathFiles + FileWord;
		
		System.out.println("DOC: " + docWord + ".docx");
		
		documento.write(new FileOutputStream(new File(docWord + ".docx")));
		fs.close();
        
	}
	
	
}
