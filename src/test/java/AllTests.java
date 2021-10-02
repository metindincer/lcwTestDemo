import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



public class AllTests extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    String productPriceinPage;


    @Test
    @Order(1)
    public void user_Login(){

        homePage= new HomePage(driver);
        loginPage=new LoginPage(driver);
        homePage.goToLoginPage();
        loginPage.login("testinium2@gmail.com","A12345678.");

    }

   @Test
   @Order(2)
    public void search_pantolon(){

     //scroll
       homePage.searchForPantolon("pantolon");
    }

    @Test
    @Order(3)
    public void click_pantolon(){

    int number=(int)(Math.random()*(homePage.getAllProducts().size()-0+1)+0);
    homePage.selectPantolon(number);

    }

    @Test
    @Order(4)
    public void check_price(){

         productPage= new ProductPage(driver);
         cartPage = new CartPage(driver);
         productPage.addToCart();
         productPriceinPage= productPage.setProductsPrice();
         productPage.goToCart();

    //Assertions.assertTrue(cartPage.isPriceEqual(productPriceinPage),"It is not equal!");



    }

    @Test
    @Order(5)
    public void add_one_more_product_and_check(){

       cartPage.addOneProduct();
    }


    @Test
    @Order(6)
    public void removeProductFromCart() throws InterruptedException {
        Thread.sleep(4000);
       cartPage.removeProducts();

    }

    @Test
    @Order(7)
    public void clear_carts_and_check() throws InterruptedException {

        Thread.sleep(4000);
        cartPage.removeProductsConfirm();
        Assertions.assertTrue(cartPage.checkProductIfExist(),"There are still products in cart!!");

    }


}
