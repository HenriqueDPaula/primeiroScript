package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
    @Test
    public void openWindow(){
//        System.setProperty("webdriver.chrome.driver", "/Users/opet/Downloads/chromedriver_win32/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\opet\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();
        navegador.get("http://www.opet.com.br");
        navegador.quit();
        Assert.assertEquals(1, 1);
    }
}
