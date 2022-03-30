package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPageElements {

    public CommonPageElements(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
   public WebElement dropDown;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
   public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"username\"]")
   public WebElement username;

    @FindBy (xpath = "//*[@id=\"username\"]")
    public WebElement usernameTexBox;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement passwordTexBox;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public  WebElement singInButton;
}
