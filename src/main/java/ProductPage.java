import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage  extends  BasePage{

   By addToCartButton= By.id("pd_add_to_cart");
   By selectSize= new By.ByCssSelector("a[key*=\"1\"]");
   By goToCartButton=By.className("header-cart");
   By getProductPrice= new By.ByCssSelector("span.price");


    public ProductPage(WebDriver driver)
    {
        super(driver);
    }

    public void addToCart()
    {
        click(selectSize);
        click(addToCartButton);
    }


    public void goToCart()
    {
        click(goToCartButton);
    }


    public String setProductsPrice()
    {
        return find(getProductPrice).getText();
    }

}
