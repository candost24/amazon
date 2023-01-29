package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskRadioPage {



    public TaskRadioPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@role='button'])[2]")
    public   WebElement hesapOlustur;

    @FindBy(name = "firstname")
    public  WebElement name;

    @FindBy(name = "lastname")
    public  WebElement lastname;

    @FindBy(name = "reg_email__")
    public  WebElement email;

    @FindBy(name = "reg_email_confirmation__")
    public  WebElement emailAgain;

    @FindBy(name = "reg_passwd__")
    public WebElement password;

    @FindBy(id = "day")
    public WebElement dayText;

    @FindBy(id = "month")
    public WebElement monthText;

    @FindBy(id = "year")
    public WebElement yearText;

    @FindBy(xpath = "(//input[@name='sex'])[1]")
    public WebElement kadin;

    @FindBy(xpath = "(//input[@name='sex'])[2]")
    public WebElement erkek;

    @FindBy(name = "websubmit")
    public WebElement kaydol;

    public  void secim(WebElement text, String value){
        Select select = new Select(text);
        select.selectByValue(value);
    }









}
