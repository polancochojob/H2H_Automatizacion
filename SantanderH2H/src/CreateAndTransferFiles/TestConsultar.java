package CreateAndTransferFiles;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.openqa.selenium.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


class TestConsultar {

	private static String UserName="";
	private static String PathFiles="";
	private static String FileConfig="FileConfig.csv";
	private static String[][] DataConfig;
	private static WebDriver driver = null;
	private static String Browser;
	private static WebDriverWait wait;
	private static int TotFiles;
	private static String OS = System.getProperty("os.name").toLowerCase();
	private static String OSArch = System.getProperty("os.arch").toLowerCase();
	private static String OSVersion = System.getProperty("os.version").toLowerCase();
	private static File imagen;
	private static int ciclos = 0;
	private static int tiempociclos = 0;
	private static PrintStream originalStream;
    private static PrintStream newStream;
    private static ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
    private static PrintStream console = System.out;
    private static JavascriptExecutor js;
    private static Object tamanodocument ;
    private static String NameScreenShotTest="";
    public static String rutaCiclo;

    private static ArchivoWord archivoWord;

    static {
        originalStream = System.out;
        newStream = new PrintStream(newConsole);
        System.setOut(newStream);
    }

	public static void main(String[] args) throws Exception {

		try {
				PathFiles = args[0];
				UserName = System.getProperty("user.name");

				iniconsole();
				ambiente();
				inicio(args);
				
				String mensaje = "(" + hora("") + ") * Fin de pruebas";
				System.out.println(mensaje);
				System.setOut(console);
			}

		catch(NullPointerException e)
			{
				System.out.println("Error: " + e);
			}

	}

	private static void iniconsole() throws FileNotFoundException
	{
		File file = new File(PathFiles + "\\Evidencias\\CreateAndTransferFiles.log");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		ps.flush();
		System.setOut(ps);
	}

	private static void ambiente()
	{
		deletedirectory(new File (PathFiles + "\\Evidencias\\"));
		createdirectory(PathFiles + "\\Evidencias\\");
		createdirectory(PathFiles + "\\Evidencias\\Pantallas\\");
	}

	private static void deletedirectory(File pDirectory)
	{
	    if (!pDirectory.exists())
	    	{
	    		return;
	    	}

	    if (pDirectory.isDirectory())
	    	{
	        for (File f : pDirectory.listFiles())
	        	{
	        		deletedirectory(f);
	        	}
	    	}
	    pDirectory.delete();
	}

	private static void createdirectory (String path)
	{

		File directorio=new File(path);
		directorio.mkdir();
	}

	public static String leerproperties(String valor) throws FileNotFoundException, IOException
	{
		try
		{
			Properties p = new Properties();
			p.load(new FileReader(PathFiles +"\\config.properties"));
			valor = p.getProperty(valor);

		}
		catch (FileNotFoundException e)
		{
			System.out.println("No se encuentra el archivo de properties");
		}
		return valor;
	}

	private static void inicio(String[] args) throws Exception
	{
		System.out.println("******** Prueba de Validaci�n de procesamiento de archivos en el Sistema H2H ********" + "\r\n");
		System.out.println(" ");
		System.out.println("* Usuario ejecutor de la prueba: " + UserName);
		System.out.println(" ");
		System.out.println("(" + hora("") + ") 1. Carga de informaci�n de configuraci�n para la generaci�n de archivos");
		System.out.println(" ");
		PathFiles= args[0];

		CreateAndTransferFiles.main(PathFiles);

		System.out.println(" ");

		LecturaArchivos(FileConfig,PathFiles);

		System.out.println("(" + hora("") + ") * Se obtiene el driver del navegador para realizar la prueba");

		Browser=leerproperties("navegador");

		System.out.println("(" + hora("") + ") * Definici�n de ciclos y tiempo de espera de ejecuci�n entre ciclos");

		System.out.println(" ");

		ciclos = Integer.parseInt(leerproperties("ciclos"));
		tiempociclos = Integer.parseInt(leerproperties("tiempociclos"));

		System.out.println("(" + hora("") + ") 3. Abrir el navegador para la prueba");

		BrowserOpen();

	}

