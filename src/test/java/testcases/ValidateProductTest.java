package testcases;

import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import org.testng.annotations.Test;


public class ValidateProductTest extends BasePage {

    @Test
    public void validateProduct() {
        String product = testData.get(7)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage(); 
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        searchPage.clickOnProduct();
        extentTest.info("Opening link in new Tab");
        log.info("Opening link in new Tab");
        ProductPage productPage = new ProductPage();
        String productTitle = productPage.getProductTitle().toLowerCase();
        Assert.assertTrue(productTitle.contains(product.toLowerCase()));
    }
}
