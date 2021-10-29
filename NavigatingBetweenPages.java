package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {
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
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("This is the title: " +title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		String urlToNavigate = "https://courses.letskodeit.com/login";
		System.out.println("Navigating to login");
		driver.navigate().to(urlToNavigate);
		//This going to navigate to login without clicking on the Login button
		
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " +currentURL);
		
		driver.navigate().refresh();
		System.out.println("Refreshed page");
		
		//Another way to refresh page
		driver.get(currentURL);
		System.out.println("Refreshed Page");
		
	}

	@After
	public void tearDown() throws Exception {
	}


}
