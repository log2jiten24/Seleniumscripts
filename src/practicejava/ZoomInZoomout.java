package practicejava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.manage().window().maximize();
		try {
		//zoom in code 	
		for (int i = 0 ; i <5 ; i ++) 
		{
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.ADD);
		//driver.findElement(By.xpath("//p[1]")).sendKeys(Keys.CONTROL,Keys.ADD);	
		}
		Thread.sleep(5000);
		
		for (int i = 0 ; i <5 ; i++) 
		{
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);	
		//driver.findElement(By.xpath("//p[1]")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);		
		}
		}catch (Exception e) {
		System.out.println ("catched exception :" +e.getMessage())	;
		}
       driver.close();
	}

}
