package lightside.pages;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lightside.utilities.Driver;

public class LinkPage {

	private WebDriver driver= new ChromeDriver();
	
	public LinkPage(){
		
		PageFactory.initElements(Driver.getDriver(), this);
	
			driver.get("https://cybertek-reservation-qa5.herokuapp.com/sign-in");
			
			List<WebElement> links= driver.findElements(By.tagName("a"));
			
			for(WebElement elements: links)
				System.out.println(elements.getAttribute("href"));
		}
		
	@FindBy(name= "email")
	public WebElement email;
	
	@FindBy(name= "password")
	public WebElement password;
	
	@FindBy(xpath= "//div[@class='container']/h1")
	public WebElement mapVA;
	
	@FindBy(xpath= "//div[@class='container']/h2")
	public WebElement mapLightSide;
	
	@FindBy(xpath= "//div[@class='container']/h1")
	public WebElement scheduleSchedule;
	
	@FindBy(xpath= "//div[@class='container']/h2")
	public WebElement scheduleRuthannJohnes;
	
	@FindBy(xpath= "//div[@class='container']/h1")
	public WebElement huntForSpot;
	
	@FindBy(xpath= "//div[@class='container']/h2")
	public WebElement huntTill827;
	
	
	
	
	}

	
	
	
	

