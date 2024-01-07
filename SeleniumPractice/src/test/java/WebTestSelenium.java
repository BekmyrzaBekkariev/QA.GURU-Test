import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.sql.DriverManager.getDriver;

public class WebTestSelenium {

	private WebDriver driver;

	@BeforeEach
	public void startDriver(){
		// Подготовка к Driver
//		driver = getDriver();
	}
	@Test
	public void testSelenium (){
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com");
		// String title = driver.getTitle();
		String title = driver.getTitle();
	}
	@AfterAll
	public void stopDriver(){
		driver.quit();
	}
}
