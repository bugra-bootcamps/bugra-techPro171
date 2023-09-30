package project_team09.pages.Hilal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class Shopping {

    public Shopping() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //User Hopping-SıgnIn

    @FindBy(xpath = "//*[@class='login inline-type']")
    public static WebElement singINHb;

    @FindBy(css = "#username")
    public static WebElement userNameOrEmailhb;

    @FindBy(css = "//input[@id='password']")
    public WebElement userPasswordhb;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement userSingInSavehb;


    //Register

    @FindBy(css = "//input[@id='password']")
    public WebElement registerButttonhb;


    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButtonHb;


    @FindBy(css = "#username")
    public WebElement registerUserNameHb;

    @FindBy(css = "#register-policy")
    public WebElement registerCheckBoxButtonHb;

    @FindBy(xpath = "//button[@value='Sign Up']")
    public WebElement registerSignUpButtonHb;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public static WebElement searchBoxHb ;

    @FindBy(xpath = "//*[@data-product-id='14791']")
    public static WebElement firstHeartHb;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[1]")
    public static WebElement secondHeartHb;



    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")
    public static WebElement ilkUrun;

    @FindBy(id = "data-product_id")
    public static WebElement addToCardHb;

    @FindBy(xpath = " (//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")
    public static WebElement ilkUrun2;


    @FindBy(id = "//*[@class='w-iconheart']")
    public static WebElement whishListButtonHb;

    @FindBy(id = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1] ")
    public static WebElement whishListverify1;

    @FindBy(id = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")
    public static WebElement whishListverify2;
}
