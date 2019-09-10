package pagesFlipkart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class LandingPageOR extends BaseClass {
	WebDriver driver;

	@FindBy(xpath = "//li[@class='Wbt_B2 _1YVU3_']//span[@class='_1QZ6fC _3Lgyp8']")
	List<WebElement> navBar;
	
	@FindBy(xpath="//ul[@class='_114Zhd']//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//child::a")
	List<WebElement> navSubOptions;
	
	public List<WebElement> NavigationBar(){
		return navBar;
	}
	public LandingPageOR(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public List<WebElement> NavSubOptions(){
		return navSubOptions;
	}
	
	public void move_To_Navigation_Bar(String EnterOption) {
		for(WebElement li:navBar) {
			System.out.println("Entered For loop");
			String text=li.getText().toString();
			System.out.println(text);
			System.out.println("Text printed");
			if(text.equalsIgnoreCase(EnterOption)) {
				System.out.println("Entered if loop");
				Actions ac= new Actions(driver);
				ac.moveToElement(li).perform();
				System.out.println("Mouse move to Element");
				break;
			}
		}
	}
	
	
}
