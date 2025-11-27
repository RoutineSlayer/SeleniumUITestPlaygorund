package selenium.tests;

import org.junit.jupiter.api.Test;
import selenium.core.BaseTest;
import selenium.pages.HomePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HomeTest  extends BaseTest {
    private static final HomePage homePage;

    static {
        homePage = new HomePage();
    }

    @Test
    void openHomePage () {
        final String title = "UI Test Automation Playground";
        assertThat(homePage.getTitle(), equalTo(title));
    }
}
