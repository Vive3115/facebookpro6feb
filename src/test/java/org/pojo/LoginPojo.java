package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Baseclass {
	
	
  public LoginPojo() {
	  PageFactory.initElements(driver, this);
	  
  }
	  
	  @FindBy(id="email")
	private  WebElement txtuser;
	  
	  @FindBy(id="pass")
	  private  WebElement txtPass;
	  
	  @FindBy(name="login")
	  WebElement BtnLogin;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return BtnLogin;
	}
	  
	  
	  

	
	
}
