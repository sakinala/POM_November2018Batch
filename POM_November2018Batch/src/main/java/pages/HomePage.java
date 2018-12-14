package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class HomePage extends BasePage{
	
	/*
	 * 1. Locators
	 * 2. Selenium Code
	 */
	
	public HomePage(WebDriver driver, ExtentTest extentTest)
	{
		super(driver,extentTest);
		PageFactory.initElements(driver, this); // Page initialize
	}
	
	@FindBy(id = "s") 
	private WebElement searchTextbox;
	
	public SearchResultsPage searchBook()
	{
		searchTextbox.sendKeys("selenium");
		extentTest.info("Entering selenium book as search book.");
		searchTextbox.sendKeys(Keys.ENTER);
		extentTest.info("Hit Enter to search the selenium book.");
		
		return new SearchResultsPage(driver,extentTest);
	}
}
