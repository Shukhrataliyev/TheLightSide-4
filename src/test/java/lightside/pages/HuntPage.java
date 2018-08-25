package lightside.pages;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import lightside.utilities.Driver;

public class HuntPage {
	
	private WebDriver driver; 
	
	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	public WebElement date; 
	
	@FindBy (id="timelineStart")
	public WebElement fromDropDown; 
	
	@FindBy (id="timelineFinish")
	public WebElement toDropDown; 
	
	
	public void datePicker(int numberOfDays, WebDriver driver){
		LocalDate now=LocalDate.now(); 
		Actions act=new Actions(driver); 
				
		String today=now.toString().substring(now.toString().length()-2, now.toString().length()); 
		int num=Integer.parseInt(today); 
		
		String month=now.toString().substring(now.toString().length()-5, now.toString().length()-3);
		
		if(month.equals("01") ||month.equals("03") ||month.equals("05") ||month.equals("07") 
				||month.equals("08") ||month.equals("10") ||month.equals("12") ){
		if((num+numberOfDays)<=31){
		act.moveToElement(date).sendKeys(num+numberOfDays+""); 
		}else{
			act.moveToElement(date).sendKeys(num+numberOfDays-31+"");	
		}
		
		}else if(month.equals("02")){
			if((num+numberOfDays)<=28){
				act.moveToElement(date).sendKeys(num+numberOfDays+""); 
				}else{
					act.moveToElement(date).sendKeys(num+numberOfDays-28+"");	
				}
		}else{
			if((num+numberOfDays)<=30){
				act.moveToElement(date).sendKeys(num+numberOfDays+""); 
				}else{
					act.moveToElement(date).sendKeys(num+numberOfDays-30+"");	
				}
		}
	}
	
	
	public void fromToTime(WebDriver driver, WebElement element, String time){
		
		Select select= new Select(element); 
		List<WebElement> options= select.getOptions(); 
		for (WebElement each : options) {
			if(each.getText().equals(time)){
			 select.selectByValue(each.getText());
			}
		}
	}

	
		
		
		
	
	
	
}
