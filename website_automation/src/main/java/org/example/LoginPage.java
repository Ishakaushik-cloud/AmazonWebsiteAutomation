package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        private WebDriver driver;

        @FindBy(id = "ap_email")
        WebElement username;
        @FindBy(id = "ap_password")
        WebElement password;
        @FindBy(id = "signInSubmit")
        WebElement button;
        @FindBy(id = "continue")
        WebElement continueButton;

        public LoginPage(WebDriver driver) {
            // initialize elements
            PageFactory.initElements(driver, this);
        }

        public void set_username(String usern) {
            username.clear();
            username.sendKeys(usern);
        }

        public void set_password(String userp) {
            password.clear();
            password.sendKeys(userp);
        }

        public void click_button() {
            button.submit();
        }

        public void continueButtonClick() {
            continueButton.submit();
        }
    }
class NewAddressDetails {
    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    WebElement fullName;
    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    WebElement phoneNumber;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    WebElement postalCode;
    @FindBy(id = "address-ui-widgets-enterAddressCity")
    WebElement city;

    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    WebElement addressLine1;
    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    WebElement addressLine2;
    @FindBy(className = "a-button-inner")
    WebElement stateOrRegion;
    @FindBy(className = "a-button-input")
    // @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement button;

    public NewAddressDetails(WebDriver driver) {
        // initialize elements
        PageFactory.initElements(driver, this);
    }

    public void set_fullname(String fname) {
        fullName.clear();
        fullName.sendKeys(fname);
    }

    public void set_phonenumber(String phnumber) {
        phoneNumber.clear();
        phoneNumber.sendKeys(phnumber);
    }

    public void set_postalCode(String pcode) {
        postalCode.clear();
        postalCode.sendKeys(pcode);
    }

    public void set_city(String cty) {
        city.clear();
        city.sendKeys(cty);
    }

    public void set_addressLine1(String line1) {
        addressLine1.clear();
        addressLine1.sendKeys(line1);
    }

    public void set_addressLine2(String line2) {
        addressLine2.clear();
        addressLine2.sendKeys(line2);
    }

    public void set_stateOrRegion(String region) {
        stateOrRegion.clear();
        stateOrRegion.sendKeys(region);
    }

    public void click_button() {
        button.click();
    }
}