	private static void LecturaArchivos(String FileConfig, String FilePath) throws IOException, InterruptedException
	{
		try
		{
			String LineaN="";
			System.out.println("(" + hora("") + ") 5. Lectura del archivo de configuracion" + "\r\n");
			FileReader fr = new FileReader(FilePath + "\\" + FileConfig);
		    BufferedReader br = new BufferedReader(fr);

		    int i=0;
		    int j=0;

		    int NumFiles = (int) br.lines().count();

		    NumFiles = NumFiles - 1;

		    fr = new FileReader(FilePath + "\\" + FileConfig);
		    br = new BufferedReader(fr);

		    DataConfig = new String[NumFiles][20];

		    while((LineaN = br.readLine()) != null)
		      {
		    	i=i+1;
		    	if (i>1 )
		    	 {

		    		//Obtenemos el n�mero consecutivo de registros
		    		DataConfig[j][0] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);

		    		//Obtenemos el nombre del archivo
		    		DataConfig[j][1] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);

		    		//Obtenemos el nombre del archivo base
		    		DataConfig[j][2] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);

		    		//Obtenemos el n�mero de cuenta
		    		DataConfig[j][3] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);

		    		//Obtenemos el n�mero de cliente
		    		DataConfig[j][4] = LineaN.substring(0, LineaN.indexOf(";"));
		    		LineaN = LineaN.substring(LineaN.indexOf(";")+1);

		    		//Obtenemos la fecha
		    		DataConfig[j][5] = LineaN.substring(0, LineaN.indexOf(";"));

		    		//Obtenemos el usuario del sistema H2H
		    		DataConfig[j][6] = leerproperties("userh2h");

		    		//Obtenemos la contrase�a del sistema H2H
		    		DataConfig[j][7] = leerproperties("pwdh2h");

