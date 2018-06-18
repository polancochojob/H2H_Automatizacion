package CreateAndTransferFiles;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2HConsultaMonitorOperSinResult {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "txtContrato")
    @CacheLookup
    private WebElement _094310050618;

    @FindBy(id = "txtCliente")
    @CacheLookup
    private WebElement _09431050618;

    @FindBy(id = "txtIdReg")
    @CacheLookup
    private WebElement _094311050618;

    @FindBy(id = "txtLineaCaptura")
    @CacheLookup
    private WebElement _094312050618;

    @FindBy(id = "txtConvenio")
    @CacheLookup
    private WebElement _094313050618;

    @FindBy(id = "txtFolioSUA")
    @CacheLookup
    private WebElement _094314050618;

    @FindBy(id = "txtRegistroPatronal")
    @CacheLookup
    private WebElement _094315050618;

    @FindBy(id = "txtFechaInicio")
    @CacheLookup
    private WebElement _094316050618;

    @FindBy(id = "txtFechaFin")
    @CacheLookup
    private WebElement _094317050618;

    @FindBy(id = "cmbTipo")
    @CacheLookup
    private WebElement _094318050618;

    @FindBy(id = "txtCuentaCargo")
    @CacheLookup
    private WebElement _09432050618;

    @FindBy(id = "txtCuentaAbono")
    @CacheLookup
    private WebElement _09433050618;

    @FindBy(id = "cmbProducto")
    @CacheLookup
    private WebElement _09434050618;

    @FindBy(id = "txtImporte")
    @CacheLookup
    private WebElement _09435050618;

    @FindBy(id = "txtNombreArchivo")
    @CacheLookup
    private WebElement _09436050618;

    @FindBy(id = "txtReferencia")
    @CacheLookup
    private WebElement _09437050618;

    @FindBy(id = "cmbEstatus")
    @CacheLookup
    private WebElement _09438050618;

    @FindBy(id = "cmbDivisa")
    @CacheLookup
    private WebElement _09439050618;

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

    @FindBy(id = "btnConsultar")
    @CacheLookup
    private WebElement consultar;

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

    @FindBy(id = "btnLimpiar")
    @CacheLookup
    private WebElement limpiar;

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

    @FindBy(id = "popup_ok")
    @CacheLookup
    private WebElement ok;

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

    public H2HConsultaMonitorOperSinResult() {
    }

    public H2HConsultaMonitorOperSinResult(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HConsultaMonitorOperSinResult(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HConsultaMonitorOperSinResult(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Administracin Cliente Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinClienteLink() {
        administracinCliente.click();
        return this;
    }

    /**
     * Click on Administracin De Buzn Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinDeBuznLink() {
        administracinDeBuzn.click();
        return this;
    }

    /**
     * Click on Administracin De Certificados Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinDeCertificadosLink() {
        administracinDeCertificados.click();
        return this;
    }

    /**
     * Click on Administracin De Contratos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinDeContratosLink() {
        administracinDeContratos.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinDeStockSperCuentaGo1Link() {
        administracinDeStockSperCuentaGo1.click();
        return this;
    }

    /**
     * Click on Administracin De Stock Sper Cuenta Go Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAdministracinDeStockSperCuentaGo2Link() {
        administracinDeStockSperCuentaGo2.click();
        return this;
    }

    /**
     * Click on Alta De Contratos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickAltaDeContratosLink() {
        altaDeContratos.click();
        return this;
    }

    /**
     * Click on Bitcora De Envo De Estado Cuenta Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickBitcoraDeEnvoDeEstadoCuentaLink() {
        bitcoraDeEnvoDeEstadoCuenta.click();
        return this;
    }

    /**
     * Click on Cancelacin De Operaciones Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCancelacinDeOperacionesLink() {
        cancelacinDeOperaciones.click();
        return this;
    }

    /**
     * Click on Catlogo Dinmico Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCatlogoDinmicoLink() {
        catlogoDinmico.click();
        return this;
    }

    /**
     * Click on Cierre De Productos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCierreDeProductosLink() {
        cierreDeProductos.click();
        return this;
    }

    /**
     * Click on Cifrado Y Descifrado Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCifradoYDescifradoLink() {
        cifradoYDescifrado.click();
        return this;
    }

    /**
     * Click on Consulta Bics Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaBicsLink() {
        consultaBics.click();
        return this;
    }

    /**
     * Click on Consulta Claves Aba Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaClavesAbaLink() {
        consultaClavesAba.click();
        return this;
    }

    /**
     * Click on Consulta Comisiones Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaComisionesLink() {
        consultaComisiones.click();
        return this;
    }

    /**
     * Click on Consulta Contratos De Usuario Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaContratosDeUsuarioLink() {
        consultaContratosDeUsuario.click();
        return this;
    }

    /**
     * Click on Consulta Contratos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaContratosLink() {
        consultaContratos.click();
        return this;
    }

    /**
     * Click on Consulta Pistas De Auditora Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaPistasDeAuditoraLink() {
        consultaPistasDeAuditora.click();
        return this;
    }

    /**
     * Click on Consulta Tipo De Cambio Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaTipoDeCambioLink() {
        consultaTipoDeCambio.click();
        return this;
    }

    /**
     * Click on Consulta Tracking De Archivo Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultaTrackingDeArchivoLink() {
        consultaTrackingDeArchivo.click();
        return this;
    }

    /**
     * Click on Consultar Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultarLink() {
        consultar.click();
        return this;
    }

    /**
     * Click on Consultas Y Reportes Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickConsultasYReportesLink() {
        consultasYReportes.click();
        return this;
    }

    /**
     * Click on Contingencia Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickContingenciaLink() {
        contingencia.click();
        return this;
    }

    /**
     * Click on Creacin De Buzn Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCreacinDeBuznLink() {
        creacinDeBuzn.click();
        return this;
    }

    /**
     * Click on Cuenta Beneficiaria Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickCuentaBeneficiariaLink() {
        cuentaBeneficiaria.click();
        return this;
    }

    /**
     * Click on Descarga De Llave Pblica Del Canal Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickDescargaDeLlavePblicaDelCanalLink() {
        descargaDeLlavePblicaDelCanal.click();
        return this;
    }

    /**
     * Click on Descargar Api Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickDescargarApiLink() {
        descargarApi.click();
        return this;
    }

    /**
     * Click on Envo De Archivos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickEnvoDeArchivosLink() {
        envoDeArchivos.click();
        return this;
    }

    /**
     * Click on Gestin Backends Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinBackendsLink() {
        gestinBackends.click();
        return this;
    }

    /**
     * Click on Gestin Bancos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinBancosLink() {
        gestinBancos.click();
        return this;
    }

    /**
     * Click on Gestin De Buzn Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDeBuznLink() {
        gestinDeBuzn.click();
        return this;
    }

    /**
     * Click on Gestin De Cdigos Postales Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDeCdigosPostalesLink() {
        gestinDeCdigosPostales.click();
        return this;
    }

    /**
     * Click on Gestin De Conexin Del Contrato Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDeConexinDelContratoLink() {
        gestinDeConexinDelContrato.click();
        return this;
    }

    /**
     * Click on Gestin De Paises Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDePaisesLink() {
        gestinDePaises.click();
        return this;
    }

    /**
     * Click on Gestin De Parmetros Del Canal Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDeParmetrosDelCanalLink() {
        gestinDeParmetrosDelCanal.click();
        return this;
    }

    /**
     * Click on Gestin De Protocolos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinDeProtocolosLink() {
        gestinDeProtocolos.click();
        return this;
    }

    /**
     * Click on Gestin Layouts Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinLayoutsLink() {
        gestinLayouts.click();
        return this;
    }

    /**
     * Click on Gestin Mensajes Error Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinMensajesErrorLink() {
        gestinMensajesError.click();
        return this;
    }

    /**
     * Click on Gestin Notificaciones Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinNotificacionesLink() {
        gestinNotificaciones.click();
        return this;
    }

    /**
     * Click on Gestin Productos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickGestinProductosLink() {
        gestinProductos.click();
        return this;
    }

    /**
     * Click on Imgxls Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickImgxlsLink() {
        imgxls.click();
        return this;
    }

    /**
     * Click on Inicio Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickInicioLink() {
        inicio.click();
        return this;
    }

    /**
     * Click on Limpiar Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickLimpiarLink() {
        limpiar.click();
        return this;
    }

    /**
     * Click on Mdulo Administracin Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickMduloAdministracinLink() {
        mduloAdministracin.click();
        return this;
    }

    /**
     * Click on Monitor De Operaciones Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickMonitorDeOperacionesLink() {
        monitorDeOperaciones.click();
        return this;
    }

    /**
     * Click on Monitor De Saldos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickMonitorDeSaldosLink() {
        monitorDeSaldos.click();
        return this;
    }

    /**
     * Click on Monitoreo Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickMonitoreoLink() {
        monitoreo.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Parmetros Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickParmetrosLink() {
        parmetros.click();
        return this;
    }

    /**
     * Click on Por Demanda Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickPorDemandaLink() {
        porDemanda.click();
        return this;
    }

    /**
     * Click on Reenvo De Archivos Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickReenvoDeArchivosLink() {
        reenvoDeArchivos.click();
        return this;
    }

    /**
     * Click on Reportes Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickReportesLink() {
        reportes.click();
        return this;
    }

    /**
     * Click on Salir Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickSalirLink() {
        salir.click();
        return this;
    }

    /**
     * Click on Solicitud De Cambio De Estatus Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickSolicitudDeCambioDeEstatusLink() {
        solicitudDeCambioDeEstatus.click();
        return this;
    }

    /**
     * Click on Solicitud De Edo. De Cuenta Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickSolicitudDeEdoDeCuentaLink() {
        solicitudDeEdoDeCuenta.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickSolicitudDeEstadosDeCuenta1Link() {
        solicitudDeEstadosDeCuenta1.click();
        return this;
    }

    /**
     * Click on Solicitud De Estados De Cuenta Contingencia Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickSolicitudDeEstadosDeCuenta2Link() {
        solicitudDeEstadosDeCuenta2.click();
        return this;
    }

    /**
     * Click on Tipo De Cambio Link.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult clickTipoDeCambioLink() {
        tipoDeCambio.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult verifyPageLoaded() {
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
     * @return the H2HConsultaMonitorOperSinResult class instance.
     */
    public H2HConsultaMonitorOperSinResult verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}