package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SortLowToHighTest extends BasePage {

    @Test
    public void sortLowToHigh() {
        String product = testData.get(4)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        String sinitialPrice = searchPage.getFirstProdPrice();
        int initialPrice = Integer.parseInt(sinitialPrice);
        searchPage.sortLtoH();
        log.info("Clicked on sort and price = " + initialPrice);
        extentTest.info("Clicked on sort and price = " + initialPrice);
        String sNewPrice = searchPage.getFirstProdPrice();
        int newPrice = Integer.parseInt(sNewPrice);
        Assert.assertTrue(newPrice < initialPrice);
    }
}
