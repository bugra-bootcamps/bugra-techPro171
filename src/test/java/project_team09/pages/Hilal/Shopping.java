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



    @FindBy(xpath = "//input[@aria-label='Search']")
    public static WebElement searchBoxHb;

    @FindBy(xpath = "//*[@data-product-id='14635']")
    public static WebElement firstHeartHb;

    @FindBy(xpath = "//*[@data-product-id='24334']")
    public static WebElement secondHeartHb;


    @FindBy(xpath = "(//*[@src='https://allovercommerce.com/wp-content/uploads/2022/10/kitap-1-255x300.jpg'])[2]")
    public static WebElement ilkUrun;

    @FindBy(id = "data-product_id")
    public static WebElement addToCardHb;

    @FindBy(xpath = " (//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")
    public static WebElement ilkUrun2;


    @FindBy(xpath = "//*[@class='w-icon-heart']")
    public static WebElement whishListButtonHb;

    @FindBy(xpath = "(//*[@data-product_id='24334'])[1]")
    public static WebElement whishListverify1;

    @FindBy(xpath = "(//*[@class='product-name'])[3]")
    public static WebElement whishListverify2;

    @FindBy(xpath = "(//*[@class='product-thumbnail'])[1]")
    public static WebElement productverify;

    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[1]")
    public static WebElement quickyViewfirst;

    @FindBy(xpath = "(//*[@class='btn btn-quickview btn-outline btn-default btn-rounded btn-sm mr-lg-2'])[2]")
    public static WebElement quickyViewsecond;

    @FindBy(xpath = "//*[@class='btn btn-success btn-md']")
    public static WebElement viewCartHb;


    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public static WebElement ProceedToCheckOutHb;



    @FindBy(xpath = "//input[@id='username']")public static WebElement userNameEB;
    @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement lasttNameEB;
    @FindBy(xpath = "//*[@id='select2-billing_country-container']") public WebElement countryButonEB;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement streetButonEB;
    @FindBy(xpath = "//*[@id='select2-billing_state-container']") public WebElement stateButonEB;
    @FindBy(xpath = "//*[@id='billing_postcode']")public WebElement zipCodeButonuEB;
    @FindBy(xpath = "//*[@class='input-radio'])[1]")public WebElement wireTransferButonuEB;
    @FindBy(xpath = "//*[@value='Place order']")   public WebElement PlaceorderButonuEB;
    @FindBy(xpath = "(//*[@type='email'])[1]") public  WebElement emailEB;
    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']") public WebElement thankyuYazisi;
    @FindBy(xpath = "//*[@id='coupon_code']")public WebElement couponDiscountField;
    @FindBy(xpath = "//*[@name='apply_coupon']")    public WebElement applyCouponEB;



}