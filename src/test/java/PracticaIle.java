import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PracticaIle {

private WebDriver driver;
private String urlBanco ="https://www.google.com";
private String usuario;
private String password;
private PageObject objectos;






    @Before
    public void iniciarSelenium (){

        System.out.println("iniciando automation");


    }


    @Test
    public void loginBanco () throws InterruptedException {
        //entrar en la web

        //this.driver.get(urlBanco);
        System.out.println("se ha abierto la pagina de inicio");











    }
/*
    @After
    public void cerrarSelenium (){
        this.driver.quit();



    }


 */



    }





