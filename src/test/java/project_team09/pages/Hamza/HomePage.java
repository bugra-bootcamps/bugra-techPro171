package project_team09.pages.Hamza;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import project_team09.utilities.Driver;

public class HomePage {

    public HomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement SignInButton;

    @FindBy(xpath = "(//*[@*='username'])[2]")
    public WebElement Username;

    @FindBy(xpath = "(//input)[2]")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[text()='Search results for “Shoes”']")
    public WebElement aramaSonucu;

    @FindBy(xpath = "(//p)[2]")
    public WebElement NoaramaSonucu;



}
