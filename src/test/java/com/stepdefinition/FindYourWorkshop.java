package com.stepdefinition;

import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.AllPageElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FindYourWorkshop extends Base {

	AllPageElements a;

	@Given("User on the WW Studio location Finder webpage")
	public void user_on_the_ww_studio_location_finder_webpage() {
		getDriver();
		

	}

	@Given("Check page title display is correct")
	public void check_page_title_display_is_correct() {

		String actualTitle = driver.getTitle();
		
		System.out.println("Displayed tittle =" + actualTitle);
		String expectedTitle = getExpectedTitle();
		
		// String expectedTitle = Find WW Studios & Meetings Near You | WW USA"

		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Given("User click on In-Person under Find your Workshop title")
	public void user_click_on_in_person_under_find_your_workshop_title() {
		a = new AllPageElements(driver);
		a.clickInperson();

	}

	@Then("Enter zip code as {string} in search field")
	public void enter_zip_code_as_in_search_field(String string) {

		a.enterZipcode(string);

	}

	@Then("Click search button")
	public void click_search_button() {
		a.clickButton();

	}

	@Then("Print the title of the first result and the distance")
	public void print_the_title_of_the_first_result_and_the_distance() {
		a.printFirstClubresult();
		a.printDistanceToFirstClub();

	}

	@Then("Click on the first search result")
	public void click_on_the_first_search_result() {
		a.clickFirstResult();

	}

	@Then("user verify displayed location name\\/title matches with the name of the first searched result")
	public void user_verify_displayed_location_name_title_matches_with_the_name_of_the_first_searched_result() {

		String actaualClubName = a.displayedLocationName();
		// actual nearest location name

		String expectedClubName = a.displayClubName();
		// expected nearest location name
		Assert.assertEquals(actaualClubName, expectedClubName);
		a.displayTestPassed();
	}

	@Then("User  click on Business Hours")
	public void user_click_on_business_hours() {
		a.clickBissnesHours();
	}

	@Then("Print all the business hours for that studio")
	public void print_all_the_business_hours_for_that_studio() {
		a.displayBissnessHours();
		a.closeBrowser();
	}

}