		    		//Inicializamos el estatus del archivo
		    		DataConfig[j][8] = "Sin estado";
		    		TotFiles=j;
		    		j=j+1;
		    	 }

		      }

		    fr.close();
		}
		catch(Exception e)
		{
		      System.out.println("Error (LecturaArchivos): " + e);
		}
	}

	private static void BrowserOpen() throws IOException, InterruptedException, InvalidFormatException
	{


		try
		{
			System.out.println("");
			System.out.println("(" + hora("") + ") * El Sistema Operativo del equipo es: " + OS +
					" con una arquitectura de " + OSArch +
					" y versi�n de " + OSVersion);

			if (Browser=="firefox")
			{
				System.out.println("(" + hora("") + ") * Configurar el driver del navegador Firefox");
				System.out.println("");
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
				options.addArguments("--start-fullscreen");
				//options.addArguments("--start-maximized");
				driver = new FirefoxDriver(options);
			}
			else if(Browser=="ie")
				{
					System.out.println("(" + hora("") + ") * Configurar el driver del navegador Internet Explorer");
					System.out.println("");
					if (OSArch.indexOf("64")>=0)
					{
						System.setProperty("webdriver.ie.driver","Drivers/IE/win64/IEDriverServer.exe");
					}
					else
					{
						System.setProperty("webdriver.ie.driver","Drivers/IE/win32/IEDriverServer.exe");
					}
						InternetExplorerOptions options = new InternetExplorerOptions();
						driver = new InternetExplorerDriver();
					}
				else
				{
					System.out.println("(" + hora("") + ") * Configurar el driver del navegador Chrome");
					System.out.println("");
					if (OSArch.indexOf("64")>=0)
					{
						System.setProperty("webdriver.chrome.driver","Drivers/Chrome/win64/chromedriver.exe");
					}
					else
					{
						System.setProperty("webdriver.chrome.driver","Drivers/Chrome/win32/chromedriver.exe");
					}

					ChromeOptions options = new ChromeOptions();
					//options.addArguments("--silent");
					options.addArguments("--start-fullscreen");
					//options.addArguments("--start-maximized");
				    driver = new ChromeDriver(options);
				}

			System.out.println("(" + hora("") + ") 4. Abrimos la URL de Acceso al Sistema H2H");

			String baseUrl = leerproperties("url");

		   	//driver.manage().deleteAllCookies();
		   	driver.manage().deleteCookieNamed("JSESSIONID");
		    driver.get(baseUrl);

		    TimeUnit.SECONDS.sleep(5);

		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		    NameScreenShotTest = takeFullScreenShot(driver, "Pantalla_Inicio_H2H",imagen,"");

		    TimeUnit.SECONDS.sleep(5);

		    ejecutarciclos();

		    BrowserClose();

		}
		catch(NullPointerException e)
		{
		      System.out.println("Error (BrowserOpen): " + e);
		}
	}

	private static void BrowserClose() throws IOException, InterruptedException
	{
		try
		{
			TimeUnit.SECONDS.sleep(5);
			System.out.println("(" + hora("") + ") * Se cierra el navegador");
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		    System.out.println("Error (BrowserClose): " + e);
		}
	}

	private static void ejecutarciclos() throws InterruptedException, IOException, InvalidFormatException
	{
		for (int c=1; c <=ciclos;c++)
		{
			System.out.println("(" + hora("") + ") * Inicio del Ciclo: " + c);

			String ruta = PathFiles + "\\Evidencias\\Pantallas\\Ciclo" + c;

			createdirectory(ruta);

			ValidarArchivos(c);

			System.out.println("(" + hora("") + ") * Fin de la validaci�n de los archivos en el ciclo " + c);

			if (c < ciclos)
			{

				System.out.println("(" + hora("") + ") * Inicio del tiempo de espera del ciclo: " + c);

				TimeUnit.MINUTES.sleep(tiempociclos);

				System.out.println("(" + hora("") + ") * Fin del tiempo de espera del ciclo: " + c);

			}

		}
	}

	private static void copiaPlantillaAruta(String origen, String destino) {
		File archivoOrigen = new File(origen);
		Path archivoDestino = Paths.get(destino);

		try {
			Files.copy(archivoOrigen.toPath(), archivoDestino,
			        StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void ValidaCuenta(int registro, int ciclo) throws IOException, InterruptedException
	{

		String ubicacion = "\\Ciclo" + ciclo + "\\" + DataConfig[registro][1].toString() + "\\";
		String nombreArchivoImagenesDeCadaCiclo = "FOR-DES-502_H2HS_Flujo H2H Transferencia Mismo Banco.docx";
		String mensaje,mensajeword;
		int divlargo;

		String archivoOrigen = PathFiles + "\\FormatoWord\\plantilla.docx";

		try
		{
			rutaCiclo = PathFiles + "\\Evidencias\\Pantallas\\Ciclo" + ciclo + "\\" + DataConfig[registro][1].toString()  +"\\";
			createdirectory(rutaCiclo);

			copiaPlantillaAruta(archivoOrigen, rutaCiclo + nombreArchivoImagenesDeCadaCiclo);

			archivoWord = new ArchivoWord(rutaCiclo, nombreArchivoImagenesDeCadaCiclo);
			ArchivoWord.crearword();
			ArchivoWord.estableceFormatoTextoNormal();
			ArchivoWord.PropiedadesWord();

			wait = new WebDriverWait(driver,100);
		    
		    mensaje = "(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario";
		    System.out.println(mensaje);
		    
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			NameScreenShotTest = takeFullScreenShot(driver, "PantallaLogin",imagen,ubicacion);

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtUsername']")));

		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") 6. Ingresamos el Usuario " + DataConfig[registro][6]);

		    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(DataConfig[registro][6]);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo para ingresar el Nombre de Usuario");

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pssPassword']")));

		    System.out.println("(" + hora("") + ") 7. Ingresamos la contrase�a");

		    driver.findElement(By.xpath("//input[@id='pssPassword']")).sendKeys(DataConfig[registro][7]);
		    
		    mensajeword= "En la pantalla de autenticaci�n se ingresa el usuario y contrase�a";
			ArchivoWord.escribeword(mensajeword);
			ArchivoWord.escribeword("");

		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaLoginIngreso",imagen,ubicacion);
			ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest +".png");

		    System.out.println("(" + hora("") + ") 8. Pulsamos el bot�n Aceptar");

		    driver.findElement(By.id("idAceptar")).click();

		    TimeUnit.SECONDS.sleep(5);

		    if (driver.findElement(By.className("pageTitle")).getText().contains("DUPLICADA"))
		    {
		    	System.out.println("(" + hora("") + ") * Sesion Duplicada");
		    	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			    NameScreenShotTest = takeFullScreenShot(driver, "PantallaSesionDuplicada",imagen,ubicacion);
			    DataConfig[registro][9]="Error";
			    
			    mensajeword= "Incidencia: La sesi�n de encuentra duplicada";
			    ArchivoWord.escribeword("");
				ArchivoWord.escribeword(mensajeword);
				ArchivoWord.escribeword("");
				ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest +".png");

		    }
		    else
		    {

		    	DataConfig[registro][9]="";
		    	System.out.println("(" + hora("") + ") * Esperamos que se muestre el men� Monitoreo");

		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#monitoreo a")));

		    	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    	NameScreenShotTest = takeFullScreenShot(driver, "PantallaInicial",imagen,ubicacion);

		    	TimeUnit.SECONDS.sleep(2);

		    	System.out.println("(" + hora("") + ") 9. Abrimos el men� Monitoreo");

		    	driver.findElement(By.cssSelector("#monitoreo a")).click();

		    	TimeUnit.SECONDS.sleep(5);

		    	System.out.println("(" + hora("") + ") 10. Pulsar en la opci�n Gesti�n Tracking de Archivo");

		    	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    	NameScreenShotTest = takeFullScreenShot(driver, "PantallaSubMenus",imagen,ubicacion);

		    	driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/gestiontraking/inicio.do?origen=tracking']")).click();

		    	TimeUnit.SECONDS.sleep(10);

		    	System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo de b�squeda de clientes");

		    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("codigoCliente"))).getLocation();

		    	System.out.println("(" + hora("") + ") 11. Buscamos al cliente " + DataConfig[registro][4] + " que deseamos consultar el estatus del envi� del archivo");
		    	
		    	System.out.println("");
			    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    NameScreenShotTest = takeFullScreenShot(driver, "PantallaLoginIngreso",imagen,ubicacion);
			    ArchivoWord.escribeword("");
			    ArchivoWord.escribeword("Se muestra la pantalla de busqueda de clientes y tabla de resultados sin filtrar");
				ArchivoWord.escribeword("");
		    	
		    	divlargo = Scroll("PantallaTotalClientes",ciclo,registro,ubicacion);

		    	for (int i=1;i<=divlargo;i++)
		    	{
		    		NameScreenShotTest = "PantallaTotalClientes" + i;
		    		ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");
		    	}
		    	
			    driver.findElement(By.id("codigoCliente")).sendKeys(DataConfig[registro][4]);

			    TimeUnit.SECONDS.sleep(3);

			    driver.findElement(By.className("frameBuscadorSimple")).getLocation();

			    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    NameScreenShotTest = takeFullScreenShot(driver, "PantallaBusquedaCliente",imagen,ubicacion);
			    
			    ArchivoWord.escribeword("");
			    ArchivoWord.escribeword("Pantalla de busqueda del cliente");
				ArchivoWord.escribeword("");
			    ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");

			    driver.findElement(By.cssSelector("#tab tbody tr td.texto_izquierda a")).submit();

			    TimeUnit.SECONDS.sleep(3);

			    //Si la busquedano encuentra nada entonces busca la ventana de error

			    List<WebElement> ElementosPoput = driver.findElements(By.id("popup_container"));

			    if (ElementosPoput .size() >0)
			    	{
				    	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    	NameScreenShotTest = takeFullScreenShot(driver, "PantallaErrorNoSeEncuentraCliente",imagen,ubicacion);
				    	driver.findElement(By.id("popup_ok")).click();
				    	
				    	ArchivoWord.escribeword("");
					    ArchivoWord.escribeword("Incidencia: No se encuentro el n�mero del cliente");
						ArchivoWord.escribeword("");
					    ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");

				    	System.out.println("(" + hora("") + ") * No se encuentra el cliente " + DataConfig[registro][4]);
				    	driver.findElement(By.id("buttonSalir")).click();
			    	}
			    else
			    {
				    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']")));

				    driver.findElement(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']")).getLocation();

				    TimeUnit.SECONDS.sleep(10);

				    divlargo = Scroll("PantallaTotalTransaccionesCliente",ciclo,registro,ubicacion);
				    
				    ArchivoWord.escribeword("");
				    ArchivoWord.escribeword("Total de Transacciones realizadas por el Cliente");
					ArchivoWord.escribeword("");

			    	for (int i=1;i<=divlargo;i++)
			    	{
			    		NameScreenShotTest = "PantallaTotalTransaccionesCliente" + i;
			    		ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");
			    	}

				    List<WebElement> elems = driver.findElements(By.xpath("//table[@class='table_wrap']/tbody/tr[@class='odd1']"));

				    for (WebElement rowElem : elems)
				    {
				    	List<WebElement> cells = rowElem.findElements(By.xpath("td"));

				    	if (cells.get(1).getText() == DataConfig[registro][4]);
				    	{
				    		System.out.println("(" + hora("") + ") 12. Pulsamos el total de los archivos procesados (" + cells.get(2).getText() + ")" );

				    		cells.get(2).getLocation();

				    		imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    		NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultadoBusquedaClientes",imagen,ubicacion);

				    		TimeUnit.SECONDS.sleep(2);

				    		//cells.get(2).submit();

				    		cells.get(2).click();

				    	}
				    }

				    TimeUnit.SECONDS.sleep(20);

				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table']/tbody/tr[@class='odd1']")));

				    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    NameScreenShotTest = takeFullScreenShot(driver, "PantallaBusquedaArchivo",imagen,ubicacion);

				    divlargo =  Scroll("PantallaResultado",ciclo,registro,ubicacion);
				    
				    ArchivoWord.escribeword("");
				    ArchivoWord.escribeword("Pantalla del total de archivos cargados para el cliente");
					ArchivoWord.escribeword("");

			    	for (int i=1;i<=divlargo;i++)
			    	{
			    		NameScreenShotTest = "PantallaResultado" + i;
			    		ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");
			    	}

				    List<WebElement> felems = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

				    System.out.println("(" + hora("") + ") 13. Obtenemos el Estatus del Archivo");

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
				    		System.out.println("(" + hora("") + ") * (Validaci�n Archivo) El archivo " + Archivo + " tiene el estatus " + elemt.getText());
				    		DataConfig[registro][5]=elemt.getText();
				    		encontrado=0;
				    		Archivo="";
				    	}
			    		col=col+1;
				    	}
				    }

				    TimeUnit.SECONDS.sleep(20);

				    }
		    	}
			}

			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Error (ValidaCuenta): " + e);
				imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				takeFullScreenShot(driver, "Error (ValidaCuenta)",imagen,ubicacion);
				driver.findElement(By.id("buttonSalir")).click();
			}
	}

	private static void ValidarArchivos(int ciclo) throws IOException, InterruptedException, InvalidFormatException
	{

		for (int a=0;a<=TotFiles;a++)
		{
			if (DataConfig[a][1].equals(null)==true)
			{
				a=TotFiles;
			}
			else
			{
				if (DataConfig[a][8]!="PROCESADO" ||DataConfig[a][8]!="DUPLICADO")
				{
					ValidaCuenta(a,ciclo);

					if (DataConfig[a][9].equals(""))
					{
						ValidaOperaciones(a,ciclo);
					}
				}
				else
				{
					System.out.println("(" + hora("") + ") * La cuenta " + DataConfig[a][3] + " con el archivo " +  DataConfig[a][1] + "tiene el estatus final " + DataConfig[a][8]);
				}
			}

			Resultados(TotFiles,a);
			
			ArchivoWord.escribeword("");
			ArchivoWord.escribeword("Fin de la prueba");

		    ArchivoWord.cerrarword();
		}
	}

	private static void ValidaOperaciones(int registro,  int ciclo) throws IOException, InterruptedException, InvalidFormatException
	{

		String ubicacion = "\\Ciclo" + ciclo + "\\" + DataConfig[registro][1].toString() + "\\";

		try
		{
			System.out.println("(" + hora("") + ") 14. Pulsar en la opci�n Monitoreo > Monitor de Operaciones");

			TimeUnit.SECONDS.sleep(2);

			driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")).getLocation();
		    driver.findElement(By.cssSelector("a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")).click();

		    TimeUnit.SECONDS.sleep(5);

		    System.out.println("(" + hora("") + ") * Esperamos que se muestre el campo de b�squeda por Nombre de Archivo");

		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtNombreArchivo")));
		    
		    String mensajeword= "Pantalla de busqueda de archivos en la secci�n de Monitoreo > Operaciones";
		    ArchivoWord.escribeword("");
		    ArchivoWord.escribeword(mensajeword);
			ArchivoWord.escribeword("");

		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaMonitorOperacionesBusquedorArchivo",imagen,ubicacion);
			ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest +".png");

		    System.out.println("(" + hora("") + ") 15. Buscamos el archivo " + DataConfig[registro][4] + " que deseamos consultar los estatus de sus movimientos");

		    driver.findElement(By.id("txtNombreArchivo")).sendKeys(DataConfig[registro][1]);

		    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    NameScreenShotTest = takeFullScreenShot(driver, "PantallaMonitorOperacionesBusqueda",imagen,ubicacion);
		    
		    mensajeword= "Busqueda del archivo " + DataConfig[registro][1] + " en la secci�n de Monitoreo > Operaciones para revisar estatus de los movimientos";
			ArchivoWord.escribeword("");
		    ArchivoWord.escribeword(mensajeword);
			ArchivoWord.escribeword("");
			ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest +".png");

		    driver.findElement(By.id("btnConsultar")).click();

		    List<WebElement> ElementosPoput = driver.findElements(By.id("popup_container"));

		    if (ElementosPoput.size()>0)
		    	{
		    		TimeUnit.SECONDS.sleep(2);
		    		imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    	NameScreenShotTest = takeFullScreenShot(driver, "PantallaErrorArchivo",imagen,ubicacion);
			    	
			    	mensajeword= "No se encuentra el archivo " + DataConfig[registro][4];
					ArchivoWord.escribeword("");
				    ArchivoWord.escribeword(mensajeword);
					ArchivoWord.escribeword("");
					ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest +".png");
			    	
			    	driver.findElement(By.id("popup_ok")).click();

			    	System.out.println("(" + hora("") + ") * No se encuentra registros del archivo " + DataConfig[registro][1]);
			    	driver.findElement(By.id("buttonSalir")).click();
			    	DataConfig[registro][9]="Error";
		    	}
		    else {

		    	DataConfig[registro][9]="";

			    List<WebElement> felems =driver.findElements(By.xpath("//table[@id='tblOperaciones']/tbody/tr[@class='odd2']"));

			    System.out.println("(" + hora("") + ") * Obtenemos el Estatus del Procesamiento del Archivo");

			    String movimiento = "";
			    String ctacargo = "";
			    String producto = "";
			    String status = "";
			    String importe = "";

			    int divlargo = Scroll("PantallaTotalMovArchivo",ciclo,registro,ubicacion);
			    
			    ArchivoWord.escribeword("");
			    ArchivoWord.escribeword("Movimientos realizados con el archivo buscado");
				ArchivoWord.escribeword("");

		    	for (int i=1;i<=divlargo;i++)
		    	{
		    		NameScreenShotTest = "PantallaTotalMovArchivo" + i;
		    		ArchivoWord.pegaimagenword(rutaCiclo + NameScreenShotTest + ".png");
		    	}

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

			    DataConfig[registro][10]=movimiento;
			    DataConfig[registro][11]=ctacargo;
			    DataConfig[registro][12]=producto;
			    DataConfig[registro][13]=status;
			    DataConfig[registro][14]=importe;

			    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			    NameScreenShotTest = takeFullScreenShot(driver, "PantallaResultadoBusquedaArchivo",imagen,ubicacion);

			    TimeUnit.SECONDS.sleep(5);

			    System.out.println("(" + hora("") + ") 16. Cerramos la sesi�n");

			    driver.findElement(By.id("buttonSalir")).click();

			    TimeUnit.SECONDS.sleep(3);

			    imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			    NameScreenShotTest = takeFullScreenShot(driver, "PantallaCierreSesion",imagen,ubicacion);
		    }
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("(" + hora("") + ") * No se encontro el archivo en el monitor de operaciones");
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			NameScreenShotTest = takeFullScreenShot(driver, "PantallaMonOperaSinResultado_"+ DataConfig[registro][0] + "(" + ciclos + ")",imagen,ubicacion);
			OperSinResult(ubicacion);
		}

	}

	private static void Resultados(int TotFiles,int b) throws IOException, InterruptedException
	{
		try
		{
			System.out.println("");
			System.out.println("Los resultados de las validaciones de las cuentas y sus archivos son las siguientes:");
			System.out.println("");

//			for (int b=0;b<=TotFiles;b++)
//			{
				if (!DataConfig[b][0].equals(null))
				{
					System.out.println("* Cuenta: " + DataConfig[b][3]);
					System.out.println("* Archivo: " + DataConfig[b][1]);
					System.out.println("* Estado: " + DataConfig[b][8]);
					System.out.println("* Estado de los movimientos del Archivo: \r\n");

					if (DataConfig[b][10].equals("")==false)
					{

						String movimiento = DataConfig[b][10].toString();
						String ctacargo = DataConfig[b][11].toString();
						String producto = DataConfig[b][12].toString();
						String status = DataConfig[b][13].toString();
						String importe = DataConfig[b][14].toString();

						System.out.println(status);

						int x=1;

						/*
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
						*/

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
				    		/*
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
				    		*/

				    		movimiento = movimiento.substring(movimiento.indexOf(";")+1);
				    		ctacargo = ctacargo.substring(ctacargo.indexOf(";")+1);
				    		producto = producto.substring(producto.indexOf(";")+1);
				    		status = status.substring(status.indexOf(";")+1);
				    		importe = importe.substring(importe.indexOf(";")+1);
				    		x++;

						}while (status.indexOf(";") > 0);
					}

					System.out.println("");

					if (DataConfig[b][8].equals("ENVIADO AL CLIENTE")==true)
					{
						System.out.println("* Resultado: Procesado y enviado al cliente");
					}
					else if (DataConfig[b][8].equals("DUPLICADO")==true ||DataConfig[b][8].equals("RECHAZADO")==true)
					{
						System.out.println("* Resultado: Se rechazo por duplicaci�n o error en los archivos");
					}
					else
					{
						System.out.println("* Resultado: Al momento de evaluar a�n sigue en proceso");
					}

					System.out.println("");
				}
			//}
		}
		catch(NullPointerException e)
		{
		      System.out.println("Error (resultados): " + e);
		}

	}

	private static void OperSinResult(String ubicacion) throws IOException, InterruptedException
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
			imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			takeFullScreenShot(driver, "Error (ValidaOperaciones)",imagen,ubicacion);
		}
	}


	private static String takeFullScreenShot(WebDriver driver, String imageName,File imagen, String ubicacion)

	{
		//Directorio donde quedaran las imagenes guardadas
		File directory = new File(PathFiles+"\\Evidencias\\Pantallas\\" + ubicacion);

		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("dd-mm-yyyy HH-mm-ss");

		String horas = hourFormat.format(date);
		String Nombre="";

		try {
			if (directory.isDirectory()) {
				Nombre = imageName;
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

	private static int Scroll (String Nombre,int ciclos, int registro, String ubicacion) throws InvalidFormatException, IOException, InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    Object tamanodocument = js.executeScript("return document.body.scrollHeight");

	    int largo =Integer.parseInt(tamanodocument.toString());
	    int divlargo=largo/400;

        for (int i=1;i<=divlargo;i++)
        {
        	imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        	NameScreenShotTest = takeFullScreenShot(driver, Nombre + i,imagen,ubicacion);

        	js.executeScript("window.scrollBy(0,500)");
        	TimeUnit.SECONDS.sleep(3);
        }
        
        return divlargo;
	}

	private static String hora (String hora)
	{
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("dd/MM/YYYY - HH:mm:ss");

		hora = hourFormat.format(date);
		return hora;
	}
}


