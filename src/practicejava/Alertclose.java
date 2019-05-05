package practicejava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclose {

	static WebDriver driver ;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
	
	//System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
   //WebDriver driver = new FirefoxDriver() ;
   driver = new ChromeDriver() ;
  //maximize the window		
  driver.manage().window().maximize(); 	
  //Add implicit wait
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
 driver.navigate().to(baseUrl);
 
  //send keys
  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
  //click on submit
  driver.findElement(By.xpath("//input[@name='submit']")).click();
  
//  //Switch to alert 
  Alert alt = driver.switchTo().alert() ;
 //get  the text of the alert 
  System.out.println ("alert accept " + alt.getText());
  Thread.sleep(5000);
// close the alert 
   alt.accept();
  
  driver.close();
	}

}
