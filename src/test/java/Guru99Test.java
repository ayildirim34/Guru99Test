import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Guru99Test {
    @Test
    public void test1 () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        Thread.sleep(1000);
        Guru99Page page = new Guru99Page(driver);
       driver.switchTo().frame(6);
        page.accept.click();
    }

    @Test
    public void test2 () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        Thread.sleep(1000);
        Guru99Page page = new Guru99Page(driver);
        driver.switchTo().frame(6);
        page.accept.click();
        Thread.sleep(2000);

        Select select = new Select(page.dropDown);
        select.selectByValue("Mr");

        Thread.sleep(1000);
        page.isim.click();
        page.isim.sendKeys("Ahmet");
        page.soyisim.click();
        page.soyisim.sendKeys("Y");

        page.telefon.click();
        page.telefon.sendKeys("111111111111");
        Thread.sleep(1000);

        Select select1 = new Select(page.dogYili);
        select1.selectByValue("1981");
        Thread.sleep(1000);

        Select select2 = new Select(page.dogAyi);
        select2.selectByValue("1");
        Thread.sleep(1000);

        Select select3 = new Select(page.dogGünü);
        select3.selectByValue("1");
        Thread.sleep(2000);

        Select select4 = new Select(page.licence);
        select4.selectByValue("15");
        Thread.sleep(1000);

        Select select5 = new Select(page.Occupation);
        select5.selectByValue("12");
        Thread.sleep(1000);

        page.adresStreet.click();
        page.adresStreet.sendKeys("findikli");
        Thread.sleep(1000);

        page.city.click();
        page.city.sendKeys("ist");
        Thread.sleep(1000);

        page.country.click();
        page.country.sendKeys("tur");
        Thread.sleep(1000);

        page.postcode.click();
        page.postcode.sendKeys("111");
        Thread.sleep(1000);

        page.email.click();
        page.email.sendKeys("aaa@email.com");
        Thread.sleep(1000);

        page.password.click();
        page.password.sendKeys("123456");
        Thread.sleep(1000);

        page.passwordconfirm.click();
       // page.passwordconfirm.sendKeys("123456"+ Keys.ENTER);
        //page.onay.click();


    }
}
