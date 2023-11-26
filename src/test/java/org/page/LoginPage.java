package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(how = How.ID, using = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(how = How.ID, using = "remember_me")
	private WebElement remember;

	public WebElement getRemember() {
		return remember;
	}

	@FindBy(how = How.NAME, using = "commit")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='tripType']")
	private WebElement tripType;

	public WebElement getTripType() {
		return tripType;
	}

	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement from;

	public WebElement getFrom() {
		return from;
	}

	@FindBy(how = How.NAME, using = "toPort")
	private WebElement totrip;

	public WebElement getTotrip() {
		return totrip;
	}

	@FindBy(how = How.ID, using = "departDay")
	private WebElement departday;

	public WebElement getDepartday() {
		return departday;
	}

	@FindBy(how = How.ID, using = "departMonth")
	private WebElement dmonth;

	public WebElement getDmonth() {
		return dmonth;
	}

	@FindBy(how = How.ID, using = "returnDay")
	private WebElement returndate;

	public WebElement getReturndate() {
		return returndate;
	}

	@FindBy(how = How.ID, using = "returnMonth")
	private WebElement returnMonth;

	public WebElement getReturnMonth() {
		return returnMonth;

	}

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	private WebElement timeset;

	public WebElement getTimeset() {
		return timeset;
	}

	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	@FindBy(how = How.NAME, using = "passengerFirstName")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(how = How.NAME, using = "passengerLastName")
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement nextButton;
	public WebElement getNextButton() {
		return nextButton;
	}
	

	@FindBy(how = How.XPATH, using = "//input[@name='card_type'][2]")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}

	@FindBy(how = How.NAME, using = "card_number")
	private WebElement cardnumber;
	public WebElement getCardnumber() {
		return cardnumber;
	}
	
	

	@FindBy(how = How.NAME, using = "expiry_month")
	private WebElement expiryMonth;
    
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	

	@FindBy(how = How.NAME, using = "expiry_year")
	private WebElement expiryYear;
      
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	private WebElement paynow;

	public WebElement getPaynow() {
		return paynow;
	}

	@FindBy(how = How.ID, using = "cc_exp_month")
	private WebElement Expirymonth;

	public WebElement getExpirymonth() {
		return Expirymonth;
	}

	@FindBy(how = How.ID, using = "cc_exp_year")
	private WebElement Expiryyear;

	public WebElement getExpiryyear() {
		return Expiryyear;
	}

	@FindBy(how = How.ID, using = "cc_cvv")
	private WebElement crvno;

	public WebElement getCrvno() {
		return crvno;
	}

	@FindBy(how = How.ID, using = "book_now")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}
	@FindBy(id="booking_number")
	private WebElement lstMsg;
	
	public WebElement getLstMsg() {
		return lstMsg;
	}}
	
	


