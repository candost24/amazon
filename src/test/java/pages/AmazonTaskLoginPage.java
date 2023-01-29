package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTaskLoginPage {
    private WebDriver driver;

    public AmazonTaskLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ap_email")
    private WebElement emailText;

    @FindBy(id = "continue")
    private WebElement devamEtButton;

    @FindBy(id = "ap_password")
    private WebElement sifreButton;

    @FindBy(id = "signInSubmit")
    private WebElement sigInButton;

    public void login(){
        emailText.sendKeys("");
        devamEtButton.click();
        sifreButton.sendKeys("");
        sigInButton.click();
    }

}
