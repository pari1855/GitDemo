package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesFlipkart.LandingPageOR;

import utility.BaseClass;

public class LandingPage_TC extends BaseClass {

	@BeforeMethod
	public void set_Up() {
		InitializeDriver();
	}

	@Test
	public void MoveToNavBar() {
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		LandingPageOR obj = new LandingPageOR(driver);
		obj.move_To_Navigation_Bar("Men");
	}
}
