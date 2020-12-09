package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Page2 {
	
	
	WebDriver driver;
	public Page2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// location label
			@FindBy(xpath="//*[@id='headerComp']/div/div[1]/div[3]/div")
			@CacheLookup
			WebElement location;
			
			//for selecting the location search bar
			@FindBy(xpath="//*[@id='menu-search']")
			@CacheLookup
			WebElement locationsearch;
			
			
			//for selecting first location displayed
			@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[1]/div[3]/div/div[3]/div[1]")
			@CacheLookup
			WebElement selfirst;
			
			//done button for selecting location
			@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/button")
			@CacheLookup
			WebElement done;
			
			//for entering the address of the building , colony etc..
			@FindBy(how=How.ID,using="building")
			@CacheLookup
			WebElement address;
			
			//location type (home, office, other this one is for office)
			@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/div/div[3]/div/p[2]")
			@CacheLookup
			WebElement loctype;
			
			//for saving the complete address with all the details
			@FindBy(how=How.CLASS_NAME,using="save-address ")
			@CacheLookup
			WebElement addsave;
			
			//for location error msg which is found when the user selects a location which mcdonalds don't serve
			@FindBy(xpath="//*[@id='aahaar-wrapper']/app-set-location/div/div/div[2]/div/div/div/span[1]")
			@CacheLookup
			WebElement locerror;
			
			//for changing the selected location
			@FindBy(xpath="//*[@id='headerComp']/div/div[1]/div[3]/app-nudge/div/div[5]/button[1]")
			@CacheLookup
			WebElement changelocation;
			
			public void location(){
				location.click();
			}
			public void changeloc(){
				changelocation.click();
			}
			public void locsearch(String string){
		        locationsearch.click();
				locationsearch.sendKeys(string);
			}
			public void selfirst(){
				selfirst.click();
			}
		
			public void done(){
				done.click();
			}
			public void address(String add){
				address.sendKeys(add);
			}
			public void loctype(){
				loctype.click();
			}
			public void saveadd(){
				addsave.click();
				
			}
			public void locerrormsg(){
				Assert.assertEquals("We do not serve this location as of now.", locerror.getText());
				
			}
}

