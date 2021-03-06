package CreateAndTransferFiles;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2HControlAccesoLogin {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "idAceptar")
    @CacheLookup
    private WebElement aceptar;

    @FindBy(id = "idLinkCambioPass")
    @CacheLookup
    private WebElement cambiarContrasea;

    @FindBy(id = "idCancelar")
    @CacheLookup
    private WebElement cancelar;

    @FindBy(id = "txtUsername")
    @CacheLookup
    private WebElement derechosReservados2018GrupoFinancieroSantander1;

    @FindBy(id = "pssPassword")
    @CacheLookup
    private WebElement derechosReservados2018GrupoFinancieroSantander2;

    private final String pageLoadedText = "Validación de Usuario&nbsp;21 Mayo 2018";

    private final String pageUrl = "/WarEAIIntranet/principal/inicio.do?";

    public H2HControlAccesoLogin() {
    }

    public H2HControlAccesoLogin(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HControlAccesoLogin(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HControlAccesoLogin(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Aceptar Button.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin clickAceptarButton() {
        aceptar.click();
        return this;
    }

    /**
     * Click on Cambiar Contrasea Link.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin clickCambiarContraseaLink() {
        cambiarContrasea.click();
        return this;
    }

    /**
     * Click on Cancelar Button.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin clickCancelarButton() {
        cancelar.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin fill() {
        setDerechosReservados2018GrupoFinancieroSantander1PasswordField();
        setDerechosReservados2018GrupoFinancieroSantander2PasswordField();
        return this;
    }

    /**
     * Set default value to Derechos Reservados 2018 Grupo Financiero Santander Password field.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin setDerechosReservados2018GrupoFinancieroSantander1PasswordField() {
        return setDerechosReservados2018GrupoFinancieroSantander1PasswordField(data.get("DERECHOS_RESERVADOS_2018_GRUPO_FINANCIERO_SANTANDER_1"));
    }

    /**
     * Set value to Derechos Reservados 2018 Grupo Financiero Santander Password field.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin setDerechosReservados2018GrupoFinancieroSantander1PasswordField(String derechosReservados2018GrupoFinancieroSantander1Value) {
        derechosReservados2018GrupoFinancieroSantander1.sendKeys(derechosReservados2018GrupoFinancieroSantander1Value);
        return this;
    }

    /**
     * Set default value to Derechos Reservados 2018 Grupo Financiero Santander Password field.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin setDerechosReservados2018GrupoFinancieroSantander2PasswordField() {
        return setDerechosReservados2018GrupoFinancieroSantander2PasswordField(data.get("DERECHOS_RESERVADOS_2018_GRUPO_FINANCIERO_SANTANDER_2"));
    }

    /**
     * Set value to Derechos Reservados 2018 Grupo Financiero Santander Password field.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin setDerechosReservados2018GrupoFinancieroSantander2PasswordField(String derechosReservados2018GrupoFinancieroSantander2Value) {
        derechosReservados2018GrupoFinancieroSantander2.sendKeys(derechosReservados2018GrupoFinancieroSantander2Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin verifyPageLoaded() {
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
     * @return the H2HControlAccesoLogin class instance.
     */
    public H2HControlAccesoLogin verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
