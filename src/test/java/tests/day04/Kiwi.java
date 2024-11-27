package tests.day04;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Kiwi {

    //uygulamanin basariyla acildigi dogrulanir
    // misafir olarak devam et e tiklanir
    // ardindan gelecek olan 3 adimda da yesil butona basilarak devam edilir
    // Trip type,one way olarak secilir
    // kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir
    // kalkis yapilacak ulke/sehir girilir ve sec e tiklanir
    // varis ulkesi secenegine tiklanir ve gidilecek ulke girilir
    // gidis tarihi 27 Kasim olarak secilir ve set date e tiklanir
    // search butonuna tiklanir
    // en  ucuz ve aktarmasiz filtrelemeleri yapilir
    // gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

    @Test
    public void KiwiTest(){
        // uygulamanin yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("com.skypicker.main"));

        //uygulamanin basariyla acildigi dogrulanir

    }


}
