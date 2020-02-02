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
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lhernaro\\Documents\\chromedriver.exe");
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


        this.driver.findElement(objectos.getTipoDocumento()).click();
        Thread.sleep(2000);
        this.driver.findElement(objectos.getTipoPasaporte()).click();
        System.out.println("Se ha seleccionado pasaporte como tipo de documento");
        this.driver.findElement(objectos.getNumeroDocumento()).sendKeys("115966170");
        System.out.println("se ha colocado el usuario");
        Thread.sleep(1000);
        this.driver.findElement(objectos.getPasswordUsuario()).sendKeys("95753896");
        this.driver.findElement(objectos.getBotonLogin()).click();
        Thread.sleep(5000);
        String saldoActual = this.driver.findElement(objectos.getSaldoActual()).getText();
        System.out.println("El saldo actual es " + saldoActual);





    }
/*
    @After
    public void cerrarSelenium (){
        this.driver.quit();



    }


 */



    }





