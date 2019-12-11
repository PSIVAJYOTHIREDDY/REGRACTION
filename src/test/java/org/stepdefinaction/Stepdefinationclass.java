package org.stepdefinaction;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinationclass {
	WebDriver driver;
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\PRACTICE\\selenium\\BrowserTest\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(s1);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(s2);

		String username = user.getAttribute("value");
		String password = pass.getAttribute("value");
		Assert.assertEquals("verify username",s1,username);
		Assert.assertEquals("verify password", s2 ,password);
		
		
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement btn = driver.findElement(By.id("u_0_4"));
		btn.click();
		
	}

	@Then("user verify the success message")
	public void user_verify_the_success_message() {

	}

}
