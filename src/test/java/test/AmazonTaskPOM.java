package test;

import pages.*;
import utilities.BaseTestReport;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;


        /*

        Amazon Senaryosu
        o https://www.amazon.com.tr/ sitesi açılır.
        o Ana sayfanın açıldığı kontrol edilir.
        o  Çerez tercihlerinden Çerezleri kabul et seçilir.
        o  Siteye login olunur.
        o Login işlemi kontrol edilir.
        o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        o Bilgisayar kategorisi seçildiği kontrol edilir.
        o Arama alanına MSI yazılır ve arama yapılır.
        o Arama yapıldığı kontrol edilir.
        o Arama sonuçları sayfasından 2. sayfa açılır.
        o 2. sayfanın açıldığı kontrol edilir.
        o Sayfadaki 2. ürün favorilere eklenir.
        o 2. Ürünün favorilere eklendiği kontrol edilir.
        o Hesabım > Favori Listem sayfasına gidilir.
        o “Favori Listem” sayfası açıldığı kontrol edilir.
        o Eklenen ürün favorilerden silinir.
        o Silme işleminin gerçekleştiği kontrol edilir.
        o Üye çıkış işlemi yapılır.
        o Çıkış işleminin yapıldığı kontrol edilir.

         */

public class AmazonTaskPOM extends BaseTestReport {
    @Test
    public void testName() {
       
       PropertyConfigurator.configure("log4j.properties");
       Logger logger = Logger.getLogger(AmazonTaskPOM.class.getName());
        extentTest = extentReports.createTest("testName");
        logger.info("Amazon sitesine gidiliyor");
        driver.get("https://www.amazon.com.tr/");
        logger.info("Tittle doğrulanıyor");
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("amazon"));
        AmazonTaskPOMPage atp = new AmazonTaskPOMPage(driver);
        logger.info("Çerez kabul ediliyor");
        atp.CerezKabul();
        logger.info("Amazon sitesine login olmak için giriş yapa clickleniyor");
        atp.girisYap();
        AmazonTaskLoginPage lp = new AmazonTaskLoginPage(driver);
        logger.info("Amazon sitesine login olunuyor");
        lp.login();
        AmazonHomePage hp = new AmazonHomePage(driver);
        logger.info("Login olma işlemi kontrol ediliyor");
        hp.verifyHesapLoginControl();
        logger.info("Kategorilerden Bilgisayar seçiliyor");
        hp.drpDownSecim();
        logger.info("Arama Kutusuna MSI gönderiliyor ");
        hp.txtSendKeysMSI();
        AmazonProductOnePage op= new AmazonProductOnePage(driver);
        logger.info("MSI arandığı kontrol ediliyor");
        op.verifyMSI();
        logger.info("2. sayfaya gidiliyor");
        op.jseTwoGo();
        AmazonProductTwoPage tp = new AmazonProductTwoPage(driver);
        logger.info("2. sayfaya gidildiği kontrol ediliyor");
        tp.sayfaTwoVerify();
        logger.info("2. ürüne gidiliyor");
        tp.twoProductClick();
        AmazonTaskTwoProductPage ttp= new AmazonTaskTwoProductPage(driver);
        logger.info("2. ürün favorilere ekleniyor");
        ttp.twoProductAddFavorite();
        logger.info("Favori listesine gidiliyor");
        ttp.favoriListClick();
        AmazonTaskFavorListPage fl=new AmazonTaskFavorListPage(driver);
        logger.info("Favori listesine gidildiği kontrol ediliyor");
        fl.verifyAlisVeris();
        logger.info("Favori listesinden ürün kaldırılıyor");
        fl.urunKaldir();
        logger.info("Favori listesinden ürünün kaldırıldığı kontrol ediliyor");
        fl.verifySilindi();
        logger.info("Hesaptan cikis yapılıyor");
        fl.logOutAccount();
        AmazonTaskCikisPage cp = new AmazonTaskCikisPage(driver);
        logger.info("Hesaptan çıkıldığı kontrol ediliyor");
        cp.verifyCikis();


        //<?xml version="1.0" encoding="UTF-8"?>
        //<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

        

    }
}
