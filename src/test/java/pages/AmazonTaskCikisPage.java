package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonTaskCikisPage {
    private WebDriver driver;

    public AmazonTaskCikisPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(tagName = "h1")
    private WebElement txtGirisYap;

    public void verifyCikis(){
        Assert.assertTrue(txtGirisYap.getText().toLowerCase().contains("giriş yap"));
        driver.quit();
    }
}
