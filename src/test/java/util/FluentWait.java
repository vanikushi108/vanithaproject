package util;

import com.google.common.base.Function;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class FluentWait
{
    /**
     * Tells the WebDriver pause execution until the expected WebElement is visible
     */
      public static WebElement findElement(WebDriver driver, final WebElement element) {

      Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
       .withTimeout(60, TimeUnit.SECONDS)
       .pollingEvery(10, TimeUnit.MILLISECONDS)
       .ignoring(NoSuchElementException.class);

       final Wait<WebDriver> w = wait;
 
       return w.until(new Function<WebDriver, WebElement>() {
         public WebElement apply(WebDriver driver) {
            w.until(ExpectedConditions.visibilityOf(element));
               return element;
           }
      });
  }
}