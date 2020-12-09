package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

	public class Homepage {

			
		WebDriver driver;
		public Homepage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
			//element for login via password
		    @FindBy(how=How.XPATH ,using="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div")
			@CacheLookup
			WebElement loginbypassword;
			
			// element for the login/sign up option
			@FindBy(how=How.XPATH, using ="//*[@id='headerComp']/div/div[2]/div[2]/div[2]")
			@CacheLookup
			WebElement loginlabel; 
			
			//element for enter the mobile number
			@FindBy(how=How.NAME,using="email")
			@CacheLookup
			WebElement  mobilenumber;

			//element for entering password
			@FindBy(how=How.NAME,using="password")
			@CacheLookup
			WebElement password;
			
			//element for clicking l login button
			@FindBy(how=How.XPATH,using="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button")
			@CacheLookup
			WebElement loginbutton;
			
			//for invalid login message
			@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[2]/label")
			@CacheLookup
			WebElement invalidloginmsg;
			
			 
			//element for selecting the search field
			@FindBy(how=How.ID,using ="menu-search")
			@CacheLookup
			WebElement searchbar;
			
			//for adding first element of the search
			@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[3]/app-menu-items/div/app-menu-item[1]/div/div/div/app-price-section/div/div/button")
			@CacheLookup
			WebElement additem;
			
			//for customizations
			@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/p[2]/span")
			@CacheLookup
			WebElement customization1;
			
			//for customizations
			@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[2]/div/div/div[2]/div[1]/div[1]/div[2]/div/label")
			@CacheLookup
			WebElement customization2;
			
			//for adding item to cart
			@FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[2]")
			@CacheLookup
			WebElement addtocart;
			
			//for viewing the cart
			@FindBy(xpath="//*[@id='home-page-wrapper']/div[5]/app-cart-card/div/div[2]/button")
			@CacheLookup
			WebElement cart;
			
			// this is used to clear all the items present in the cart
			@FindBy(xpath="//*[@id='aahaar-wrapper']/app-cart-page/div[1]/div[2]/div[1]/div[1]/div[1]/a")
			@CacheLookup
			WebElement clearall;
			@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-alert-pop-up/div/div/div/div[3]/button")
			@CacheLookup
			WebElement clearok;
			
			//invalid menu search'
			@FindBy(xpath="//*[@id='home-page-wrapper']/div[4]/app-search-items/div/div/div/div[4]/div/div")
			@CacheLookup
			WebElement invalidsearch;
			
			
			//element for selecting the calorie button
			@FindBy(xpath="//*[@id='home-page-wrapper']/div[2]/div[2]/app-calorie-veg/div/div[1]/label/span")
			@CacheLookup
			WebElement calorie;
			
			//element for selecting the veg button
			@FindBy(xpath="//*[@id='home-page-wrapper']/div[2]/div[2]/app-calorie-veg/div/div[2]/label/span")
			@CacheLookup
			WebElement vegonly;
			
			//element for app store
			@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[1]/img[1]")
			@CacheLookup
			WebElement appstore;
			
			//icon for play store
			@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[1]/img[2]")
			@CacheLookup
			WebElement playstore;
			
			//element for offer label
			@FindBy(xpath="//*[@id='headerComp']/div/div[2]/div[2]/div[1]")
			@CacheLookup
			WebElement offerlabel;		
			
			public void clickonlogin(){
				loginlabel.click();
			}
			public void loginbypassword(){
				loginbypassword.click();
			}
			public void mobilenumber(String mno){
				mobilenumber.sendKeys(mno);
				//act.moveToElement(mobilenumber).click().sendKeys(mno).build().perform();
				
			}
			public void password(String pass){
				password.sendKeys(pass);
				//act.moveToElement(password).click().sendKeys(pass).build().perform();
			}
			public void loginbutton(){
				loginbutton.click();
			}
			
			public void invalidloginmsg(){
				Assert.assertEquals("Invalid username or password", invalidloginmsg.getText());
			}
			public void menusearch(String search){
				searchbar.click();
				searchbar.sendKeys(search);
				//act.moveToElement(searchbar).click().sendKeys(search).build().perform();	
			}
			public void additems(){
				additem.click();
			}
			public void cust1(){
				customization1.click();
			}
			public void cust2(){
				customization2.click();
			}
			public void cart(){
				cart.click();
			}
			public void addtocart(){
				addtocart.click();

			}	
			
		    public void removefromcart(){
		    	clearall.click();
		    	clearok.click();
		    }
			public void invalidsearchmessage(){
				Assert.assertEquals("No results found. Check your spelling or try something different.", invalidsearch.getText());
			}
			public void cal(){
				calorie.click();
			}
			public void vegonly(){
				vegonly.click();
			}
			public void playstore(){
				playstore.click();
			}
			public void appstore(){
				appstore.click();
				 
			}
			

	}


	/*  // for selecting the select now option
	@FindBy(xpath="//*[@id='headerComp']/div/div[1]/div[3]/app-nudge/div/div[3]/button[2]")
	@CacheLookup
	WebElement selectlocation;

	@FindBy(xpath="//*[@id='headerComp']/div/div[1]/div[3]/app-nudge/div/div[5]/button[1]")
	@CacheLookup
	WebElement changelocation;
Invalid username or password

	*/

