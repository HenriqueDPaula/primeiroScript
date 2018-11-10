package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open {

    public static final String CHROME_DRIVER = "C:\\Users\\opet\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public static final String MOBILIS_WEB = "http://homologacao.mobilis.com.br:8080/mobiweb/#/login";

    @Test
    public void openWindow(){
//        System.setProperty("webdriver.chrome.driver", "/Users/opet/Downloads/chromedriver_win32/chromedriver");
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

        WebDriver navegador = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(navegador, 10);

        navegador.get(MOBILIS_WEB);
        navegador.manage().window().maximize();

        //LOGIN E SENHA
        navegador.findElement(By.id("md-input-1")).sendKeys("00689029993");
        navegador.findElement(By.id("md-input-3")).sendKeys("MobilisAdmin2017");
        navegador.findElement(By.id("md-input-3")).submit();

        //CFC TESTE 01
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")).click();

        //CADASTRO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[1]/div")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[1]/div")).click();

        //ALUNO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[2]/div/div/a")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[2]/div/div/a")).click();

        //NOVO ALUNO
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='card']/md-card-content/button/div[1]")));
        navegador.findElement(By.xpath("//*[@id='card']/md-card-content/button/div[1]")).click();

        //CAMPOS OBRIGATÓRIOS
        navegador.findElement(By.id("md-input-7")).sendKeys("95487774013");
        navegador.findElement(By.id("md-input-9")).sendKeys("77462hd");
        navegador.findElement(By.id("md-input-11")).sendKeys("AEHOO CARAI");

        //CADASTRAR
        navegador.findElement(By.xpath("//*[@id='cdk-overlay-0']/md-dialog-container/cdk-focus-trap/div[2]/ng-component/form/div[2]/button[2]/div[1]")).click();

//        navegador.quit();
        Assert.assertEquals(1, 1);
    }
}
