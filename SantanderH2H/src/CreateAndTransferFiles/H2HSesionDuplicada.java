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

public class H2HSesionDuplicada {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "btnExportarXls")
    @CacheLookup
    private WebElement imgxls;

    private final String pageLoadedText = "Se ha detectado que ya existe una conexión con este usuario y solo se permite un acceso a la vez";

    private final String pageUrl = "/h2husr/H2HUsuarios/principal/inicio.do#b";

    public H2HSesionDuplicada() {
    }

    public H2HSesionDuplicada(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public H2HSesionDuplicada(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public H2HSesionDuplicada(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Imgxls Link.
     *
     * @return the H2HSesionDuplicada class instance.
     */
    public H2HSesionDuplicada clickImgxlsLink() {
        imgxls.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the H2HSesionDuplicada class instance.
     */
    public H2HSesionDuplicada verifyPageLoaded() {
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
     * @return the H2HSesionDuplicada class instance.
     */
    public H2HSesionDuplicada verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
