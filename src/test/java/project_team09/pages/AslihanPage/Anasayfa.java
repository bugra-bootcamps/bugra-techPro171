package project_team09.pages.AslihanPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import project_team09.utilities.ConfigReader;
import project_team09.utilities.Driver;

public class Anasayfa {


    public Anasayfa() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerAs;


    @FindBy (xpath = "//*[@class='nav-link']")
    public WebElement signUpButonAs;


    @FindBy (xpath = "(//*[@class='nav-link active'])[1]")
    public WebElement signUpYazisiAs;

    @FindBy (xpath = "(//*[@name='username'])[2]\")")
    public WebElement usernameAs;


    @FindBy (css = "#reg_email")
    public WebElement emailAs;



    @FindBy (xpath = "//*[@class='w-icon-account']" )
    public WebElement signInAs;

    @FindBy (xpath = "//*[@value='Sign In']")
    public WebElement signInButonAs ;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement signInEmail;



    //Giris yapıldı anasayfa açıldı *****************************//

    @FindBy (xpath = "//*[@class='page-title']")
    public WebElement myAccountYazisiAs;

    //Adresses

    @FindBy (xpath = "(//*[@href='https://allovercommerce.com/my-account-2/edit-address/'])[1]")
    public WebElement adressesAs;

    @FindBy (xpath = "//*[@class='icon-box-title text-normal']")
    public WebElement adressesYazi;

    @FindBy (xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAdresADD;

    @FindBy (xpath = "//*[@for='billing_first_name']")
    public WebElement firstNameYazi;

    @FindBy (xpath = "//*[@value='wilmer.moustafa@feerock.com']")
    public WebElement emailValue;

    @FindBy (xpath = "//*[@name='save_address']")
    public WebElement saveAdressButonAs;

    @FindBy (xpath =  "//*[@data-id='billing_first_name']")
    public WebElement firstNameHataYazisi;

    @FindBy (xpath = "//*[@name='billing_first_name']")
    public WebElement adressesFirstNameAs;


    @FindBy (xpath = "//*[@name='billing_last_name']")
    public WebElement adressesLastNameAs;

    @FindBy (xpath = "//*[@id='select2-billing_country-container']")
    public WebElement adressesCountry_Region;






}
