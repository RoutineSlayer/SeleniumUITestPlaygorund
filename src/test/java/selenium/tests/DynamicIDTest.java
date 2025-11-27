package selenium.tests;

import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.DynamicIDPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class DynamicIDTest extends BaseTest {
    private static final DynamicIDPage dynamicIDPage;

    static {
        dynamicIDPage = new DynamicIDPage();
    }

    @Test
    void openDynamicIDPage () {
        final String title = "Dynamic ID";

        assertThat(dynamicIDPage.getTitle(), equalTo(title));
    }

    @Test
    void checkThatButtonIDChanged () {
        final String oldID = dynamicIDPage.getDynamicID();
        driver.navigate().refresh();
        final String newID = dynamicIDPage.getDynamicID();

        assertThat(oldID, not(equalTo(newID)));
    }
}
