//package testcases;
//import pages.BasePage;
//import pages.HomePage;
//import pages.SearchPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class FilterByBrandTest extends BasePage {
//
//    @Test
//    public void filterByBrand() {
//        String product = testData.get(10)[4];
//        extentTest.info("Searching for " + product);
//        log.info("Searching for " + product);
//        HomePage homePage = new HomePage();
//        homePage.searchForProduct(product);
//        extentTest.info("On Search Result Page");
//        log.info("On Search Result Page");
//        SearchPage searchPage = new SearchPage();
//        String resultString = searchPage.getResultString();
//        Assert.assertTrue(resultString.contains(product));
//        String brand = testData.get(6)[4];
//        extentTest.info("Selecting Filter By Brand = " + brand);
//        log.info("Selecting Filter By Brand = " + brand);
//        searchPage.selectFilterByBrand(brand);
//        searchPage.clickOnProduct();
//        extentTest.info("Opening link in new Tab");
//        log.info("Opening link in new Tab");
//        Assert.assertTrue(driver.getTitle().contains("OPPO"));
//    }
//}
