package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class CheckMoreTest extends BasePage {

    @Test
    public void checkMore() {
        HomePage homePage = new HomePage();
        String heading = homePage.getHeading();
        homePage.clickMoreButton();
        String moreHeading = homePage.getMoreHeading();
        Assert.assertEquals(heading.toLowerCase(), moreHeading.toLowerCase());
    }
}
