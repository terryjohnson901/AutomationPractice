package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idPATHDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://courses.letskodeit.com";
		String baseURL2 = "https://courses.letskodeit.com/practice";
		WebDriver driver;
		
		 /*Thought I needed to make another webDriver to go to a different URL
		 * WebDriver driver2;*/
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(baseURL);
		 
		 /*This block is me trying to attempt to open up a different URL after running the first part of the code
		  * When ran it parallel with the first code and opened another window.
		  * driver2 = new ChromeDriver();
		   driver2.manage().window().maximize();
		   driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver2.get(baseURL2);
		 */
		
		 driver.findElement(By.xpath("//a[@href='/login']")).click();
		 driver.findElement(By.id("email")).sendKeys("tJ2022@yahoo.com");	
		 Thread.sleep(5000);
		 
		 /*I placed this afterwards thinking it would run after the two lines above
		  * driver2.findElement(By.name("enter-name")).sendKeys("Terry"); */
		 
		 driver.get(baseURL2);
		 driver.findElement(By.name("enter-name")).sendKeys("Terry");
		

	}

}
