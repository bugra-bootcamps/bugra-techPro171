package project_team09.pages.Hilal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class Fakeremail {
    public Fakeremail() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //FAKE LOCATE
    @FindBy(xpath = "//*[@class='color cetc']") public WebElement fakeMailKutu;
    @FindBy(xpath = "//*[@class='color cetc']") public WebElement fakeMailTiklama;
    @FindBy(id = "predmet") public WebElement mailVerivacitonCode;
    @FindBy(id = "confirm_pwd") public WebElement confirmPwd;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']") public WebElement verivacitonInvalidMesajZb;
    @FindBy(xpath ="//*[text()='Please provide a valid email address.']") public WebElement eksikMailHataMesajiZb;
    @FindBy(xpath = "//div[@class='wcfm-message wcfm-error']") public WebElement pswEksikMesaji;
    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']") public WebElement kisaPwdMesaj;
    @FindBy(xpath = "//*[text()='Registration']") public WebElement dogrulamaRegistrationZb;
    @FindBy(xpath = "//*[text()='Welcome to Hubcomfy!']") public WebElement succesMesajZb;




}
