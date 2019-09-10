package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public FileInputStream fis;
	Properties prop= new Properties();
	public WebDriver InitializeDriver() {
		try {
			fis= new FileInputStream("C:\\Users\\VirendarrSinngh\\eclipse-workspace\\FlipkartExample\\ImpFiles\\prop.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName= prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "J:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "J:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		}
		else {
		System.out.println("Check Property file for valid browser name");
		}
		Dimension d = new Dimension(250, 350);
		driver.manage().window().setSize(d);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
