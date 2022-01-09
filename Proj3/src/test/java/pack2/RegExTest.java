package pack2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class RegExTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	  driver.manage().window().maximize();
      // identify element with partial class match with * in css
      WebElement l=driver.findElement(By.cssSelector("input[class*='input']"));
      l.sendKeys("Selenium");
      
      Thread.sleep(5000);
      // obtain the value entered with getAttribute method
     
      System.out.println("Using * expression: " +l.getAttribute("value"));
      l.clear();

            // identify element with partial class match with ^ in css
      WebElement m=driver.findElement(By.cssSelector("input[class^='inp']"));
      m.sendKeys("Java");
    
      // obtain the value entered with getAttribute method
      System.out.println("Using ^ expression: " +m.getAttribute("value"));
      m.clear();
    
      // identify element with partial class match with $ in css
      WebElement n = driver.findElement(By.cssSelector("input[class$='put']"));
      n.sendKeys("Python");
     
      
      // obtain the value entered with getAttribute method
      System.out.println("Using $ expression: " +n.getAttribute("value"));
      n.clear();
      
      
      // identify element with partial class match with contains in xpath
      WebElement o= driver.findElement(By.xpath("//input[contains(@class,'input')]"));
      o.sendKeys("Selenium");
      
      
      // obtain the value entered with getAttribute method
      System.out.println("Using contains: " +o.getAttribute("value"));
      o.clear();
      // identify element with partial class match with starts-with in xpath
      WebElement p= driver.findElement(By.xpath("//input[starts-with(@class,'inp')]"));
      p.sendKeys("Java");
      
      // obtain the value entered with getAttribute method
      System.out.println("Using starts-with: " +p.getAttribute("value"));
      p.clear();
       
      Actions a = new Actions(driver);
      //scroll down a page
       a.sendKeys(Keys.PAGE_DOWN).build().perform();
       a.sendKeys(Keys.PAGE_DOWN).build().perform();
       a.sendKeys(Keys.PAGE_DOWN).build().perform();
       a.sendKeys(Keys.PAGE_DOWN).build().perform();
     
      
       Thread.sleep(10000);
        WebElement refund=driver.findElement(By.cssSelector("footer[id^='footer'] li:nth-child(2) a:nth-child(1)"));
        
        refund.click();
        Thread.sleep(7000);
      
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
