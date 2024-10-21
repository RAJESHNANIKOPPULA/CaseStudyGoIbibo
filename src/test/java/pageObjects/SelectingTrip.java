package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectingTrip {
	
	String first_dep_date="Thu Oct 24 2024";
	
	String second_dep_date="Sun Oct 27 2024";
	
	String third_dep_date="Wed Oct 30 2024";
	
	private By login_tab_close=By.xpath("//span[@class='logSprite icClose']");
	private By ad_close=By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']");
	private By multicity_btn=By.xpath("//*[text()='Multi-city']");
	private By depature_city1=By.xpath("(//*[text()='From'])[1]");
	private By Sending_preferred_city=By.xpath("//input[@type='text']");
	private By Selecting_preferred_city=By.xpath("//li[@tabindex=0]");
	//private By Selecting_preferred_city=By.xpath("//*[text()='New Delhi, India']");
	//private By destination_city2=By.xpath("(//*[text()='To'])[2]");
	private By depature_btn1=By.xpath("(//*[text()='Departure'])[1]");
	private By depature_date1=By.xpath("//div[@aria-label='"+first_dep_date+"']");
	private By adultbtn=By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[2]");
	private By childbtn=By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[4]");
	private By done_btn=By.xpath("//*[text()='Done']");
	private By destination_city2=By.xpath("(//*[text()='To'])[2]");
	private By depature_btn2=By.xpath("(//*[text()='Departure'])[2]");
	private By depature_date2=By.xpath("//div[@aria-label='"+second_dep_date+"']");
	private By addflight=By.xpath("//*[text()='Add Another Flight']");
	private By destination_city3=By.xpath("(//*[text()='To'])[3]");
	private By depature_btn3=By.xpath("(//*[text()='Departure'])[3]");
	private By depature_date3=By.xpath("//div[@aria-label='"+third_dep_date+"']");
	private By search_btn=By.xpath("//*[text()='SEARCH FLIGHTS']");
	
	/*public SelectingTrip(WebDriver driver) {
		this.driver=driver;
	}*/
	
	public void closeAdPages(WebDriver driver) {
		driver.findElement(login_tab_close).click();
		driver.findElement(ad_close).click();
	}
	
	public WebElement sendingCity(WebDriver driver) {
		WebElement send_city=driver.findElement(Sending_preferred_city);
		return send_city;
	}
	
	public WebElement selCity(WebDriver driver) {
		WebElement select_city=driver.findElement(Selecting_preferred_city);
		return select_city;
	}
	
	public WebElement Multicity(WebDriver driver) {
		WebElement multicity=driver.findElement(multicity_btn);
		return multicity;
	}
	
	public WebElement From1(WebDriver driver) {
		WebElement from_1=driver.findElement(depature_city1);
		return from_1;
	}
	
	public WebElement dateBtn1(WebDriver driver) {
		WebElement date_btn=driver.findElement(depature_btn1);
		return date_btn;
	}
	
	public WebElement leftDate1(WebDriver driver) {
		WebElement left_date=driver.findElement(depature_date1);
		return left_date;
	}
	
	public WebElement Adults(WebDriver driver) {
		WebElement adults=driver.findElement(adultbtn);
		return adults;
	}
	
	public WebElement Child(WebDriver driver) {
		WebElement child=driver.findElement(childbtn);
		return child;
	}
	
	public void doneBtn(WebDriver driver) {
		driver.findElement(done_btn).click();
	}
	
	public WebElement To2(WebDriver driver) {
		WebElement To_2=driver.findElement(destination_city2);
		return To_2;
	}
	
	public WebElement dateBtn2(WebDriver driver) {
		WebElement date_btn=driver.findElement(depature_btn2);
		return date_btn;
	}
	
	public WebElement leftDate2(WebDriver driver) {
		WebElement left_date=driver.findElement(depature_date2);
		return left_date;
	}
	
	public void addFlightButton(WebDriver driver) {
		driver.findElement(addflight).click();
	}
	
	public WebElement To3(WebDriver driver) {
		WebElement To_3=driver.findElement(destination_city3);
		return To_3;
	}
	
	public WebElement dateBtn3(WebDriver driver) {
		WebElement date_btn=driver.findElement(depature_btn3);
		return date_btn;
	}
	
	public WebElement leftDate3(WebDriver driver) {
		WebElement left_date=driver.findElement(depature_date3);
		return left_date;
	}
	
	public WebElement searchButton(WebDriver driver) {
		WebElement searchbtn=driver.findElement(search_btn);
		return searchbtn;
	}
	
	
}
