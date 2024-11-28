package tests.day05;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllCurrencyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AllCurrencyCon {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AllCurrencyPage page=new AllCurrencyPage();

    @Test
    public void allCurrencyCon() throws InterruptedException {
        // all currency uygulamasinin yuklendigi dogulanir
        Assert.assertTrue(driver.isAppInstalled("com.smartwho.SmartAllCurrencyConverter"));

        // uygulamanin acildigi dogrulanir
        //Assert.assertTrue(page.acilisSayfasiYazisi.isDisplayed());
        Assert.assertTrue(driver.findElementByXPath("//*[@text='CURRENCY CONVERTER']").isDisplayed());

        // cevirmek istedigimiz para birimi Türk Lirasi olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(350,450,500);
        ReusableMethods.scrollWithUiScrollableAndClick("TRY");
        Thread.sleep(2000);
        page.bir.click();
        page.ucSifir.click();

        // cevirelecek olan para birimi Rus Rublesi olarak secilir
        ReusableMethods.koordinatTiklamaMethodu(350,650,500);
        ReusableMethods.scrollWithUiScrollableAndClick("Russian Ruble");


        // cevrilen tutar screenShot olarak kaydedilir

    }













    // Ardindan japon yeni nin tl karsiligi olan tl degeri kaydedilir
    // kullaniciya sms olarak bildirilir

}
