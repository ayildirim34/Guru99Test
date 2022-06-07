import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99Page {
    WebDriver driver;

    public Guru99Page (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="email")
    public WebElement guru99_Email;

    @FindBy(id="password")
    public WebElement guru99_password;

    @FindBy(name="submit")
    public WebElement guru99_login;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[4]")
    public WebElement accept;

    @FindBy(partialLinkText = "Register")
    public WebElement register;

    @FindBy (id="user_title")
    public WebElement dropDown;

    @FindBy(xpath = "//*[.='Accept All']")
    public WebElement acceptAllButton;

    @FindBy(id="user_firstname")
    public WebElement isim;

    @FindBy(id="user_surname")
    public WebElement soyisim;

    @FindBy(id="user_phone")
    public WebElement telefon;

    @FindBy(id="user_dateofbirth_1i")
    public WebElement dogYili;
    @FindBy(id="user_dateofbirth_2i")
    public WebElement dogAyi;
    @FindBy(id="user_dateofbirth_3i")
    public WebElement dogGünü;

    @FindBy(id="user_licenceperiod")
    public WebElement licence;

    @FindBy(id="user_occupation_id")
    public WebElement Occupation;

    @FindBy(id="user_address_attributes_street")
    public WebElement adresStreet;

    @FindBy(id="user_address_attributes_city")
    public WebElement city;

    @FindBy(id="user_address_attributes_county")
    public WebElement country;

    @FindBy(id="user_address_attributes_postcode")
    public WebElement postcode;

    @FindBy (name = "submit")
    public WebElement onay;

    @FindBy(id="user_user_detail_attributes_email")
    public WebElement email;

    @FindBy(id="user_user_detail_attributes_password")
    public WebElement password;

    @FindBy(id="user_user_detail_attributes_password_confirmation")
    public WebElement passwordconfirm;


}
