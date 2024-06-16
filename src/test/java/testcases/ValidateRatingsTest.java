//package testcases;
//import pages.BasePage;
//import pages.HomePage;
//import pages.ProductPage;
//import pages.SearchPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//
//public class ValidateRatingsTest extends BasePage {
//
//    @Test
//    public void validateRatings() {
//        String product = testData.get(9)[4];
//        extentTest.info("Searching for " + product);
//        log.info("Searching for " + product);
//        HomePage homePage = new HomePage(); 
//        homePage.searchForProduct(product);
//        extentTest.info("On Search Result Page");
//        log.info("On Search Result Page");
//        SearchPage searchPage = new SearchPage();
//        searchPage.clickOnProduct();
//        extentTest.info("Opening link in new Tab");
//        log.info("Opening link in new Tab");
//        ProductPage productPage = new ProductPage();
//        String rating = productPage.getRating();
//        extentTest.info("Rating  = "+ rating);
//        log.info("Rating  = "+ rating);
//        Assert.assertNotNull(rating);
//    }
//}
