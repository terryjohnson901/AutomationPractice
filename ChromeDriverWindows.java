package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

	public static void main(String[] args) {
		//This line below tells the program which driver to use. The parameter tells the program where to go to get the driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\19019\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		
		//This line is what opens up the browser window
		WebDriver driver = new ChromeDriver();
		
		//These line tells the driver which website to go to
		String baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);

	}

}
