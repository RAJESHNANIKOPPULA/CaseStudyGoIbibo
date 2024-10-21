package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import pageObjects.MultiCityFlightsPage;
import pageObjects.ReviewBookingPage;
import pageObjects.SelectingTrip;
import utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDefenitions extends BaseClass{

	SelectingTrip objSelectingTrip = new SelectingTrip();
	MultiCityFlightsPage objMultiCity = new MultiCityFlightsPage();
	ReviewBookingPage objReviewPage = new ReviewBookingPage();
	BaseClass objBase=new BaseClass();
	
	
	@Given("User Launches Chrome Browser and Opens URL https:\\/\\/www.goibibo.com\\/")
	public void user_launches_chrome_browser_and_opens_url_https_www_goibibo_com() throws IOException {
		objBase.LuanchUrl();
	}
	
	@Then("User need to close ad tabs")
	public void user_need_to_close_ad_tabs() {
		
		objSelectingTrip.closeAdPages(driver);
	}

	@When("Select Multi City option Avaliable there")
	public void select_multi_city_option_avaliable_there() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		objSelectingTrip.Multicity(driver).click();
	}

	@When("User Enter data for 1st trip from New Delhi to Bangalore")
	public void user_enter_data_for_1st_trip_from_new_delhi_to_bangalore() throws InterruptedException{
	
		objSelectingTrip.From1(driver).click();
		objSelectingTrip.sendingCity(driver).sendKeys("New Delhi");
		objSelectingTrip.selCity(driver).click();
		objSelectingTrip.sendingCity(driver).sendKeys("Bangalore");
		objSelectingTrip.selCity(driver).click();
	}

	@When("User Selects left date for Two adults and One child")
	public void user_selects_left_date_for_two_adults_and_one_child(){
	    
		objSelectingTrip.dateBtn1(driver).click();
		objSelectingTrip.leftDate1(driver).click();
		objSelectingTrip.Adults(driver).click();
		objSelectingTrip.Child(driver).click();
		objSelectingTrip.doneBtn(driver);
		
	}
	@When("Enter data for Second trip from Bangalore to Goa with left date")
	public void enter_data_for_second_trip_from_bangalore_to_goa_with_left_date() throws InterruptedException{
	    
		objSelectingTrip.To2(driver).click();
		objSelectingTrip.sendingCity(driver).sendKeys("Goa");
		objSelectingTrip.selCity(driver).click();
		objSelectingTrip.dateBtn2(driver).click();
		objSelectingTrip.leftDate2(driver).click();
	}
	@When("Enter data for 3rd trip from Goa to New Delhi with left date")
	public void enter_data_for_3rd_trip_from_goa_to_new_delhi_with_left_date() throws InterruptedException{
	    
		objSelectingTrip.addFlightButton(driver);
		objSelectingTrip.To3(driver).click();
		objSelectingTrip.sendingCity(driver).sendKeys("New Delhi");
		objSelectingTrip.selCity(driver).click();
		objSelectingTrip.dateBtn3(driver).click();
		objSelectingTrip.leftDate3(driver).click();
		
	}

	@Then("Search for flights for these enteries")
	public void search_for_flights_for_these_enteries() throws InterruptedException {
	   
		objSelectingTrip.searchButton(driver).click();
		
		}
	
	@Then("Apply filter for Indigo and spice jet in preferred airlines")
	public void apply_filter_for_indigo_and_spice_jet_in_preferred_airlines(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		objMultiCity.preferredAirlines(driver).click();
		objMultiCity.indigoAirlines(driver).click();
		objMultiCity.spicejetAirlines(driver).click();
	}
	@Then("Select first flight with duration less than six hours")
	public void select_first_flight_with_duration_less_than_hours(){
		objMultiCity.Duration(driver).click();
		objMultiCity.firstFlight(driver).click();
		objMultiCity.secondTrip(driver).click();
		objMultiCity.secondFlight(driver).click();
		objMultiCity.thirdTrip(driver).click();
		objMultiCity.thirdFlight(driver).click();
	}
	@Then("Click on book now button to go to flight review page")
	public void click_on_book_now_button_to_go_to_flight_review_page() {
		objMultiCity.bookButton(driver).click();
	}
	
	@Then("Capture the Grand toatl amount for the selected flight")
	public void capture_the_grand_toatl_amount_for_the_selected_flight() throws IOException {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		objReviewPage.GrandTotal(driver);
	}
	
	@Then("Close Browser")
	public void close_browser() {
		objReviewPage.CloseBrwoser(driver);
	}
}
