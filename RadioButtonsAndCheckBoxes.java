package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAndCheckBoxes {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://courses.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	
	@Test
	public void test() throws InterruptedException {
	WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
	bmwRadioBtn.click();
	
	Thread.sleep(2000);;
	WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
	benzRadioBtn.click();
	
	Thread.sleep(2000);
	WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
	bmwCheckBox.click();
	
	Thread.sleep(2000);
	WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
	benzCheckBox.click();
	
	System.out.println("Is the BMW Radio Button clicked?" +bmwRadioBtn.isSelected());
	System.out.println("Is the Benz Radio Button clicked?" +benzRadioBtn.isSelected());
	System.out.println("Is the BMW Checkbox clicked?" +bmwCheckBox.isSelected());
	System.out.println("Is the Ben Checkbox clicked?" +benzCheckBox.isSelected());
	
	}
	

	@After
	public void tearDown() throws Exception {
	}


}
