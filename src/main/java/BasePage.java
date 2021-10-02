import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class BasePage {



    //WebDriver mydriver=new ChromeDriver();
    WebDriver driver;


    //JavascriptExecutor js = (JavascriptExecutor)mydriver;


    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }


    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }


    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }






   // public void scroll (){  js.executeScript("window.scrollTo(1, document.body.scrollHeight)");}

   }

