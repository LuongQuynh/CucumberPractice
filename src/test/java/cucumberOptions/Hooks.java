package cucumberOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

//import cucumber.api.java.After;
import cucumber.api.java.Before;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	// Run for many thread
	private static WebDriver driver;
	private static final Logger log = Logger.getLogger(Hooks.class.getName());

	@Before 
	public synchronized static WebDriver openAndQuitBrowser() {
		String browser = System.getProperty("BROWSER");
		System.out.println("Browser name run by command line = " + browser);

		if (driver == null) {
			try {
				if (browser == null) {
					browser = System.getenv("BROWSER");
					if (browser == null) {
						browser = "firefox";
					}
				}

				switch (browser) {
				case "chrome":
					WebDriverManager.chromedriver().version("87.0.4280.88").setup();
					driver = new ChromeDriver();
					break;
				case "hchrome":
					WebDriverManager.chromedriver().version("87.0.4280.88").setup();
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("headless");
					chromeOptions.addArguments("window-size=1920x1080");
					driver = new ChromeDriver(chromeOptions);
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
					System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
					driver = new FirefoxDriver();
					break;
				case "hfirefox":
					WebDriverManager.firefoxdriver().setup();
					System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
					System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
					FirefoxOptions firefoxOptions = new FirefoxOptions();
					firefoxOptions.setHeadless(true);
					driver = new FirefoxDriver(firefoxOptions);
					break;
				case "ie":
					WebDriverManager.iedriver().arch32().setup();
					driver = new InternetExplorerDriver();
					break;
				default:
					WebDriverManager.chromedriver().version("87.0.4280.88").setup();
					driver = new ChromeDriver();
					break;
				}
			} catch (UnreachableBrowserException e) {
				driver = new ChromeDriver();
				// Driver crash
			} catch (WebDriverException e) {
				driver = new ChromeDriver();
			}
			finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}

			driver.get("http://demo.guru99.com/v4");
			driver.manage().window().maximize();
//			driver.get("http://google.com.vn");



			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			log.info("------------- Started the browser -------------");
		}
		return driver;
	}

//	@After
	public static void closeBrowser() {
		try {
			if (driver != null) {
				openAndQuitBrowser().quit();
				log.info("------------- Closed the browser -------------");
			}
		} catch (UnreachableBrowserException e) {
			System.out.println("Can not close the browser");
		}
	}

	private static class BrowserCleanup implements Runnable {
		@Override
		public void run() {
			closeBrowser();
		}
	}
	
	public static int randomNumber() {
		Random rand = new Random();
		return rand.nextInt(999999);
	}

}