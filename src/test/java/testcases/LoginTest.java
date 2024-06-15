package testcases;
import pages.BasePage;
import pages.HomePage;
import org.testng.annotations.Test;


public class LoginTest extends BasePage {

    @Test
    public void login() {
        HomePage homePage = new HomePage();
        homePage.moveToLogin(testData.get(1)[4]);
    }
}
