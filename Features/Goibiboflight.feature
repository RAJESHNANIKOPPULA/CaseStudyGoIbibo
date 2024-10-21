Feature: Automating the Goibibo Flight Booking operation

	Background 
  Scenario: Checking The Flights Availability of the respective Cities
    Given User Launches Chrome Browser and Opens URL https://www.goibibo.com/
    Then  User need to close ad tabs
    And   Select Multi City option Avaliable there
    When  User Enter data for 1st trip from New Delhi to Bangalore
    And   User Selects left date for Two adults and One child
    And   Enter data for Second trip from Bangalore to Goa with left date
    And   Enter data for 3rd trip from Goa to New Delhi with left date
    Then  Search for flights for these enteries
    And   Apply filter for Indigo and spice jet in preferred airlines
    Then  Select first flight with duration less than six hours
		Then  Click on book now button to go to flight review page
		Then 	Capture the Grand toatl amount for the selected flight
		And   Close Browser