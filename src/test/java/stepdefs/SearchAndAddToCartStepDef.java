package stepdefs;

import org.junit.Assert;

import base.TestBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.SearchPage;

public class SearchAndAddToCartStepDef extends TestBaseClass {
	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
		Assert.assertEquals("Welcome to Costco Wholesale", driver.getTitle().trim());
	}

	@When("user clicks on searchField")
	public void user_clicks_on_search_field() {
		searchPage.s1();
	}

	@When("user type {string}")
	public void user_type(String string) {
		searchPage.s2(string);

	}

	@Then("user will see the list of products")
	public void user_will_see_the_list_of_products() {
		searchPage.s3();
	}

	@When("user click the second item")
	public void user_click_the_second_item() {

		searchPage.s4();
	}

	@When("user will select the 2nd item")
	public void user_will_select_the_2nd_item() {
		searchPage.s5();
	}

	@When("user will click addToCart")
	public void user_will_click_add_to_cart() {
		searchPage.s6();
	}

	@When("user will click viewCart")
	public void user_will_click_view_cart() {
		searchPage.s7();
	}

	@Then("cart will show item added")
	public void cart_will_show_item_added() {
		System.out.println("we visually inspect");
	}

}
