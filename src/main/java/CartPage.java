import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By getPriceInCart=By.className("rd-cart-item-price");
    By addOneProductButton=By.className("oq-up");
    By removeCartButton= By.className("cart-square-link");
    By removeProductButton=By.className("inverted-modal-button");

    public CartPage(WebDriver driver)
    {
        super(driver);
    }

    public void addOneProduct()
    {

        click(addOneProductButton);

    }
    public void removeProducts()
    {

        click(removeCartButton);


    }
    public void removeProductsConfirm()
    {

        click(removeProductButton);
    }

    public boolean checkProductIfExist()
    {
        if(removeCartButton==null)
        {
            return false;
        }
        return true;
    }

    public boolean isPriceEqual(String price)
    {

    if(price==find(getPriceInCart).getText())
    {
       return true;
    }
    return false;
    }

}
