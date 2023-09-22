package project_team09.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li)[6]")
    public WebElement StoreManagerButtonLocate;

    @FindBy(xpath = "(//li)[7]")
    public WebElement OrdersButtonLocate;

    @FindBy(xpath = "(//li)[8]")
    public WebElement DownloadsButtonLocate;

    @FindBy(xpath = "(//li)[9]")
    public WebElement AddressesButtonLocate;

    @FindBy(xpath = "(//li)[10]")
    public WebElement AccountDetailsButtonLocate;

    @FindBy(xpath = "(//li)[11]")
    public WebElement WishlistButtonLocate;

    @FindBy(xpath = "(//li)[12]")
    public WebElement SupportTicketsButtonLocate;

    @FindBy(xpath = "(//li)[13]")
    public WebElement FollowingsButtonLocate;


    @FindBy(xpath = "(//li)[14]")
    public WebElement LogoutButtonLocate;


    @FindBy(xpath = "(//*[.='Register'])[2]")
    public WebElement RegisterButtonLocate;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement BecomeVendorButtonLocate;



    @FindBy(id = "password_strength")
    public WebElement verifyPassword;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement PasswordTextBoxLocate;

}



