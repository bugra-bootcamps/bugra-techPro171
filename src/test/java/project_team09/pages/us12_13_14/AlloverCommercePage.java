package project_team09.pages.us12_13_14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class AlloverCommercePage {//us12 locates

    public AlloverCommercePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInGirisME;

    @FindBy(id = "username")
    public WebElement eMailKutusuME;

    @FindBy(id = "password")
    public WebElement passWordKutusuME;

    @FindBy(name = "login")
    public WebElement signInButtonME;
    @FindBy(xpath = "//*[.='Sign Out']")
    public WebElement signOutButtonME;
    @FindBy(xpath = "//*[@class='greeting mb-0']")
    public WebElement assertME;
    @FindBy(xpath = "(//*[text()='Addresses'])[1]")
    public WebElement addressesTextME;

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement addLinkME;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement billingAddressSayfasiMe;

    @FindBy(name = "billing_first_name")
    public WebElement firstNameKutuME;

    @FindBy(name = "billing_last_name")
    public WebElement lastNameKutuME;

    @FindBy(name = "billing_country")
    public WebElement countryRegionME;

    @FindBy(xpath = "//*[@id = 'billing_address_1']")
    public WebElement streetAddressKutuME;

    @FindBy(xpath = "//*[@id = 'billing_postcode']")
    public WebElement postcodeME;

    @FindBy(xpath = "//*[@id = 'billing_city']")
    public WebElement townME;

    @FindBy(xpath = "//*[@id = 'billing_phone']")
    public WebElement phoneNumberME;

    @FindBy(xpath = "//*[@id = 'billing_email']")
    public WebElement billingMailKutusuME;

    @FindBy(name = "billing_state")
    public WebElement provinceNameME;

    @FindBy(name = "save_address")
    public WebElement saveAddressButtonME;

    @FindBy(xpath = "//*[@class = 'woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement addressChangedME;

    //us13 locate leri

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shippingAdressADDButonuME;
    ;

    @FindBy(name = "shipping_first_name")
    public WebElement shippingfirstNameME;
    ;

    @FindBy(name = "shipping_last_name")
    public WebElement shippinglastNameME;
    ;

    @FindBy(id = "shipping_country")
    public WebElement countryRegionSME;

    @FindBy(name = "shipping_address_1")
    public WebElement streetadressME;

    @FindBy(name = "shipping_postcode")
    public WebElement postCodeZipME;
    @FindBy(name = "shipping_city")
    public WebElement townCityME;
    @FindBy(name = "shipping_state")
    public WebElement provinceShipME;

    //us14 locate leri

    @FindBy(xpath = "(//li)[6]")
    public WebElement storeManagerME;

    @FindBy(xpath = "//*[@id='wcfm_menu']/div[5]/a/span[2]")
    public WebElement productsME;

    @FindBy(xpath = "//*[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement addNewME;

    @FindBy(id = "product_type")
    public WebElement simpleProductME;

    @FindBy(id = "featured_img_display")
    public WebElement fotografEkleBuyukKisimME;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement selectFilesButtonME;

    @FindBy(xpath = "(//button[@type='button'])[83]")
    public WebElement selectButonuME;

    @FindBy(id = "featured_img_display")
    public WebElement yuklenenResimME;
    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement kucukResimEklemeButonuME;

    @FindBy(xpath = "(//*[@class ='attachment save-ready'])[2]")
    public WebElement kucukResimIcinFotografSecmeME;

    @FindBy(xpath = "(//*[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addToGalleryButonuME;

//    @FindBy(name= "")
//    public WebElement storeManagerME;

//    @FindBy(name= "")
//    public WebElement storeManagerME;

//    @FindBy(name= "")
//    public WebElement storeManagerME;

//    @FindBy(name= "")
//    public WebElement storeManagerME;

}