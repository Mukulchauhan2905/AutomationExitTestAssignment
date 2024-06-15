package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class RemoveFromCartTest extends BasePage {

    @Test
    public void removeFromCartTest() {
        String product = testData.get(11)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        String resultString = searchPage.getResultString();
        Assert.assertTrue(resultString.contains(product));
        searchPage.clickOnProduct();
        extentTest.info("Opening link in new Tab");
        log.info("Opening link in new Tab");
        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        extentTest.info("Clicked ATC on new TAB");
        log.info("Clicked ATC on new TAB");
        CartPage cartPage = new CartPage();
        String emptyCartText = cartPage.removeFromCart();
        Assert.assertEquals(emptyCartText, "Missing Cart items?");
    }
}
