package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageLogoTest extends BasePage {

    @Test
    public void homePageLogo() {
        String title = driver.getTitle();
        Assert.assertEquals(title, testData.get(2)[4]);
    }
}
