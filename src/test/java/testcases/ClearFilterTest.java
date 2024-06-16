package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ClearFilterTest extends BasePage {

    @Test
    public void clearFilterTest() {
        String product = testData.get(10)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        String brand = testData.get(6)[4];
        searchPage.selectFilterByBrand(brand);
        searchPage.clearFilters();
        Assert.assertTrue(true);
    }
}
