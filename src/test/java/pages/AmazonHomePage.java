package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonHomePage {
    private WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement txtHesapAdi;

    public void verifyHesapLoginControl(){
        Assert.assertTrue(txtHesapAdi.getText().toLowerCase().contains("bekir"));
    }

    @FindBy(id="searchDropdownBox")
    private WebElement slctKategori;

    public void drpDownSecim(){
        Select select = new Select(slctKategori);
        select.selectByVisibleText("Bilgisayarlar");
    }
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    public void txtSendKeysMSI(){
        searchBox.sendKeys("MSI"+ Keys.ENTER);

    }




}
