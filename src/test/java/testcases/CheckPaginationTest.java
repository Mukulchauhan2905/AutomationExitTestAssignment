package testcases;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckPaginationTest extends BasePage {

    @Test
    public void checkPagination() {
        String product = testData.get(10)[4];
        extentTest.info("Searching for " + product);
        log.info("Searching for " + product);
        HomePage homePage = new HomePage();
        homePage.searchForProduct(product);
        extentTest.info("On Search Result Page");
        log.info("On Search Result Page");
        SearchPage searchPage = new SearchPage();
        int lastProductInitial = Integer.parseInt(searchPage.getResultString().split(" ")[3]);
        searchPage.changePage();
        int newFirstProduct = Integer.parseInt(searchPage.getResultString().split(" ")[1]);
        Assert.assertEquals(newFirstProduct - 1, lastProductInitial);
    }
}
