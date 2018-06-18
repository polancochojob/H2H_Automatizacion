package CreateAndTransferFiles;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2HConsultaTrackingArchivo {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(5) a")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(6) a")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(4) a")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(11) a")
    @CacheLookup
    private WebElement _20;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(7) a")
    @CacheLookup
    private WebElement _21;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(8) a")
    @CacheLookup
    private WebElement _31;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(9) a")
    @CacheLookup
    private WebElement _411;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(10) a")
    @CacheLookup
    private WebElement _41;

    @FindBy(css = "#tab tbody:nth-of-type(2) tr:nth-of-type(1) td:nth-of-type(3) a")
    @CacheLookup
    private WebElement _47;

    @FindBy(css = "#FormularioNivelGeneral div:nth-of-type(2) div:nth-of-type(2) div.frameTablaEstandar div:nth-of-type(2) div.contentPieContenedor table tbody tr td a")
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

    @FindBy(id = "codigoCliente")
    @CacheLookup
    private WebElement bancoSantanderMexicoSaRh;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/tracking/enviosEdoCta/bitacora.do']")
    @CacheLookup
    private WebElement bitcoraDeEnvoDeEstadoCuenta;

    @FindBy(css = "#tab tbody tr td.texto_izquierda a")
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

    @FindBy(css = "#FormularioNivelGeneral div:nth-of-type(2) div:nth-of-type(2) div.frameTablaEstandar div:nth-of-type(3) div.contentPieContenedor table tbody tr td:nth-of-type(3) span a")
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

    private final String pageLoadedText = "Consulta Tracking de Archivo - Nivel General";

    private final String pageUrl = "/h2husr/H2HUsuarios/gestiontraking/buscarNivelGeneral.do#b";

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/parametros/inicioParametrosBD.do?IO.SOS.DB=H2HParam']")
    @CacheLookup
    private WebElement parmetros;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/edoCta/vistaSolEdoCta.do']")
    @CacheLookup
    private WebElement porDemanda;

    @FindBy(css = "a[href='/h2husr/H2HUsuarios/planCalidad/reenviarArchivos.do']")
    @CacheLookup
    private WebElement reenvoDeArchivos;

    @FindBy(css = "#FormularioNivelGeneral div:nth-of-type(2) div:nth-of-type(2) div.frameTablaEstandar div:nth-of-type(3) div.contentPieContenedor table tbody tr td:nth-of-type(1) span a")
    @CacheLookup
    private WebElement refrescar;

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

    public H2HConsultaTrackingArchivo() {
    }

    public H2HConsultaTrackingArchivo(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HConsultaTrackingArchivo(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HConsultaTrackingArchivo(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 0 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click1Link0() {
        _10.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click1Link1() {
        _11.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click2Link0() {
        _20.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click2Link1() {
        _21.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click3Link1() {
        _31.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click4Link1() {
        _411.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo click5Link1() {
        _51.click();
        return this;
    }

    /**
     * Click on Administracin Cliente Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinClienteLink() {
        administracinCliente.click();
        return this;
    }

    /**
     * Click on Administracin De Buzn Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinDeBuznLink() {
        administracinDeBuzn.click();
        return this;
    }

    /**
     * Click on Administracin De Certificados Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinDeCertificadosLink() {
        administracinDeCertificados.click();
        return this;
    }

    /**
     * Click on Administracin De Contratos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinDeContratosLink() {
        administracinDeContratos.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinDeStockSperCuentaGo1Link() {
        administracinDeStockSperCuentaGo1.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAdministracinDeStockSperCuentaGo2Link() {
        administracinDeStockSperCuentaGo2.click();
        return this;
    }

    /**
     * Click on Alta De Contratos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickAltaDeContratosLink() {
        altaDeContratos.click();
        return this;
    }

    /**
     * Click on Bitcora De Envo De Estado Cuenta Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickBitcoraDeEnvoDeEstadoCuentaLink() {
        bitcoraDeEnvoDeEstadoCuenta.click();
        return this;
    }

    /**
     * Click on Buscar Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickBuscarLink() {
        buscar.click();
        return this;
    }

    /**
     * Click on Cancelacin De Operaciones Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCancelacinDeOperacionesLink() {
        cancelacinDeOperaciones.click();
        return this;
    }

    /**
     * Click on Catlogo Dinmico Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCatlogoDinmicoLink() {
        catlogoDinmico.click();
        return this;
    }

    /**
     * Click on Cierre De Productos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCierreDeProductosLink() {
        cierreDeProductos.click();
        return this;
    }

    /**
     * Click on Cifrado Y Descifrado Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCifradoYDescifradoLink() {
        cifradoYDescifrado.click();
        return this;
    }

    /**
     * Click on Consulta Bics Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaBicsLink() {
        consultaBics.click();
        return this;
    }

    /**
     * Click on Consulta Claves Aba Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaClavesAbaLink() {
        consultaClavesAba.click();
        return this;
    }

    /**
     * Click on Consulta Comisiones Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaComisionesLink() {
        consultaComisiones.click();
        return this;
    }

    /**
     * Click on Consulta Contratos De Usuario Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaContratosDeUsuarioLink() {
        consultaContratosDeUsuario.click();
        return this;
    }

    /**
     * Click on Consulta Contratos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaContratosLink() {
        consultaContratos.click();
        return this;
    }

    /**
     * Click on Consulta Pistas De Auditora Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaPistasDeAuditoraLink() {
        consultaPistasDeAuditora.click();
        return this;
    }

    /**
     * Click on Consulta Tipo De Cambio Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaTipoDeCambioLink() {
        consultaTipoDeCambio.click();
        return this;
    }

    /**
     * Click on Consulta Tracking De Archivo Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultaTrackingDeArchivoLink() {
        consultaTrackingDeArchivo.click();
        return this;
    }

    /**
     * Click on Consultas Y Reportes Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickConsultasYReportesLink() {
        consultasYReportes.click();
        return this;
    }

    /**
     * Click on Contingencia Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickContingenciaLink() {
        contingencia.click();
        return this;
    }

    /**
     * Click on Creacin De Buzn Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCreacinDeBuznLink() {
        creacinDeBuzn.click();
        return this;
    }

    /**
     * Click on Cuenta Beneficiaria Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickCuentaBeneficiariaLink() {
        cuentaBeneficiaria.click();
        return this;
    }

    /**
     * Click on Descarga De Llave Pblica Del Canal Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickDescargaDeLlavePblicaDelCanalLink() {
        descargaDeLlavePblicaDelCanal.click();
        return this;
    }

    /**
     * Click on Descargar Api Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickDescargarApiLink() {
        descargarApi.click();
        return this;
    }

    /**
     * Click on Envo De Archivos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickEnvoDeArchivosLink() {
        envoDeArchivos.click();
        return this;
    }

    /**
     * Click on Exportar Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickExportarLink() {
        exportar.click();
        return this;
    }

    /**
     * Click on Gestin Backends Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinBackendsLink() {
        gestinBackends.click();
        return this;
    }

    /**
     * Click on Gestin Bancos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinBancosLink() {
        gestinBancos.click();
        return this;
    }

    /**
     * Click on Gestin De Buzn Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDeBuznLink() {
        gestinDeBuzn.click();
        return this;
    }

    /**
     * Click on Gestin De Cdigos Postales Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDeCdigosPostalesLink() {
        gestinDeCdigosPostales.click();
        return this;
    }

    /**
     * Click on Gestin De Conexin Del Contrato Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDeConexinDelContratoLink() {
        gestinDeConexinDelContrato.click();
        return this;
    }

    /**
     * Click on Gestin De Paises Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDePaisesLink() {
        gestinDePaises.click();
        return this;
    }

    /**
     * Click on Gestin De Parmetros Del Canal Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDeParmetrosDelCanalLink() {
        gestinDeParmetrosDelCanal.click();
        return this;
    }

    /**
     * Click on Gestin De Protocolos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinDeProtocolosLink() {
        gestinDeProtocolos.click();
        return this;
    }

    /**
     * Click on Gestin Layouts Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinLayoutsLink() {
        gestinLayouts.click();
        return this;
    }

    /**
     * Click on Gestin Mensajes Error Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinMensajesErrorLink() {
        gestinMensajesError.click();
        return this;
    }

    /**
     * Click on Gestin Notificaciones Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinNotificacionesLink() {
        gestinNotificaciones.click();
        return this;
    }

    /**
     * Click on Gestin Productos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickGestinProductosLink() {
        gestinProductos.click();
        return this;
    }

    /**
     * Click on Imgxls Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickImgxlsLink() {
        imgxls.click();
        return this;
    }

    /**
     * Click on Inicio Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickInicioLink() {
        inicio.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 41 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickLink41() {
        _411.click();
        return this;
    }

    /**
     * Click on 47 Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickLink47() {
        _47.click();
        return this;
    }

    /**
     * Click on Mdulo Administracin Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickMduloAdministracinLink() {
        mduloAdministracin.click();
        return this;
    }

    /**
     * Click on Monitor De Operaciones Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickMonitorDeOperacionesLink() {
        monitorDeOperaciones.click();
        return this;
    }

    /**
     * Click on Monitor De Saldos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickMonitorDeSaldosLink() {
        monitorDeSaldos.click();
        return this;
    }

    /**
     * Click on Monitoreo Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickMonitoreoLink() {
        monitoreo.click();
        return this;
    }

    /**
     * Click on Parmetros Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickParmetrosLink() {
        parmetros.click();
        return this;
    }

    /**
     * Click on Por Demanda Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickPorDemandaLink() {
        porDemanda.click();
        return this;
    }

    /**
     * Click on Reenvo De Archivos Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickReenvoDeArchivosLink() {
        reenvoDeArchivos.click();
        return this;
    }

    /**
     * Click on Refrescar Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickRefrescarLink() {
        refrescar.click();
        return this;
    }

    /**
     * Click on Reportes Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickReportesLink() {
        reportes.click();
        return this;
    }

    /**
     * Click on Salir Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickSalirLink() {
        salir.click();
        return this;
    }

    /**
     * Click on Solicitud De Cambio De Estatus Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickSolicitudDeCambioDeEstatusLink() {
        solicitudDeCambioDeEstatus.click();
        return this;
    }

    /**
     * Click on Solicitud De Edo. De Cuenta Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickSolicitudDeEdoDeCuentaLink() {
        solicitudDeEdoDeCuenta.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickSolicitudDeEstadosDeCuenta1Link() {
        solicitudDeEstadosDeCuenta1.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickSolicitudDeEstadosDeCuenta2Link() {
        solicitudDeEstadosDeCuenta2.click();
        return this;
    }

    /**
     * Click on Tipo De Cambio Link.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo clickTipoDeCambioLink() {
        tipoDeCambio.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo fill() {
        setBancoSantanderMexicoSaRhTextField();
        return this;
    }

    /**
     * Set default value to Banco Santander Mexico Sa Rh Text field.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo setBancoSantanderMexicoSaRhTextField() {
        return setBancoSantanderMexicoSaRhTextField(data.get("BANCO_SANTANDER_MEXICO_SA_RH"));
    }

    /**
     * Set value to Banco Santander Mexico Sa Rh Text field.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo setBancoSantanderMexicoSaRhTextField(String bancoSantanderMexicoSaRhValue) {
        bancoSantanderMexicoSaRh.sendKeys(bancoSantanderMexicoSaRhValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo verifyPageLoaded() {
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
     * @return the H2HConsultaTrackingArchivo class instance.
     */
    public H2HConsultaTrackingArchivo verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
