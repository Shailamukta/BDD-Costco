package pages;

import static common.CommonAction.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='header_sign_in']")
	WebElement register;

	@FindBy(xpath = "//input[@id='signInName']")
	WebElement userId;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='next']")
	WebElement signIn;

	@FindBy(xpath = "//input[@id='shopAsNonMemberBtn']")
	WebElement shopAsNonMember;

	@FindBy(xpath = "//input[@id='search-field']")
	WebElement searchBar;
	
public void m1() {
		clickElement(register);
	
}
public void m2(String user) {//"shailakhnaum7@gmail.com"
		inputText(userId, user);
	
	
}
public void m3(String pass) {//"Tasfia4922!"
	
		inputText(password, pass);
	
}
public void m4() {
	
		clickElement(signIn);
	
}







//	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton() {
//
//
}
