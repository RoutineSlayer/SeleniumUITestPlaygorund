package selenium.pages;

import selenium.core.BasePage;
import selenium.helpers.ResourceBundleHelper;


public class HomePage extends BasePage {
    public HomePage () {
        driver.get(ResourceBundleHelper.getBaseURI());
    }

    public String getTitle () {
        return driver.getTitle();
    }
}
