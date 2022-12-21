package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassCuc;

public class LoginPageC extends BaseClassCuc {
	
private static WebDriver d;//null

	
	public LoginPageC(WebDriver d) {// setter---parameterized constructor
		this.d = d;
		PageFactory.initElements(d, this);//this denote current class
	}

	@FindBy(xpath = "//*[@id=\"txt_unam\"]")//FindBy---Element recorder
	private WebElement user;

	public WebElement getUser() {// getter
		return user;
	}

	@FindBy(xpath = "//*[@id=\"txt_pass\"]")
	private WebElement pwd;

	public WebElement getpwd() {
		return pwd;
	}

	@FindBy(xpath = "//*[@id=\"Button3\"]")
	private WebElement login;

	public WebElement getlogin() {
		return login;
	}

	@FindBy(xpath = "//*[@id=\"LinkButton1\"]")
	private WebElement logout;

	public WebElement getlogout() {
		return logout;
	}
	
	

}
