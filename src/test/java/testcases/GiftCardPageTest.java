package testcases;
import pages.BasePage;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftCardPageTest extends BasePage {

    @Test
    public void giftCardPage(){
        HomePage homePage = new HomePage();
        homePage.hoverLoginMoveToGiftCards();
        homePage.moveToForm();
        homePage.fillUpForm();
        Assert.assertEquals(driver.getTitle(), testData.get(20)[4]);
    }
}
