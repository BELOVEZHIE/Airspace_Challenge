package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SecuredPage extends LoginPage{

    @FindBy(className = "subheader")
    private WebElement infoSign;

    public SecuredPage(WebDriver driver) {
        super(driver);
    }

    public String getInfoSign(){
        return infoSign.getText();
    }
}