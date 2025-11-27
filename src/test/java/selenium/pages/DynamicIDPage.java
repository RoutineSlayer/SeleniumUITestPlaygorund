package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BasePage;
import selenium.helpers.ResourceBundleHelper;

public class DynamicIDPage extends BasePage {
    private static final String DYNAMIC_ID_PATH = "dynamicid";

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    private WebElement button;

    public DynamicIDPage () {
        driver.get(ResourceBundleHelper.getBaseURI() + DYNAMIC_ID_PATH);
        PageFactory.initElements(driver, this);
    }

    public String getTitle () {
        return driver.getTitle();
    }

    public String getDynamicID () {
        return button.getAttribute("id");
    }
}
