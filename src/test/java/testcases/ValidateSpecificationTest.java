package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ValidateSpecificationTest extends BasePage {

    @Test
    public void validateSpecification() {
        String product = testData.get(8)[4];
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
        extentTest.info("Product Title = "+ productTitle);
        log.info("Product Title = "+ productTitle);
        String modelName = productPage.getSpecefication().toLowerCase();
        extentTest.info("Model Name = "+ modelName);
        log.info("Model Name = "+ modelName);
        Assert.assertTrue(productTitle.contains(modelName));
    }
}
