package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiCityFlightsPage {

	private By preffered_airlines=By.id("mc_filter_0_2_slug");
	private By indigo=By.xpath("(//*[text()='IndiGo'])[1]");
	private By spicejet=By.xpath("(//*[text()='SpiceJet'])[1]");
	private By duration=By.id("mc_sort_options_1_0_1");
	private By first_flight=By.id("mc_card_1_0_0_checkbox_icon");
	private By second_trip=By.id("mc_sector_1");
	private By second_flight=By.id("mc_card_1_1_0_checkbox_icon");
	private By third_trip=By.id("mc_leg_2");
	private By third_flight=By.id("mc_card_1_2_0_checkbox_icon");
	private By book_button=By.id("mc_ticket_summary_book_btn");
	
	public WebElement preferredAirlines(WebDriver driver) {
		WebElement pref_flights=driver.findElement(preffered_airlines);
		return pref_flights;
	}
	
	public WebElement indigoAirlines(WebDriver driver) {
		WebElement indigo_flights=driver.findElement(indigo);
		return indigo_flights;
	}
	
	public WebElement spicejetAirlines(WebDriver driver) {
		WebElement spicejet_flights=driver.findElement(spicejet);
		return spicejet_flights;
	}
	
	public WebElement Duration(WebDriver driver) {
		WebElement duration_of_flight=driver.findElement(duration);
		return duration_of_flight;
	}
	
	public WebElement firstFlight(WebDriver driver) {
		WebElement first=driver.findElement(first_flight);
		return first;
	}
	
	public WebElement secondTrip(WebDriver driver) {
		WebElement second_trip_btn=driver.findElement(second_trip);
		return second_trip_btn;
	}
	
	public WebElement secondFlight(WebDriver driver) {
		WebElement second=driver.findElement(second_flight);
		return second;
	}
	
	public WebElement thirdTrip(WebDriver driver) {
		WebElement third_trip_btn =driver.findElement(third_trip);
		return third_trip_btn;
	}
	
	public WebElement thirdFlight(WebDriver driver) {
		WebElement third=driver.findElement(third_flight);
		return third;
	}
	
	public WebElement bookButton(WebDriver driver) {
		WebElement book=driver.findElement(book_button);
		return book;
	}
	
}