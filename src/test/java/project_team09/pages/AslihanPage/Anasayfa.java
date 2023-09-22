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


    @FindBy (xpath = "(//*[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
    public WebElement usernameAs;

    @FindBy (xpath = "//*[@id='reg_email']")
    public WebElement emailAs;

    @FindBy (xpath = "//*[@id='reg_password']")
    public WebElement passwordSignUpAs;

    @FindBy (xpath = "//*[@id='register-policy']")
    public WebElement iAgreeButonAs;



    @FindBy (xpath = "//*[@class='w-icon-account']" )
    public WebElement signInAs;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement signInEmail;



    //Giris yapıldı anasayfa açıldı *****************************//

    @FindBy (xpath = "//*[@class='page-title']")
    public WebElement myAccountYazisiAs;

    @FindBy (xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutAs;

    //Adresses

    @FindBy (xpath = "(//*[@href='https://allovercommerce.com/my-account-2/edit-address/'])[1]")
    public WebElement adressesAs;

    @FindBy (xpath = "//*[@class='icon-box-title text-normal']")
    public WebElement adressesYazi;

    @FindBy (xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAdresADD;

    @FindBy (xpath = "//*[@for='billing_first_name']")
    public WebElement firstNameYazi;

    @FindBy (xpath = "//*[@value='kennis.kennis@feerock.com']")
    public WebElement emailValue;


    @FindBy (xpath = "//*[@name='billing_first_name']")
    public WebElement adressesFirstNameAs;


    @FindBy (xpath = "//*[@name='billing_last_name']")
    public WebElement adressesLastNameAs;

    @FindBy (xpath = "(//*[@role='presentation'])[1]")
    public WebElement adressesCountry_Region;

    @FindBy (xpath = "//*[@class='select2-search__field']")
    public WebElement adressesCountry_Region_Text;

    @FindBy (xpath = "//*[@name='billing_address_1']")
    public  WebElement streetAdressAs;

    @FindBy (xpath = "(//*[@aria-owns='select2-billing_state-results'])[1]")
    public WebElement countyStateAs;

    @FindBy (xpath = "//*[@name='billing_city']")
    public WebElement townCityAs;


    @FindBy (xpath = "(//*[@aria-activedescendant='select2-billing_state-result-uloj-AL-01'])[1]")
    public WebElement countyStateTextAs;

    @FindBy (xpath = "//*[@name='billing_postcode']")
    public  WebElement postcode_zipAs;

    @FindBy(xpath = "//*[@name='billing_phone']")
    public WebElement phoneAs;


    @FindBy (xpath = "//*[@class='btn btn-dark btn-rounded btn-sm']")
    public WebElement saveAdressButonAs;

    @FindBy (xpath = "//*[@class='woocommerce-error']")
    public WebElement fieldErrorAs;





}
