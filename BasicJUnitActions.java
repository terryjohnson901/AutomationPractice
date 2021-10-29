package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJUnitActions {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://courses.letskodeit.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//div//a[@href='/login']")).click();
		System.out.println("Clicked on login");
		
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		System.out.println("email entered");
		
		driver.findElement(By.id("password")).clear();
		System.out.println("password cleared");
		
		driver.findElement(By.id("password")).sendKeys("password");
		System.out.println("password entered");
		
		driver.findElement(By.id("email")).clear();
		System.out.println("email field is cleared");
	}
	
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
