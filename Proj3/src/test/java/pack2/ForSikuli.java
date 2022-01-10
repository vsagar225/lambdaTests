package pack2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

	public class ForSikuli {
		static WebDriver driver;
	    public static void main(String[] args) throws FindFailed, InterruptedException {

	    	WebDriverManager.chromedriver().setup();
						
	        String filepath = "C:\\Sagar\\Selenium\\Files\\";
	        String inputFilePath = "C:\\Sagar\\Selenium\\Files\\";
	        Screen s = new Screen();
	        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
	        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
	       
	        // Open Chrome browser    
	        driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/image_upload/index.php");
	        Thread.sleep(5000);
	        // Click on Browse button and handle windows pop up using Sikuli
	        WebElement button=driver.findElement(By.xpath("//input[@id='photoimg']"));
	        button.click();
//	        s.wait(fileInputTextBox, 20);
//	        s.type(fileInputTextBox, inputFilePath + "Test.docx");
//	        s.click(openButton);

	        // Close the browser
	        driver.close();

	    }

	}
