package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class pagebase {
	
	public static WebDriver driver;
	public static  Logger log = Logger.getLogger("devpinoyLogger");
//	public static ExcelReader excel = new ExcelReader(
//			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static File fisXML;
//	public static MonitoringMail mail = new MonitoringMail();
	public static WebDriverWait wait;
	FirefoxProfile ffprofile = new FirefoxProfile();
	FirefoxOptions fo= new FirefoxOptions();
	
	public pagebase() {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
				log.debug("Config properties file loaded");
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
				log.debug("OR properties file loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Config.getProperty("browser").equals("firefox")) {

//				System.setProperty("webdriver.gecko.driver",
//						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
				ffprofile.setPreference("dom.webnotifications.enabled", false);
				fo.setProfile(ffprofile);
				
				driver = new FirefoxDriver(fo);
				log.debug("Firefox Launched !!!");

			} else if (Config.getProperty("browser").equals("chrome")) {

//				System.setProperty("webdriver.chrome.driver",
//						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched !!!");

			} else if (Config.getProperty("browser").equals("ie")) {

//				System.setProperty("webdriver.ie.driver",
//						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				log.debug("IE Launched !!!");

			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Navigated to : " + Config.getProperty("testsiteurl"));
			fisXML=new File(System.getProperty("user.dir") + "\\src\\test\\resources\\XmLFiles\\Or.xml");
			
			/*try {
				DbManager.setMysqlDbConnection();
				log.debug("DB Connection established !!!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicit.wait")));


		
		}
	
	
	
	
	}
	

}
