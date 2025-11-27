package selenium.helpers;

import java.util.ResourceBundle;

public class ResourceBundleHelper {
    static ResourceBundle pathsBundle = ResourceBundle.getBundle("paths");

    public static String getBaseURI() {
        return pathsBundle.getString("BASE_URI");
    }
}
