package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageLogoFailTest extends BasePage {

    @Test
    public void homePageLogoFail() {
        String title = driver.getTitle();
        Assert.assertEquals(title, testData.get(3)[4]);
    }
}
