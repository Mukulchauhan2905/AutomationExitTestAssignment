package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FilterByAmountTest extends BasePage {

    @Test
    public void filterByAmount() {
        String product = testData.get(10)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        String resultString = searchPage.getResultString();
        Assert.assertTrue(resultString.contains(product));
        String amt = testData.get(14)[4];
        extentTest.info("changing min amt = " + amt);
        log.info("changing min amt = " + amt);
        searchPage.selectMinAmt(amt);
        String sPrice = searchPage.getFirstProdPrice();
        int expectedPrice = Integer.parseInt(amt);
        int price = Integer.parseInt(sPrice);
        Assert.assertTrue(price > expectedPrice);
    }
}
