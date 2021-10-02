import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

        SearchBox searchBox;
        By gotoLoginPage = By.id("header-user-section");
        By searchBoxLocator = By.id("search");
        By submitButtonLocator = By.className("search-button");
        By moreProductButton=By.className("lazy-load-button");
        By allProducts=By.className("a_model_item");


        public HomePage(WebDriver driver) {
            super(driver);
            searchBox = new SearchBox(driver);
        }


        public SearchBox searchBox(){
            return this.searchBox;
        }
        public void goToLoginPage(){
            click(gotoLoginPage);
        }

        public void searchForPantolon(String text)
        {
            type(searchBoxLocator, text);
            click(submitButtonLocator);
           // scroll();
            click(moreProductButton);

        }

        public void selectPantolon(int i)
        {
        getAllProducts().get(i).click();
        }

        public List<WebElement> getAllProducts(){
            return findAll(allProducts);
        }


    }