package org.stepdefinition;

import java.util.List;

import org.base.Baseclass;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition  extends Baseclass  {
	
		
	
	

	@Given("User have enter facebook login page through edge browser")
	public void user_have_enter_facebook_login_page_through_edge_browser() {
	   
	launchBrowser();

 loadUrl("https://www.facebook.com/");
	}
	LoginPojo s= new LoginPojo();



@When("User enter invalid username and invalid password")
public void user_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable v) {
	
	List<String> alldata=v.asList();
	String user=alldata.get(2);
	String pass=alldata.get(3);
	
	LoginPojo s= new LoginPojo();

fill(s.getTxtuser(), user);	
fill(s.getTxtPass(), pass);
 
}
@When("User enter valid username and invalid password")
public void user_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable v) {

	List<List<String>>alldata=v.asLists();

String username=alldata.get(1).get(1);
String password=alldata.get(2).get(2);


	LoginPojo s= new LoginPojo();

fill(s.getTxtuser(),username);
fill(s.getTxtPass(),password);


}

@When("User click the login button")
public void user_click_the_login_button() {
	LoginPojo s= new LoginPojo();

	toClick(s.getBtnLogin());
}
@Then("User should be in invalid credential page")
public void user_should_be_in_invalid_credential_page() {
	
	toCurrentUrl();
	
	
	
}



}


