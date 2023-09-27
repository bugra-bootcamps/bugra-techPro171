package project_team09.pages.Hilal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class VendorGiris {
    public   VendorGiris() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement SıngIN;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeVendor;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement vendorRegistrationTxt;



    @FindBy (xpath = "//*[@class='nav-link']")
    public WebElement signUp;


    @FindBy (xpath = "//*[@id='user_email']")
    public  WebElement email;

    @FindBy (xpath = "//*[@class='w-icon-account']" )
    public WebElement signIn;

}
