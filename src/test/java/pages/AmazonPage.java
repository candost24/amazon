package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucu;

}
