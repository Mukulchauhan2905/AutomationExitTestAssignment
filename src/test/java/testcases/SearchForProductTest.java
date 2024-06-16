package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchForProductTest extends BasePage {

    @Test
    public void searchForProduct() {
        String product = testData.get(10)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        SearchPage searchPage = new SearchPage();
        String resultString = searchPage.getResultString();
        Assert.assertTrue(resultString.contains(product));
    }
}
