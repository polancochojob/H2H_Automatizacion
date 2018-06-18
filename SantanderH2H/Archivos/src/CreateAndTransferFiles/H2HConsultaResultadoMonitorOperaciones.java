package CreateAndTransferFiles;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2HConsultaResultadoMonitorOperaciones {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(5) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _101832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(14) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _102003309;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _106550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(11) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _119401496;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/monitorOperaciones/paginarOperaciones.do?pag=2']")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(6) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _201832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(15) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _202003309;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(2) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _206550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(12) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _219401496;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/monitorOperaciones/paginarOperaciones.do?pag=3']")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(7) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _301832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(16) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _302003309;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(3) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _306550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(13) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _319401496;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(8) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _401832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(4) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _406550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(9) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _501832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(17) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _506550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(10) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _601832421;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(18) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _606550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(19) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _706550139;

    @FindBy(css = "#tblOperaciones tbody:nth-of-type(2) tr:nth-of-type(20) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _806550139;

    @FindBy(css = "#administracionCliente a")
    @CacheLookup
    private WebElement administracinCliente;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracionBuzon/initAdmonBuzon.do']")
    @CacheLookup
    private WebElement administracinDeBuzn;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/adminCertClient/administradorCertificados.do']")
    @CacheLookup
    private WebElement administracinDeCertificados;

    @FindBy(css = "#contratos a")
    @CacheLookup
    private WebElement administracinDeContratos;

    @FindBy(css = "#moduloAdmSscg a")
    @CacheLookup
    private WebElement administracinDeStockSperCuentaGo1;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/adminStockSG/vistaStockSCG.do']")
    @CacheLookup
    private WebElement administracinDeStockSperCuentaGo2;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/contratos/vistaAltaContrato.do']")
    @CacheLookup
    private WebElement altaDeContratos;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/tracking/enviosEdoCta/bitacora.do']")
    @CacheLookup
    private WebElement bitcoraDeEnvoDeEstadoCuenta;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/verCancelarOperaciones.do']")
    @CacheLookup
    private WebElement cancelacinDeOperaciones;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/verCat.do']")
    @CacheLookup
    private WebElement catlogoDinmico;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/planCalidad/cierreProductos.do']")
    @CacheLookup
    private WebElement cierreDeProductos;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/planCalidad/cifrarDescifrar.do']")
    @CacheLookup
    private WebElement cifradoYDescifrado;

    @FindBy(id = "btnComprobante")
    @CacheLookup
    private WebElement comprobante;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/consultaDinamica.do?cat=BIC']")
    @CacheLookup
    private WebElement consultaBics;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/consultaDinamica.do?cat=ABA']")
    @CacheLookup
    private WebElement consultaClavesAba;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/tracking/consulta/comisiones.do']")
    @CacheLookup
    private WebElement consultaComisiones;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/contratos/inicioConsultaContratos.do']")
    @CacheLookup
    private WebElement consultaContratos;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/contratos/administracionUsuarioOperante.do']")
    @CacheLookup
    private WebElement consultaContratosDeUsuario;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/tracking/pistasAuditoria/pistasAuditoria.do']")
    @CacheLookup
    private WebElement consultaPistasDeAuditora;

    @FindBy(css = "#consultaTipoCambio a")
    @CacheLookup
    private WebElement consultaTipoDeCambio;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/gestiontraking/inicio.do?origen=tracking']")
    @CacheLookup
    private WebElement consultaTrackingDeArchivo;

    @FindBy(css = "#modulotraking a")
    @CacheLookup
    private WebElement consultasYReportes;

    @FindBy(css = "#modulocontingencia a")
    @CacheLookup
    private WebElement contingencia;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/buzon/vistaBuzon.do']")
    @CacheLookup
    private WebElement creacinDeBuzn;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/gestiontraking/consultaTest.do']")
    @CacheLookup
    private WebElement cuentaBeneficiaria;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/adminCertClient/initDescargaLlaves.do']")
    @CacheLookup
    private WebElement descargaDeLlavePblicaDelCanal;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/descargaapi/consulta.do']")
    @CacheLookup
    private WebElement descargarApi;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/contingencia/contingencia.do']")
    @CacheLookup
    private WebElement envoDeArchivos;

    @FindBy(id = "btnExportar")
    @CacheLookup
    private WebElement exportar;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/backends/consultabackends.do']")
    @CacheLookup
    private WebElement gestinBackends;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/bancos/consultabancos.do']")
    @CacheLookup
    private WebElement gestinBancos;

    @FindBy(css = "#moduloBuzon a")
    @CacheLookup
    private WebElement gestinDeBuzn;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/adminCodigosPostales.do']")
    @CacheLookup
    private WebElement gestinDeCdigosPostales;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/conexioncontratos/consultaContratos.do']")
    @CacheLookup
    private WebElement gestinDeConexinDelContrato;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/consultaDinamica.do?cat=PAIS']")
    @CacheLookup
    private WebElement gestinDePaises;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/gestionCanales/consultarCanales.do']")
    @CacheLookup
    private WebElement gestinDeParmetrosDelCanal;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/protocolos/consultaprotocolos.do']")
    @CacheLookup
    private WebElement gestinDeProtocolos;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/layouts/AdministraLayout.do']")
    @CacheLookup
    private WebElement gestinLayouts;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/mensajeerror/consultamensajeserror.do']")
    @CacheLookup
    private WebElement gestinMensajesError;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/notificaciones/consultanotificaciones.do']")
    @CacheLookup
    private WebElement gestinNotificaciones;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/administracion/productos/consultaproductos.do']")
    @CacheLookup
    private WebElement gestinProductos;

    @FindBy(id = "btnExportarXls")
    @CacheLookup
    private WebElement imgxls;

    @FindBy(id = "checkAll")
    @CacheLookup
    private WebElement importeGlobal21493761;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937610;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937611;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937612;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937613;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937614;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937615;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937616;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937617;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937618;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937619;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493762;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937620;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal214937621;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493763;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493764;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493765;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493766;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493767;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493768;

    @FindBy(name = "comprobante")
    @CacheLookup
    private WebElement importeGlobal21493769;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/principal/inicio.do?login=no']")
    @CacheLookup
    private WebElement inicio;

    @FindBy(css = "#moduloadministracion a")
    @CacheLookup
    private WebElement mduloAdministracin;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")
    @CacheLookup
    private WebElement monitorDeOperaciones;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/gestiontraking/consultaSaldosReintentos.do']")
    @CacheLookup
    private WebElement monitorDeSaldos;

    @FindBy(css = "#monitoreo a")
    @CacheLookup
    private WebElement monitoreo;

    private final String pageLoadedText = "Administración de Stock Súper Cuenta Go";

    private final String pageUrl = "/h2husr/H2HUsuarios/monitorOperaciones/consultaOperaciones.do#b";

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/parametros/inicioParametrosBD.do?IO.SOS.DB=H2HParam']")
    @CacheLookup
    private WebElement parmetros;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/edoCta/vistaSolEdoCta.do']")
    @CacheLookup
    private WebElement porDemanda;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/planCalidad/reenviarArchivos.do']")
    @CacheLookup
    private WebElement reenvoDeArchivos;

    @FindBy(id = "btnRefrescar")
    @CacheLookup
    private WebElement refrescar;

    @FindBy(id = "btnRegresar")
    @CacheLookup
    private WebElement regresar;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/reportes/inicio.do']")
    @CacheLookup
    private WebElement reportes;

    @FindBy(id = "buttonSalir")
    @CacheLookup
    private WebElement salir;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/planCalidad/cambiarEstatus.do']")
    @CacheLookup
    private WebElement solicitudDeCambioDeEstatus;

    @FindBy(css = "#modulosoledocta a")
    @CacheLookup
    private WebElement solicitudDeEdoDeCuenta;

    @FindBy(css = "#solEdoCuentaContingencia a")
    @CacheLookup
    private WebElement solicitudDeEstadosDeCuenta1;

    @FindBy(css = "#solEdoCuentaContingencia a")
    @CacheLookup
    private WebElement solicitudDeEstadosDeCuenta2;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/consultaTipoCambio/tipoCambio.do']")
    @CacheLookup
    private WebElement tipoDeCambio;

    public H2HConsultaResultadoMonitorOperaciones() {
    }

    public H2HConsultaResultadoMonitorOperaciones(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HConsultaResultadoMonitorOperaciones(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HConsultaResultadoMonitorOperaciones(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click1Link01832421() {
        _101832421.click();
        return this;
    }

    /**
     * Click on 02003309 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click1Link02003309() {
        _102003309.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click1Link06550139() {
        _106550139.click();
        return this;
    }

    /**
     * Click on 19401496 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click1Link19401496() {
        _119401496.click();
        return this;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click2Link01832421() {
        _201832421.click();
        return this;
    }

    /**
     * Click on 02003309 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click2Link02003309() {
        _202003309.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click2Link06550139() {
        _206550139.click();
        return this;
    }

    /**
     * Click on 19401496 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click2Link19401496() {
        _219401496.click();
        return this;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click3Link01832421() {
        _301832421.click();
        return this;
    }

    /**
     * Click on 02003309 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click3Link02003309() {
        _302003309.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click3Link06550139() {
        _306550139.click();
        return this;
    }

    /**
     * Click on 19401496 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click3Link19401496() {
        _319401496.click();
        return this;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click4Link01832421() {
        _401832421.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click4Link06550139() {
        _406550139.click();
        return this;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click5Link01832421() {
        _501832421.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click5Link06550139() {
        _506550139.click();
        return this;
    }

    /**
     * Click on 01832421 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click6Link01832421() {
        _601832421.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click6Link06550139() {
        _606550139.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click7Link06550139() {
        _706550139.click();
        return this;
    }

    /**
     * Click on 06550139 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones click8Link06550139() {
        _806550139.click();
        return this;
    }

    /**
     * Click on Administracin Cliente Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinClienteLink() {
        administracinCliente.click();
        return this;
    }

    /**
     * Click on Administracin De Buzn Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinDeBuznLink() {
        administracinDeBuzn.click();
        return this;
    }

    /**
     * Click on Administracin De Certificados Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinDeCertificadosLink() {
        administracinDeCertificados.click();
        return this;
    }

    /**
     * Click on Administracin De Contratos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinDeContratosLink() {
        administracinDeContratos.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinDeStockSperCuentaGo1Link() {
        administracinDeStockSperCuentaGo1.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAdministracinDeStockSperCuentaGo2Link() {
        administracinDeStockSperCuentaGo2.click();
        return this;
    }

    /**
     * Click on Alta De Contratos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickAltaDeContratosLink() {
        altaDeContratos.click();
        return this;
    }

    /**
     * Click on Bitcora De Envo De Estado Cuenta Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickBitcoraDeEnvoDeEstadoCuentaLink() {
        bitcoraDeEnvoDeEstadoCuenta.click();
        return this;
    }

    /**
     * Click on Cancelacin De Operaciones Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCancelacinDeOperacionesLink() {
        cancelacinDeOperaciones.click();
        return this;
    }

    /**
     * Click on Catlogo Dinmico Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCatlogoDinmicoLink() {
        catlogoDinmico.click();
        return this;
    }

    /**
     * Click on Cierre De Productos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCierreDeProductosLink() {
        cierreDeProductos.click();
        return this;
    }

    /**
     * Click on Cifrado Y Descifrado Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCifradoYDescifradoLink() {
        cifradoYDescifrado.click();
        return this;
    }

    /**
     * Click on Comprobante Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickComprobanteLink() {
        comprobante.click();
        return this;
    }

    /**
     * Click on Consulta Bics Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaBicsLink() {
        consultaBics.click();
        return this;
    }

    /**
     * Click on Consulta Claves Aba Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaClavesAbaLink() {
        consultaClavesAba.click();
        return this;
    }

    /**
     * Click on Consulta Comisiones Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaComisionesLink() {
        consultaComisiones.click();
        return this;
    }

    /**
     * Click on Consulta Contratos De Usuario Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaContratosDeUsuarioLink() {
        consultaContratosDeUsuario.click();
        return this;
    }

    /**
     * Click on Consulta Contratos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaContratosLink() {
        consultaContratos.click();
        return this;
    }

    /**
     * Click on Consulta Pistas De Auditora Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaPistasDeAuditoraLink() {
        consultaPistasDeAuditora.click();
        return this;
    }

    /**
     * Click on Consulta Tipo De Cambio Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaTipoDeCambioLink() {
        consultaTipoDeCambio.click();
        return this;
    }

    /**
     * Click on Consulta Tracking De Archivo Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultaTrackingDeArchivoLink() {
        consultaTrackingDeArchivo.click();
        return this;
    }

    /**
     * Click on Consultas Y Reportes Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickConsultasYReportesLink() {
        consultasYReportes.click();
        return this;
    }

    /**
     * Click on Contingencia Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickContingenciaLink() {
        contingencia.click();
        return this;
    }

    /**
     * Click on Creacin De Buzn Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCreacinDeBuznLink() {
        creacinDeBuzn.click();
        return this;
    }

    /**
     * Click on Cuenta Beneficiaria Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickCuentaBeneficiariaLink() {
        cuentaBeneficiaria.click();
        return this;
    }

    /**
     * Click on Descarga De Llave Pblica Del Canal Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickDescargaDeLlavePblicaDelCanalLink() {
        descargaDeLlavePblicaDelCanal.click();
        return this;
    }

    /**
     * Click on Descargar Api Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickDescargarApiLink() {
        descargarApi.click();
        return this;
    }

    /**
     * Click on Envo De Archivos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickEnvoDeArchivosLink() {
        envoDeArchivos.click();
        return this;
    }

    /**
     * Click on Exportar Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickExportarLink() {
        exportar.click();
        return this;
    }

    /**
     * Click on Gestin Backends Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinBackendsLink() {
        gestinBackends.click();
        return this;
    }

    /**
     * Click on Gestin Bancos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinBancosLink() {
        gestinBancos.click();
        return this;
    }

    /**
     * Click on Gestin De Buzn Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDeBuznLink() {
        gestinDeBuzn.click();
        return this;
    }

    /**
     * Click on Gestin De Cdigos Postales Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDeCdigosPostalesLink() {
        gestinDeCdigosPostales.click();
        return this;
    }

    /**
     * Click on Gestin De Conexin Del Contrato Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDeConexinDelContratoLink() {
        gestinDeConexinDelContrato.click();
        return this;
    }

    /**
     * Click on Gestin De Paises Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDePaisesLink() {
        gestinDePaises.click();
        return this;
    }

    /**
     * Click on Gestin De Parmetros Del Canal Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDeParmetrosDelCanalLink() {
        gestinDeParmetrosDelCanal.click();
        return this;
    }

    /**
     * Click on Gestin De Protocolos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinDeProtocolosLink() {
        gestinDeProtocolos.click();
        return this;
    }

    /**
     * Click on Gestin Layouts Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinLayoutsLink() {
        gestinLayouts.click();
        return this;
    }

    /**
     * Click on Gestin Mensajes Error Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinMensajesErrorLink() {
        gestinMensajesError.click();
        return this;
    }

    /**
     * Click on Gestin Notificaciones Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinNotificacionesLink() {
        gestinNotificaciones.click();
        return this;
    }

    /**
     * Click on Gestin Productos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickGestinProductosLink() {
        gestinProductos.click();
        return this;
    }

    /**
     * Click on Imgxls Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickImgxlsLink() {
        imgxls.click();
        return this;
    }

    /**
     * Click on Inicio Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickInicioLink() {
        inicio.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on Mdulo Administracin Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickMduloAdministracinLink() {
        mduloAdministracin.click();
        return this;
    }

    /**
     * Click on Monitor De Operaciones Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickMonitorDeOperacionesLink() {
        monitorDeOperaciones.click();
        return this;
    }

    /**
     * Click on Monitor De Saldos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickMonitorDeSaldosLink() {
        monitorDeSaldos.click();
        return this;
    }

    /**
     * Click on Monitoreo Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickMonitoreoLink() {
        monitoreo.click();
        return this;
    }

    /**
     * Click on Parmetros Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickParmetrosLink() {
        parmetros.click();
        return this;
    }

    /**
     * Click on Por Demanda Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickPorDemandaLink() {
        porDemanda.click();
        return this;
    }

    /**
     * Click on Reenvo De Archivos Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickReenvoDeArchivosLink() {
        reenvoDeArchivos.click();
        return this;
    }

    /**
     * Click on Refrescar Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickRefrescarLink() {
        refrescar.click();
        return this;
    }

    /**
     * Click on Regresar Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickRegresarLink() {
        regresar.click();
        return this;
    }

    /**
     * Click on Reportes Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickReportesLink() {
        reportes.click();
        return this;
    }

    /**
     * Click on Salir Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickSalirLink() {
        salir.click();
        return this;
    }

    /**
     * Click on Solicitud De Cambio De Estatus Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickSolicitudDeCambioDeEstatusLink() {
        solicitudDeCambioDeEstatus.click();
        return this;
    }

    /**
     * Click on Solicitud De Edo. De Cuenta Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickSolicitudDeEdoDeCuentaLink() {
        solicitudDeEdoDeCuenta.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickSolicitudDeEstadosDeCuenta1Link() {
        solicitudDeEstadosDeCuenta1.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickSolicitudDeEstadosDeCuenta2Link() {
        solicitudDeEstadosDeCuenta2.click();
        return this;
    }

    /**
     * Click on Tipo De Cambio Link.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones clickTipoDeCambioLink() {
        tipoDeCambio.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones fill() {
        setImporteGlobal21493761CheckboxField();
        setImporteGlobal21493762CheckboxField();
        setImporteGlobal21493763CheckboxField();
        setImporteGlobal21493764CheckboxField();
        setImporteGlobal21493765CheckboxField();
        setImporteGlobal21493766CheckboxField();
        setImporteGlobal21493767CheckboxField();
        setImporteGlobal21493768CheckboxField();
        setImporteGlobal21493769CheckboxField();
        setImporteGlobal214937610CheckboxField();
        setImporteGlobal214937611CheckboxField();
        setImporteGlobal214937612CheckboxField();
        setImporteGlobal214937613CheckboxField();
        setImporteGlobal214937614CheckboxField();
        setImporteGlobal214937615CheckboxField();
        setImporteGlobal214937616CheckboxField();
        setImporteGlobal214937617CheckboxField();
        setImporteGlobal214937618CheckboxField();
        setImporteGlobal214937619CheckboxField();
        setImporteGlobal214937620CheckboxField();
        setImporteGlobal214937621CheckboxField();
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937610CheckboxField() {
        if (!importeGlobal214937610.isSelected()) {
            importeGlobal214937610.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937611CheckboxField() {
        if (!importeGlobal214937611.isSelected()) {
            importeGlobal214937611.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937612CheckboxField() {
        if (!importeGlobal214937612.isSelected()) {
            importeGlobal214937612.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937613CheckboxField() {
        if (!importeGlobal214937613.isSelected()) {
            importeGlobal214937613.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937614CheckboxField() {
        if (!importeGlobal214937614.isSelected()) {
            importeGlobal214937614.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937615CheckboxField() {
        if (!importeGlobal214937615.isSelected()) {
            importeGlobal214937615.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937616CheckboxField() {
        if (!importeGlobal214937616.isSelected()) {
            importeGlobal214937616.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937617CheckboxField() {
        if (!importeGlobal214937617.isSelected()) {
            importeGlobal214937617.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937618CheckboxField() {
        if (!importeGlobal214937618.isSelected()) {
            importeGlobal214937618.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937619CheckboxField() {
        if (!importeGlobal214937619.isSelected()) {
            importeGlobal214937619.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493761CheckboxField() {
        if (!importeGlobal21493761.isSelected()) {
            importeGlobal21493761.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937620CheckboxField() {
        if (!importeGlobal214937620.isSelected()) {
            importeGlobal214937620.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal214937621CheckboxField() {
        if (!importeGlobal214937621.isSelected()) {
            importeGlobal214937621.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493762CheckboxField() {
        if (!importeGlobal21493762.isSelected()) {
            importeGlobal21493762.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493763CheckboxField() {
        if (!importeGlobal21493763.isSelected()) {
            importeGlobal21493763.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493764CheckboxField() {
        if (!importeGlobal21493764.isSelected()) {
            importeGlobal21493764.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493765CheckboxField() {
        if (!importeGlobal21493765.isSelected()) {
            importeGlobal21493765.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493766CheckboxField() {
        if (!importeGlobal21493766.isSelected()) {
            importeGlobal21493766.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493767CheckboxField() {
        if (!importeGlobal21493767.isSelected()) {
            importeGlobal21493767.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493768CheckboxField() {
        if (!importeGlobal21493768.isSelected()) {
            importeGlobal21493768.click();
        }
        return this;
    }

    /**
     * Set Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones setImporteGlobal21493769CheckboxField() {
        if (!importeGlobal21493769.isSelected()) {
            importeGlobal21493769.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937610CheckboxField() {
        if (importeGlobal214937610.isSelected()) {
            importeGlobal214937610.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937611CheckboxField() {
        if (importeGlobal214937611.isSelected()) {
            importeGlobal214937611.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937612CheckboxField() {
        if (importeGlobal214937612.isSelected()) {
            importeGlobal214937612.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937613CheckboxField() {
        if (importeGlobal214937613.isSelected()) {
            importeGlobal214937613.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937614CheckboxField() {
        if (importeGlobal214937614.isSelected()) {
            importeGlobal214937614.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937615CheckboxField() {
        if (importeGlobal214937615.isSelected()) {
            importeGlobal214937615.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937616CheckboxField() {
        if (importeGlobal214937616.isSelected()) {
            importeGlobal214937616.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937617CheckboxField() {
        if (importeGlobal214937617.isSelected()) {
            importeGlobal214937617.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937618CheckboxField() {
        if (importeGlobal214937618.isSelected()) {
            importeGlobal214937618.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937619CheckboxField() {
        if (importeGlobal214937619.isSelected()) {
            importeGlobal214937619.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493761CheckboxField() {
        if (importeGlobal21493761.isSelected()) {
            importeGlobal21493761.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937620CheckboxField() {
        if (importeGlobal214937620.isSelected()) {
            importeGlobal214937620.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal214937621CheckboxField() {
        if (importeGlobal214937621.isSelected()) {
            importeGlobal214937621.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493762CheckboxField() {
        if (importeGlobal21493762.isSelected()) {
            importeGlobal21493762.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493763CheckboxField() {
        if (importeGlobal21493763.isSelected()) {
            importeGlobal21493763.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493764CheckboxField() {
        if (importeGlobal21493764.isSelected()) {
            importeGlobal21493764.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493765CheckboxField() {
        if (importeGlobal21493765.isSelected()) {
            importeGlobal21493765.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493766CheckboxField() {
        if (importeGlobal21493766.isSelected()) {
            importeGlobal21493766.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493767CheckboxField() {
        if (importeGlobal21493767.isSelected()) {
            importeGlobal21493767.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493768CheckboxField() {
        if (importeGlobal21493768.isSelected()) {
            importeGlobal21493768.click();
        }
        return this;
    }

    /**
     * Unset Importe Global 2149376 Checkbox field.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones unsetImporteGlobal21493769CheckboxField() {
        if (importeGlobal21493769.isSelected()) {
            importeGlobal21493769.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the H2HConsultaResultadoMonitorOperaciones class instance.
     */
    public H2HConsultaResultadoMonitorOperaciones verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
