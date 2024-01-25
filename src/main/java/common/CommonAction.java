package common;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.LoggerClass;

public class CommonAction {

	public static void click(WebElement element) {
		try {
			element.click();
			LoggerClass.log("Element has been clicked ---> " + element);
		} catch (Exception e) {
			e.printStackTrace();
			LoggerClass.log("Element Not Found ---> " + element);
		}
	}
	
	public static void inputTextThenClickEnter(WebElement element, String input) {
		try {
			element.sendKeys(input, Keys.ENTER);
			LoggerClass.log(
					input + " <-----> has been put into <-----> " + element + " and then clicked by Enter Key");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			LoggerClass.log(element + "<----------> has not been found\n" + e.getMessage());
			
		}
	}

	public static void inputText(WebElement element, String input) {
		try {
			element.sendKeys(input);
			LoggerClass.log(input + " <-----> has been put into <-----> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			LoggerClass.log(element + "<----------> has not been found\n" + e.getMessage());

		}
	}

	public static void clickElement(WebElement element) {
		try {
			element.click();
			LoggerClass.log(element + "<---------> has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			LoggerClass.log(element + "<----------> has not been found\n" + e.getMessage());

		}
	}

	public static void scrollIntoViewToTheElement(WebDriver driver, String script, WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript(script, element);
			LoggerClass
					.log("Javascript Executor executing to view ..." + script + " on the element of ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			LoggerClass.log(element + "<----------> has not been found\n" + e.getMessage());

		}

	}

	public static void handleAutoSuggestionList(List<WebElement> elementList, String value) {
		try {
			for (WebElement element : elementList) {
				if (element.getText().equals(value)) {
					element.click();
					break;
				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getStackTrace());
		}

	}

	public static void scrollIntoView(JavascriptExecutor jsExecutor, WebElement element) {
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
