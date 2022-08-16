package com.pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPageElements {

	WebDriver driver;

	public AllPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "toggleButton-2ikVW")

	public WebElement inPerson;

	public void clickInperson() {
		inPerson.click();
	}

	@FindBy(id = "location-search")
	public WebElement serchBox;

	public void enterZipcode(String zip) {
		for (int i = 0; i < 5; i++) {
			serchBox.sendKeys(Keys.BACK_SPACE);
		}
		;

		serchBox.sendKeys(zip);
	}

	@FindBy(id = "location-search-cta")
	WebElement clickButtonelement;

	public void clickButton() {
		clickButtonelement.click();
	}

	@FindBy(className = "linkUnderline-1_h4g")
	WebElement firstClubResult;

	public void printFirstClubresult() {
		String firstResultName = firstClubResult.getText();
		System.out.println("Result of First Nearest Club Name = " + firstResultName);
	}

	public String displayedLocationName() {
		String locationName = displayedClubName.getText();

		return locationName;

	}

	public void clickFirstResult() {
		firstClubResult.click();

	}

	@FindBy(className = "distance-OhP63")

	public WebElement distanceToClub;

	public void printDistanceToFirstClub() {
		String distance = distanceToClub.getText();
		System.out.println("Distance to First Nearest Club Name = " + distance);
	}

	@FindBy(className = "locationName-1jro_")

	WebElement displayedClubName;

	public String displayClubName() {
		String pagedisplayedClubName = displayedClubName.getText();
		// System.out.println("pagedisplayedClubName = " + pagedisplayedClubName);
		return pagedisplayedClubName;

	}

	@FindBy(className = "title-3o8Pv")
	WebElement bissnessHours;

	public void clickBissnesHours() {
		bissnessHours.click();
	}

	@FindBy(className = "hours-IVyrp")
	WebElement bissnessHoursDropdown;

	public void displayBissnessHours() {
		String clubHOurs = bissnessHoursDropdown.getText();
		System.out.println(clubHOurs);

	}

	public void displayTestPassed() {
		System.out.println(
				"Test Passed ( Displayed location  name/title matched with the name of the first searched result)");

	}

	public void closeBrowser() {
		System.out.println("program finished");
		driver.close();

	}
}
