import org.openqa.selenium.By;

public class PageObject {

    private By botonDeAcceso = By.xpath("//*[contains(@class,'wlr_btn wlr_btn02')]");

    public By getNumeroDocumento() {
        return numeroDocumento;
    }

    private By numeroDocumento = By.xpath("//*[@id='input_5']");

    private By tipoDocumento = By.xpath("//*[@id='select_value_label_7']");

    private By tipoPasaporte =By.xpath("//*[@id='I']");

    private By passwordUsuario = By.xpath("//*[@id='input_6']");

    private  By botonLogin = By.xpath("//*[@id='submit_form']");

    private By saldoActual = By.xpath("/html/body/app-root/section/app-aside-layout/div/div[3]/div[1]/div/app-posicion-global-main/div/app-pg-summary/div/div/div[1]/div/div[1]/span[2]/span/span");

    public By getSaldoActual() {
        return saldoActual;
    }

    public By getBotonLogin() {
        return botonLogin;
    }



    public By getPasswordUsuario() {
        return passwordUsuario;
    }

    public By getTipoPasaporte() {
        return tipoPasaporte;
    }

    public By getTipoDocumento() {
        return tipoDocumento;
    }

    public By getBotonDeAcceso() {
        return botonDeAcceso;
    }


}
