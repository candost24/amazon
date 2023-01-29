package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonProductTwoPage {
    private WebDriver driver;

    public AmazonProductTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void sayfaTwoVerify(){
        Assert.assertTrue(driver.getCurrentUrl().contains("page=2"));
    }

    @FindBy(xpath = "(//h2/a)[2]")
    private WebElement textTwoProduct;

    public void twoProductClick(){
        textTwoProduct.click();
    }





}
