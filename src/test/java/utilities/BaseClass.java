package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;;
	public static FileInputStream fis;
	public static Properties p;
	
	@SuppressWarnings("deprecation")
	public void LuanchUrl() throws IOException {
		if(driver==null) {
		fis= new FileInputStream("C:\\Users\\2271459\\eclipse-workspace\\CaseStudyGoIbiboTestCases\\src\\test\\resources\\data.properties");
		p = new Properties();
		}
		p.load(fis);
		String brwoser=p.getProperty("browser");
		if(brwoser.equals("chrome")) {	
		driver=new ChromeDriver();
		}else if(brwoser.equals("edge")){
			driver=new EdgeDriver();
		}else if(brwoser.equals("firefox")){
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url=p.getProperty("url");
		driver.get(url);
	}
}