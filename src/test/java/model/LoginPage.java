package model;

import base.BaseModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseModel {

    @FindBy(id = "username")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(className = "radius")
    private WebElement saveButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fillLoginPassword(String login, String password){
      loginField.sendKeys(login);
      passwordField.sendKeys(password);

      return this;
    }

    public SecuredPage clickSaveButton(){
        saveButton.click();

        return new SecuredPage(getDriver());
    }
}