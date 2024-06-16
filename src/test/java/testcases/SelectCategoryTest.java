package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class SelectCategoryTest extends BasePage {

    @Test
    public void selectCategory() {
        HomePage homePage = new HomePage();
        homePage.moveToFashionCategory();
        Assert.assertTrue(driver.getCurrentUrl().contains("/offers-list/bestsellers-on-fashion"));
    }
}
