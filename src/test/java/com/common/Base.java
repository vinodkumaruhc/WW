package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

	public void getDriver() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get(" https://www.weightwatchers.com/us/find-a-workshop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	

}