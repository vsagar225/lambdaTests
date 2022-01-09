package pack2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import autoitx4java.AutoItX;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItTest {
	static WebDriver driver;
	
	@Test
	public void testUpload() throws InterruptedException, IOException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://pdf2doc.com/");
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Upload Files']"));
		element.click();
               //Which calls the autoit exe file
		
		Thread.sleep(5000);

//		Runtime.getRuntime().exec("C:\\Sagar\\Selenium\\pdf.exe");
		
		
		AutoItX x = new AutoItX();
		x.winActivate("Open");
		boolean active = x.winWaitActive("Open");
		System.out.println(active);
		boolean cclick = x.controlClick("Open", "", "Edit1");
		System.out.println(cclick);
		
		boolean text=x.ControlSetText("Open", "", "Edit1", "1");
		System.out.println(text);
		Thread.sleep(3000); //This was added just so you could see that the values did change.
		
        
	}	
	
}
