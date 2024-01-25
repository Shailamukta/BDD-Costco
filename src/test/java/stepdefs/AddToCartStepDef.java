package stepdefs;



import base.TestBaseClass;

import io.cucumber.java.en.When;
import pages.Homepage;

public class AddToCartStepDef  extends TestBaseClass{

	static int itemNumber;
	
	
	@When("user click on register button")
	public void a1() {
		homepage.m1();
	}

	@When("user will input userId {string}")
	public void a2(String string) {
	homepage.m2(string);
	}

	@When("user will input in password {string}")
	public void a3(String string) {
        homepage.m3(string);
	}


	@When("user click on signIn button")
	public void a4() {
		homepage.m4();
	}
}
