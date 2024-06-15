package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InvalidSearchTest extends BasePage {

    @Test
    public void invalidSearch() {
        String product = testData.get(5)[4];
        extentTest.info("Searching for invalid Text = " + product);
        log.info("Searching for invalid Text = " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        SearchPage searchPage = new SearchPage();
        Assert.assertTrue(searchPage.getNoResultText());
    }
}
