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

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public  WebElement items;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[6]/span")
    public  WebElement room;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement creatARoomButton;

    @FindBy(xpath = "//*[@id=\"room-roomNumber\"]")
    public  WebElement roomNummberTexBox;

    @FindBy(xpath = "//*[@id=\"room-roomType\"]/option[3]")
    public  WebElement roomTypeTexBox;

    @FindBy(xpath = "//*[@id=\"room-status\"]")
    public WebElement status;

    @FindBy (xpath = "//*[@id=\"room-price\"]")
    public WebElement priceTexBox;

    @FindBy(xpath = "//*[@id=\"room-description\"]")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/thead/tr/th[7]/span")
    public WebElement CreatedDate;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]")
    public WebElement actualroomNumber;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement verificationMessage;





}
