package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }


    // locator
    private final By usernameField = By.id("username");

    private final By passwordField = By.id("password");

    private final By loginButton = By.cssSelector(".radius");


    // actions


    public void insertUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void insertPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

}
