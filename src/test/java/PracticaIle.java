import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

public class PracticaIle {

private WebDriver driver;
private String urlBanco ="https://www.bancosantander.es/es/particulares";
private String usuario;
private String password;
private PageObject objectos;






    @Before
    public void iniciarSelenium (){
        System.setProperty("webdriver.chrome.driver","/chromedriver.exe");
        driver = new ChromeDriver();
        objectos = new PageObject();
        System.out.println("iniciando automation");


    }


    @Test
    public void loginBanco () throws InterruptedException {
        //entrar en la web

        this.driver.get(urlBanco);
        this.driver.findElement(objectos.getBotonDeAcceso()).click();
        Thread.sleep(3000);

        this.driver.switchTo().frame("wlr_aframe");








    }
/*
    @After
    public void cerrarSelenium (){
        this.driver.quit();



    }


 */



    }





