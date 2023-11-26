package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc01_LoginPageStepClass extends BaseClass {
	@Given("User Should Be In Travel Login Page")
	public void user_should_be_in_travel_login_page() {
		try {
			getDriver("Chrome");
			manager();
			getUrl("http://travel.agileway.net/login");

			System.out.println("Browser getting Lanched Succesfully");

		} catch (Exception e) {
			System.out.println("Browser getting not Lanched Succesfully");
		}
	}

	@When("User Should Enter the Username and Password")
	public void userShouldEnterTheUsernameAndPassword() {
		try {
			LoginPage l = new LoginPage();
			WebElement username = l.getUsername();
			username.sendKeys("agileway");
			WebElement password = l.getPassword();
			password.sendKeys("testwise");
			WebElement remember = l.getRemember();
			remember.click();
			WebElement login = l.getLogin();
			login.click();

			System.out.println("login Was successfully");
		} catch (Exception e) {
			System.out.println("login Was Not successfully" + "Error_" + e.getMessage());
		}
	}

	@When("User Should Click the Login button")
	public void user_should_click_the_login_button() {
		try {
			LoginPage l = new LoginPage();
			WebElement tripType = l.getTripType();
			tripType.click();
			WebElement from = l.getFrom();
			selectby(from, 2);
			WebElement totrip = l.getTotrip();
			selectby(totrip, 1);
			WebElement departday = l.getDepartday();
			selectby(departday, 7);
			WebElement dmonth = l.getDmonth();
			selectby(dmonth, 8);
			WebElement returndate = l.getReturndate();
			selectby(returndate, 5);
			WebElement returnMonth = l.getReturnMonth();
			selectby(returnMonth, 13);

			WebElement timeset = l.getTimeset();
			timeset.click();
			WebElement continuebutton = l.getContinuebutton();
			continuebutton.click();
			System.out.println("  continuebutton cliked sucessfully");
		} catch (Exception e) {
			System.out.println("continuebutton  not cliked " + "Error_" + e.getMessage());
		}

	}

	@When("User Should Click the continuebutton")
	public void user_should_click_the_continuebutton() {
		try {
			LoginPage l = new LoginPage();
			WebElement firstName = l.getFirstName();
			firstName.sendKeys("kowsik");
			WebElement lastName = l.getLastName();
			lastName.sendKeys("sadaiyappan");
			WebElement nextButton = l.getNextButton();
			nextButton.click();
			System.out.println("next button cliking sucessfully");

		} catch (Exception e) {
			System.out.println("next button not cliked");
		}
	}

	@When("User Should Click the next button")
	public void user_should_click_the_next_button() {
		try {
			LoginPage l = new LoginPage();
			WebElement cardtype = l.getCardtype();
			cardtype.click();
			WebElement cardnumber = l.getCardnumber();
			cardnumber.sendKeys("1234567890123456");
			WebElement expiryMonth = l.getExpiryMonth();
			selectby(expiryMonth, 5);
			WebElement year = l.getExpiryYear();
			selectby(year, 1);
			WebElement paynow = l.getPaynow();
			paynow.click();
			Thread.sleep(3000);
			System.out.println("Paynow Was sucessfully ");

		} catch (Exception e) {
			System.out.println("payment not paied");
		}

	}

	@When("User Should be Paynow Was sucessfull")
	public void user_should_be_paynow_was_sucessfull() {
		try {
			LoginPage l = new LoginPage();
			Thread.sleep(3000);
			WebElement lstMsg = l.getLstMsg();
			String text = lstMsg.getText();
			System.out.println("Booking Number :" + text);
			System.out.println("last message printed successfull");
		} catch (Exception e) {
			System.out.println("last message not printed " + "Error :" + e.getMessage());
		}
	}

	@Then("User Should Verify the Suessfull Message")
	public void user_should_verify_the_suessfull_message() {
		System.out.println("Verify the Suessfull Message");

	}

}
