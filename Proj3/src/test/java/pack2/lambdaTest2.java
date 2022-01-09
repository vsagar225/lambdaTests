package pack2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;


public class lambdaTest2 {


		public static void main(String[] args) {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      // Keys.Chord string
			
			driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
			
			
		      String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
		      // open the link in new tab, Keys.Chord string passed to sendKeys
		      driver.findElement(
		      By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
			
			Set<String>windowIds=driver.getWindowHandles(); // Here using Set collection

//			for(String windowid:windowIds)
//			{
//				driver.switchTo().window(windowid);
//				System.out.println(driver.getTitle()); //System.out.println(driver.getCurrentUrl());
//			}
			
			//Print the titles using lambda expression
			windowIds.forEach(winid ->      System.out.println(driver.switchTo().window(winid).getTitle()));
			
			driver.quit();
			}

		}
