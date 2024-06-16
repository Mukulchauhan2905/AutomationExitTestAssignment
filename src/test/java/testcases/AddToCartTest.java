package testcases;
//import pages.BasePage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HomePage;
//import pages.ProductPage;
//import pages.SearchPage;
//
//public class AddToCartTest extends BasePage {
//
//    @Test
//    public void addToCartTest() {
//        String product = testData.get(4)[4];
//        System.out.println(testData);
//        extentTest.info("Searching for " + product);
//        log.info("Searching for " + product);
//        HomePage homePage = new HomePage();
//        homePage.searchForProduct(product);
//        extentTest.info("On Search Result Page");
//        log.info("On Search Result Page");
//        SearchPage searchPage = new SearchPage();
//        String resultString = searchPage.getResultString();
//        Assert.assertTrue(resultString.contains(product));
//        searchPage.clickOnProduct();
//        extentTest.info("Opening link in new Tab");
//        log.info("Opening link in new Tab");
//        ProductPage productPage = new ProductPage();
//        productPage.addToCart();
//        extentTest.info("Clicked ATC on new TAB");
//        log.info("Clicked ATC on new TAB");
//        Assert.assertEquals(driver.getTitle(), "Shopping Cart | Flipkart.com");
//    }
//}
