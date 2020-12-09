package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.Homepage;
import pagefactory.Page2;

public class Stepdefinitions {
	

	WebDriver driver;   
	Homepage homepage; //home page instance
	Page2 page;
	
	
	@Before
	public void initialize(){
		
		System.setProperty("webdriver.chrome.driver","C:\\seleniumdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		homepage=new Homepage(driver);
		page=new Page2(driver);
	    ///driver.manage().window().maximize();
		driver.get("https://mcdelivery.co.in");
	}
	
	@After
	public void end(){
		driver.quit();
	}

	
	@Given("User is on home page and click on login\\/signup")
	public void user_is_on_home_page_and_click_on_login_signup() {
		homepage.clickonlogin();
	}

	@When("User clicks on the Login Via Password option")
	public void user_clicks_on_the_Login_Via_Password_option() {
		 homepage.loginbypassword();
	}

	@When("User enters mobile number as {string} and password as {string}")
	public void user_enters_mobile_number_as_and_password_as(String string, String string2) throws InterruptedException {
		homepage.mobilenumber(string);
		Thread.sleep(1000);
	    homepage.password(string2);
	    Thread.sleep(500);
	}

	@Then("login should be successful")
	public void login_should_be_successful() throws InterruptedException {
		 homepage.loginbutton();
		 Thread.sleep(2000);
		   driver.quit();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("User is in the home page")
public void user_is_in_the_home_page() throws InterruptedException {
   homepage.clickonlogin();
   homepage.loginbypassword();
   homepage.mobilenumber("9908409454");
   Thread.sleep(500);
   homepage.password("viaks1235");
   //Thread.sleep(1000);
   homepage.loginbutton();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Then("the error message {string} should be displayed")
public void the_error_message_should_be_displayed(String string){
 homepage.invalidloginmsg();
 driver.quit();
	
}
	   
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@Given("user click on location label  and enters a {string}")
public void user_click_on_location_label_and_enters_a(String string) throws InterruptedException {
	   /*homepage.clickonlogin();
	   homepage.loginbypassword();
	   homepage.mobilenumber("8555034397");
	   Thread.sleep(500);
	   homepage.password("viaks1234");
	   Thread.sleep(1000);
	   homepage.loginbutton();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	   page.location();
       Thread.sleep(3000);
    // page.changeloc();
       page.locsearch(string);
       Thread.sleep(3000);
	
}

@When("the user selects first location displayed and enters address and address type")
public void the_user_selects_first_location_displayed_and_enters_address_and_address_type() throws InterruptedException {
   page.selfirst();
   Thread.sleep(500);
   page.done();
   Thread.sleep(1000);
   //page.address("abc def ghi 555666");
  // page.loctype();
   //Thread.sleep(1000);
   
}

@Then("the location should be selected")
public void the_location_should_be_selected() throws InterruptedException {
	//page.saveadd();
	Thread.sleep(1000);
	driver.quit();
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@Given("user is on the homepage and click on location")
public void user_is_on_the_homepage_and_click_on_location() throws InterruptedException {
   page.location();
   Thread.sleep(1000);
  // page.changeloc();
   Thread.sleep(1000);
}

@When("user click on search bar and enters a {string}")
public void user_click_on_search_bar_and_enters_a(String string) throws InterruptedException {
   page.locsearch(string);
   Thread.sleep(3000);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
}

@When("the user selects first displayed location and click on done")
public void the_user_selects_first_displayed_location_and_click_on_done() throws InterruptedException {
	page.selfirst();
	Thread.sleep(1000);
	page.done();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Then("an error message should be displayed {string}")
public void an_error_message_should_be_displayed(String string) {
	page.locerrormsg();
	driver.quit();
}


//////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("user is on home page and search for chicken burger")
	public void user_is_on_home_page_and_search_for_chicken_burger() throws InterruptedException {
	   homepage.menusearch("chicken burger");
	   Thread.sleep(2000);
	}

	@When("the results are displayed add the first item to the cart that is displayed")
	public void the_results_are_displayed_add_the_first_item_to_the_cart_that_is_displayed() throws InterruptedException {
	 homepage.additems();
	 Thread.sleep(2000);
	 homepage.addtocart();
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// homepage.cart();
	// Thread.sleep(2000);
	}

	@Then("user cart should display the selected item")
	public void user_cart_should_display_the_selected_item() {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//homepage.cart();
	   driver.quit();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	   
	}

	@When("user search for an invalid item in search box")
	public void user_search_for_an_invalid_item_in_search_box() throws InterruptedException {
	    homepage.menusearch("adbs");
	    Thread.sleep(2000);
	}

	@Then("the system should display an error message {string}")
	public void the_system_should_display_an_error_message(String string) {
	   homepage.invalidsearchmessage();
	   driver.quit();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	 
	}

	@When("the user search for an item the results are displayed")
	public void the_user_search_for_an_item_the_results_are_displayed() throws InterruptedException {
	    homepage.menusearch("coke");
	    Thread.sleep(2000);
	}

	@When("the user click on the calories button")
	public void the_user_click_on_the_calories_button() {
	  
	}

	@Then("the calories in the each item should be displayed")
	public void the_calories_in_the_each_item_should_be_displayed() {
	   homepage.cal();
	   driver.quit();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@When("the user click on the veg only button")
	public void the_user_click_on_the_veg_only_button() {
	    homepage.menusearch("burger");
	}

	@Then("only the veg items should be displayed")
	public void only_the_veg_items_should_be_displayed() {
		homepage.vegonly();
       driver.quit();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
	   
	}

	@When("the user click on the Google Play icon")
	public void the_user_click_on_the_Google_Play_icon() {
	   homepage.playstore();
	}

	@Then("the user should be redirected to the playstore")
	public void the_user_should_be_redirected_to_the_playstore() {
	  driver.quit();
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@When("the user click on the App store icon")
	public void the_user_click_on_the_App_store_icon() {
	  homepage.appstore();
	}

	@Then("the user should be redirected to the App store")
	public void the_user_should_be_redirected_to_the_App_store() {
	    driver.quit();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("the is on home page")
	public void the_is_on_home_page() throws InterruptedException {
	    homepage.menusearch("chicken burger");
	    Thread.sleep(2000);
	}

	@When("the user search and select the first item displayed")
	public void the_user_search_and_select_the_first_item_displayed() throws InterruptedException {
	    homepage.additems();
	    Thread.sleep(2000);
	}

	@When("the user add the customizations required and clicks on add to cart")
	public void the_user_add_the_customizations_required_and_clicks_on_add_to_cart() throws InterruptedException {
	  homepage.cust1();
	  Thread.sleep(500);
	  homepage.cust2();
	  Thread.sleep(500);
	  homepage.addtocart();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  homepage.cart();
	}

	@Then("the item should be displayed in the cart along with the customizations selected")
	public void the_item_should_be_displayed_in_the_cart_along_with_the_customizations_selected() {
	 driver.quit(); 
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@When("the user selects a item and the user click on the cart")
	public void the_user_selects_a_item_and_the_user_click_on_the_cart() throws InterruptedException {
	   homepage.menusearch("chicken burger");
	    Thread.sleep(2000);
	    homepage.additems();
	    Thread.sleep(2000);
	    homepage.addtocart();
	    //Thread.sleep(1000);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    homepage.cart();
	    
	}

	@Then("the selected items should be displayed")
	public void the_selected_items_should_be_displayed() {
	   driver.quit();
	} 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Given("user has selected an item")
	public void user_has_selected_an_item() throws InterruptedException {
		    homepage.menusearch("chicken burger");
		    Thread.sleep(2000);
		    homepage.additems();
		    Thread.sleep(2000);
	}

	@When("user adds the item to cart and click on clear all from cart")
	public void user_adds_the_item_to_cart_and_click_on_clear_all_from_cart() throws InterruptedException {
		 homepage.addtocart();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  homepage.cart();
		  Thread.sleep(2000);
		
	}

	@Then("all the items in the cart should be removed")
	public void all_the_items_in_the_cart_should_be_removed() {
	   homepage.removefromcart();
	   driver.quit();
	}



}