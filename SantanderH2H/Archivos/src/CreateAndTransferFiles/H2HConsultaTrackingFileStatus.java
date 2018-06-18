package CreateAndTransferFiles;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2HConsultaTrackingFileStatus {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#tab tbody tr:nth-of-type(3) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "#tab tbody tr:nth-of-type(4) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#tab tbody tr:nth-of-type(2) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _12;

    @FindBy(css = "#tab tbody tr:nth-of-type(9) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _20;

    @FindBy(css = "#tab tbody tr:nth-of-type(5) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _21;

    @FindBy(css = "#FormularioNivelArchivo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div.contentPieContenedor table tbody tr td a:nth-of-type(2)")
    @CacheLookup
    private WebElement _22;

    @FindBy(css = "#FormularioNivelArchivo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div.contentPieContenedor table tbody tr td a:nth-of-type(3)")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "#tab tbody tr:nth-of-type(6) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _31;

    @FindBy(css = "#tab tbody tr:nth-of-type(8) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _41;

    @FindBy(css = "#tab tbody tr:nth-of-type(7) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement _42;

    @FindBy(css = "#FormularioNivelArchivo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div.contentPieContenedor table tbody tr td a:nth-of-type(1)")
    @CacheLookup
    private WebElement _51;

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

    @FindBy(id = "btnConsultaNivArch")
    @CacheLookup
    private WebElement buscar;

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

    @FindBy(id = "nombreArchivo")
    @CacheLookup
    private WebElement clientebancoSantanderMexicoSaRh;

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

    @FindBy(css = "#FormularioNivelArchivo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div.contentPieContenedor table tbody tr:nth-of-type(1) td:nth-of-type(3) span a")
    @CacheLookup
    private WebElement exportar;

    @FindBy(css = "#tab tbody tr:nth-of-type(45) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement fn18041800189897618744Cnac;

    @FindBy(css = "#tab tbody tr:nth-of-type(37) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement fnj18041800289897618744Cnac;

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

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/principal/inicio.do?login=no']")
    @CacheLookup
    private WebElement inicio;

    @FindBy(css = "#tab tbody tr:nth-of-type(7) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement jerbtvib20180518004Inter;

    @FindBy(css = "#tab tbody tr:nth-of-type(1) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement jerbtvib20180522001Inter;

    @FindBy(css = "#tab tbody tr:nth-of-type(11) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement jrbtvmblc1805080001Inter;

    @FindBy(css = "#moduloadministracion a")
    @CacheLookup
    private WebElement mduloAdministracin;

    @FindBy(css = "#tab tbody tr:nth-of-type(35) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement mn18041800189897618744Cnac;

    @FindBy(css = "#tab tbody tr:nth-of-type(33) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement mnd18041800189897618744Cnac;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/monitorOperaciones/monitorOperaciones.do']")
    @CacheLookup
    private WebElement monitorDeOperaciones;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/gestiontraking/consultaSaldosReintentos.do']")
    @CacheLookup
    private WebElement monitorDeSaldos;

    @FindBy(css = "#monitoreo a")
    @CacheLookup
    private WebElement monitoreo;

    @FindBy(css = "#tab tbody tr:nth-of-type(23) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement multi20180423001In;

    @FindBy(css = "#tab tbody tr:nth-of-type(17) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement multi20180423002In;

    private final String pageLoadedText = "Consulta Tracking de Archivo - Nivel Archivo";

    private final String pageUrl = "/h2husr/H2HUsuarios/gestiontraking/consultaTrakingNivelArchivo.do#b";

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

    @FindBy(css = "#FormularioNivelArchivo div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div.contentPieContenedor table tbody tr:nth-of-type(1) td:nth-of-type(1) span a")
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

    @FindBy(css = "#tab tbody tr:nth-of-type(15) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement sori23042018banamexspid001bBanam;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/consultaTipoCambio/tipoCambio.do']")
    @CacheLookup
    private WebElement tipoDeCambio;

    @FindBy(css = "#tab tbody tr:nth-of-type(43) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement tran180417sant1mod001489897618801Cafi;

    @FindBy(css = "#tab tbody tr:nth-of-type(9) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement tran180509cb12105sant001Inter;

    @FindBy(css = "#tab tbody tr:nth-of-type(5) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement tran201705233001Enlspei;

    @FindBy(css = "#tab tbody tr:nth-of-type(3) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement tran201705233002Enlspei;

    @FindBy(css = "#tab tbody tr:nth-of-type(47) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement trans17042018mod01089897618801Cint;

    @FindBy(css = "#tab tbody tr:nth-of-type(51) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement trans17042018santd80025263955Camn;

    @FindBy(css = "#tab tbody tr:nth-of-type(49) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement trans18042018mod00889897618888Cint;

    @FindBy(css = "#tab tbody tr:nth-of-type(41) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement trans18042018mod01589897618892Camn;

    @FindBy(css = "#tab tbody tr:nth-of-type(39) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement trans18042018mod01689897618888Cami;

    @FindBy(css = "#tab tbody tr:nth-of-type(31) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement transpid190418001In;

    @FindBy(css = "#tab tbody tr:nth-of-type(29) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement transpid190418003In;

    @FindBy(css = "#tab tbody tr:nth-of-type(13) td:nth-of-type(1) a")
    @CacheLookup
    private WebElement uayttrans24042018nibgz003In;

    public H2HConsultaTrackingFileStatus() {
    }

    public H2HConsultaTrackingFileStatus(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HConsultaTrackingFileStatus(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HConsultaTrackingFileStatus(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 0 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click1Link0() {
        _10.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click1Link1() {
        _11.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click1Link2() {
        _12.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click2Link0() {
        _20.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click2Link1() {
        _21.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click2Link2() {
        _22.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click3Link1() {
        _31.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click4Link1() {
        _41.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus click5Link1() {
        _51.click();
        return this;
    }

    /**
     * Click on Administracin Cliente Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinClienteLink() {
        administracinCliente.click();
        return this;
    }

    /**
     * Click on Administracin De Buzn Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinDeBuznLink() {
        administracinDeBuzn.click();
        return this;
    }

    /**
     * Click on Administracin De Certificados Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinDeCertificadosLink() {
        administracinDeCertificados.click();
        return this;
    }

    /**
     * Click on Administracin De Contratos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinDeContratosLink() {
        administracinDeContratos.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinDeStockSperCuentaGo1Link() {
        administracinDeStockSperCuentaGo1.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAdministracinDeStockSperCuentaGo2Link() {
        administracinDeStockSperCuentaGo2.click();
        return this;
    }

    /**
     * Click on Alta De Contratos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickAltaDeContratosLink() {
        altaDeContratos.click();
        return this;
    }

    /**
     * Click on Bitcora De Envo De Estado Cuenta Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickBitcoraDeEnvoDeEstadoCuentaLink() {
        bitcoraDeEnvoDeEstadoCuenta.click();
        return this;
    }

    /**
     * Click on Buscar Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickBuscarLink() {
        buscar.click();
        return this;
    }

    /**
     * Click on Cancelacin De Operaciones Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCancelacinDeOperacionesLink() {
        cancelacinDeOperaciones.click();
        return this;
    }

    /**
     * Click on Catlogo Dinmico Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCatlogoDinmicoLink() {
        catlogoDinmico.click();
        return this;
    }

    /**
     * Click on Cierre De Productos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCierreDeProductosLink() {
        cierreDeProductos.click();
        return this;
    }

    /**
     * Click on Cifrado Y Descifrado Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCifradoYDescifradoLink() {
        cifradoYDescifrado.click();
        return this;
    }

    /**
     * Click on Consulta Bics Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaBicsLink() {
        consultaBics.click();
        return this;
    }

    /**
     * Click on Consulta Claves Aba Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaClavesAbaLink() {
        consultaClavesAba.click();
        return this;
    }

    /**
     * Click on Consulta Comisiones Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaComisionesLink() {
        consultaComisiones.click();
        return this;
    }

    /**
     * Click on Consulta Contratos De Usuario Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaContratosDeUsuarioLink() {
        consultaContratosDeUsuario.click();
        return this;
    }

    /**
     * Click on Consulta Contratos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaContratosLink() {
        consultaContratos.click();
        return this;
    }

    /**
     * Click on Consulta Pistas De Auditora Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaPistasDeAuditoraLink() {
        consultaPistasDeAuditora.click();
        return this;
    }

    /**
     * Click on Consulta Tipo De Cambio Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaTipoDeCambioLink() {
        consultaTipoDeCambio.click();
        return this;
    }

    /**
     * Click on Consulta Tracking De Archivo Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultaTrackingDeArchivoLink() {
        consultaTrackingDeArchivo.click();
        return this;
    }

    /**
     * Click on Consultas Y Reportes Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickConsultasYReportesLink() {
        consultasYReportes.click();
        return this;
    }

    /**
     * Click on Contingencia Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickContingenciaLink() {
        contingencia.click();
        return this;
    }

    /**
     * Click on Creacin De Buzn Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCreacinDeBuznLink() {
        creacinDeBuzn.click();
        return this;
    }

    /**
     * Click on Cuenta Beneficiaria Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickCuentaBeneficiariaLink() {
        cuentaBeneficiaria.click();
        return this;
    }

    /**
     * Click on Descarga De Llave Pblica Del Canal Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickDescargaDeLlavePblicaDelCanalLink() {
        descargaDeLlavePblicaDelCanal.click();
        return this;
    }

    /**
     * Click on Descargar Api Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickDescargarApiLink() {
        descargarApi.click();
        return this;
    }

    /**
     * Click on Envo De Archivos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickEnvoDeArchivosLink() {
        envoDeArchivos.click();
        return this;
    }

    /**
     * Click on Exportar Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickExportarLink() {
        exportar.click();
        return this;
    }

    /**
     * Click on Fn18041800189897618744.cnac Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickFn18041800189897618744CnacLink() {
        fn18041800189897618744Cnac.click();
        return this;
    }

    /**
     * Click on Fnj18041800289897618744.cnac Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickFnj18041800289897618744CnacLink() {
        fnj18041800289897618744Cnac.click();
        return this;
    }

    /**
     * Click on Gestin Backends Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinBackendsLink() {
        gestinBackends.click();
        return this;
    }

    /**
     * Click on Gestin Bancos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinBancosLink() {
        gestinBancos.click();
        return this;
    }

    /**
     * Click on Gestin De Buzn Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDeBuznLink() {
        gestinDeBuzn.click();
        return this;
    }

    /**
     * Click on Gestin De Cdigos Postales Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDeCdigosPostalesLink() {
        gestinDeCdigosPostales.click();
        return this;
    }

    /**
     * Click on Gestin De Conexin Del Contrato Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDeConexinDelContratoLink() {
        gestinDeConexinDelContrato.click();
        return this;
    }

    /**
     * Click on Gestin De Paises Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDePaisesLink() {
        gestinDePaises.click();
        return this;
    }

    /**
     * Click on Gestin De Parmetros Del Canal Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDeParmetrosDelCanalLink() {
        gestinDeParmetrosDelCanal.click();
        return this;
    }

    /**
     * Click on Gestin De Protocolos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinDeProtocolosLink() {
        gestinDeProtocolos.click();
        return this;
    }

    /**
     * Click on Gestin Layouts Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinLayoutsLink() {
        gestinLayouts.click();
        return this;
    }

    /**
     * Click on Gestin Mensajes Error Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinMensajesErrorLink() {
        gestinMensajesError.click();
        return this;
    }

    /**
     * Click on Gestin Notificaciones Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinNotificacionesLink() {
        gestinNotificaciones.click();
        return this;
    }

    /**
     * Click on Gestin Productos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickGestinProductosLink() {
        gestinProductos.click();
        return this;
    }

    /**
     * Click on Imgxls Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickImgxlsLink() {
        imgxls.click();
        return this;
    }

    /**
     * Click on Inicio Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickInicioLink() {
        inicio.click();
        return this;
    }

    /**
     * Click on Jerbtvib20180518004.inter Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickJerbtvib20180518004InterLink() {
        jerbtvib20180518004Inter.click();
        return this;
    }

    /**
     * Click on Jerbtvib20180522001.inter Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickJerbtvib20180522001InterLink() {
        jerbtvib20180522001Inter.click();
        return this;
    }

    /**
     * Click on Jrbtvmblc1805080001.inter Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickJrbtvmblc1805080001InterLink() {
        jrbtvmblc1805080001Inter.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on 42 Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickLink42() {
        _42.click();
        return this;
    }

    /**
     * Click on Mdulo Administracin Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMduloAdministracinLink() {
        mduloAdministracin.click();
        return this;
    }

    /**
     * Click on Mn18041800189897618744.cnac Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMn18041800189897618744CnacLink() {
        mn18041800189897618744Cnac.click();
        return this;
    }

    /**
     * Click on Mnd18041800189897618744.cnac Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMnd18041800189897618744CnacLink() {
        mnd18041800189897618744Cnac.click();
        return this;
    }

    /**
     * Click on Monitor De Operaciones Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMonitorDeOperacionesLink() {
        monitorDeOperaciones.click();
        return this;
    }

    /**
     * Click on Monitor De Saldos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMonitorDeSaldosLink() {
        monitorDeSaldos.click();
        return this;
    }

    /**
     * Click on Monitoreo Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMonitoreoLink() {
        monitoreo.click();
        return this;
    }

    /**
     * Click on Multi20180423001.in Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMulti20180423001InLink() {
        multi20180423001In.click();
        return this;
    }

    /**
     * Click on Multi20180423002.in Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickMulti20180423002InLink() {
        multi20180423002In.click();
        return this;
    }

    /**
     * Click on Parmetros Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickParmetrosLink() {
        parmetros.click();
        return this;
    }

    /**
     * Click on Por Demanda Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickPorDemandaLink() {
        porDemanda.click();
        return this;
    }

    /**
     * Click on Reenvo De Archivos Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickReenvoDeArchivosLink() {
        reenvoDeArchivos.click();
        return this;
    }

    /**
     * Click on Refrescar Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickRefrescarLink() {
        refrescar.click();
        return this;
    }

    /**
     * Click on Regresar Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickRegresarLink() {
        regresar.click();
        return this;
    }

    /**
     * Click on Reportes Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickReportesLink() {
        reportes.click();
        return this;
    }

    /**
     * Click on Salir Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSalirLink() {
        salir.click();
        return this;
    }

    /**
     * Click on Solicitud De Cambio De Estatus Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSolicitudDeCambioDeEstatusLink() {
        solicitudDeCambioDeEstatus.click();
        return this;
    }

    /**
     * Click on Solicitud De Edo. De Cuenta Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSolicitudDeEdoDeCuentaLink() {
        solicitudDeEdoDeCuenta.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSolicitudDeEstadosDeCuenta1Link() {
        solicitudDeEstadosDeCuenta1.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSolicitudDeEstadosDeCuenta2Link() {
        solicitudDeEstadosDeCuenta2.click();
        return this;
    }

    /**
     * Click on Sori23042018banamexspid001b.banam Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickSori23042018banamexspid001bBanamLink() {
        sori23042018banamexspid001bBanam.click();
        return this;
    }

    /**
     * Click on Tipo De Cambio Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTipoDeCambioLink() {
        tipoDeCambio.click();
        return this;
    }

    /**
     * Click on Tran180417sant1mod001489897618801.cafi Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTran180417sant1mod001489897618801CafiLink() {
        tran180417sant1mod001489897618801Cafi.click();
        return this;
    }

    /**
     * Click on Tran180509cb12105sant001.inter Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTran180509cb12105sant001InterLink() {
        tran180509cb12105sant001Inter.click();
        return this;
    }

    /**
     * Click on Tran201705233001.enlspei Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTran201705233001EnlspeiLink() {
        tran201705233001Enlspei.click();
        return this;
    }

    /**
     * Click on Tran201705233002.enlspei Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTran201705233002EnlspeiLink() {
        tran201705233002Enlspei.click();
        return this;
    }

    /**
     * Click on Trans17042018mod01089897618801.cint Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTrans17042018mod01089897618801CintLink() {
        trans17042018mod01089897618801Cint.click();
        return this;
    }

    /**
     * Click on Trans17042018santd80025263955.camn Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTrans17042018santd80025263955CamnLink() {
        trans17042018santd80025263955Camn.click();
        return this;
    }

    /**
     * Click on Trans18042018mod00889897618888.cint Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTrans18042018mod00889897618888CintLink() {
        trans18042018mod00889897618888Cint.click();
        return this;
    }

    /**
     * Click on Trans18042018mod01589897618892.camn Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTrans18042018mod01589897618892CamnLink() {
        trans18042018mod01589897618892Camn.click();
        return this;
    }

    /**
     * Click on Trans18042018mod01689897618888.cami Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTrans18042018mod01689897618888CamiLink() {
        trans18042018mod01689897618888Cami.click();
        return this;
    }

    /**
     * Click on Transpid190418001.in Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTranspid190418001InLink() {
        transpid190418001In.click();
        return this;
    }

    /**
     * Click on Transpid190418003.in Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickTranspid190418003InLink() {
        transpid190418003In.click();
        return this;
    }

    /**
     * Click on Uayttrans24042018nibgz003.in Link.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus clickUayttrans24042018nibgz003InLink() {
        uayttrans24042018nibgz003In.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus fill() {
        setClientebancoSantanderMexicoSaRhTextField();
        return this;
    }

    /**
     * Set default value to Clientebanco Santander Mexico Sa Rh Text field.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus setClientebancoSantanderMexicoSaRhTextField() {
        return setClientebancoSantanderMexicoSaRhTextField(data.get("CLIENTEBANCO_SANTANDER_MEXICO_SA_RH"));
    }

    /**
     * Set value to Clientebanco Santander Mexico Sa Rh Text field.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus setClientebancoSantanderMexicoSaRhTextField(String clientebancoSantanderMexicoSaRhValue) {
        clientebancoSantanderMexicoSaRh.sendKeys(clientebancoSantanderMexicoSaRhValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus verifyPageLoaded() {
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
     * @return the H2HConsultaTrackingFileStatus class instance.
     */
    public H2HConsultaTrackingFileStatus verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
