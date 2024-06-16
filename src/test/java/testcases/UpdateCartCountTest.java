package testcases;
import pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;

public class UpdateCartCountTest extends BasePage {

    @Test
    public void updateCartCount(){
        String product = testData.get(10)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        searchPage.clickOnProduct();
        ProductPage productPage = new ProductPage();
        productPage.addToCart();
        extentTest.info("Clicked ATC on new TAB");
        log.info("Clicked ATC on new TAB");
        CartPage cartPage = new CartPage();
        int initialCount = Integer.parseInt(cartPage.getCount());
        cartPage.updateCounter();
        int newCount = Integer.parseInt(cartPage.getCount());
        Assert.assertEquals(newCount, initialCount + 1);
    }
}
