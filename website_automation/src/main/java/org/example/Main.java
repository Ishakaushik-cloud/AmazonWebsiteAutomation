package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\ishak\\Downloads\\chromedriver_win32\\chromedriver.exe\\");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.in/");

        driver.get("https://www.amazon.in/a/addresses/add?ref=ya_address_book_add_post");
        LoginPage login = new LoginPage(driver);

        login.set_username("8810202280");
        login.continueButtonClick();

        login.set_password("ishakaushik");
        login.click_button();

        NewAddressDetails addAddress = new NewAddressDetails(driver);
        addAddress.set_fullname("Isha Kaushik");
        addAddress.set_phonenumber("1234567890");
        addAddress.set_postalCode("121001");
        addAddress.set_addressLine1("AddressLine1");
        addAddress.set_addressLine2("AddressLine2");
        addAddress.set_city("City");

        driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")).click();

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/a/addresses");

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        System.out.println("Successfully performed the operation of adding address");

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone x");
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

        driver.findElement(By.linkText("Apple iPhone SE (64 GB) - Midnight (3rd Generation)")).click();
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("successfully opened tab");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        System.out.println("add to cart");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
        System.out.println("checkout");
    }
}