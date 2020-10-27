package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPayment {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
    WebElement PayByCheck;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    WebElement botonConfirmar;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[1]")
    WebElement bannerOrdenCompleta;

    public boolean resultadoDeOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerOrdenCompleta.getText());
        return mensaje.equals(bannerOrdenCompleta.getText());
    }

    public void PagarConCheque(){
        PayByCheck.click();
    }

    public void confirmarOrden(){
        botonConfirmar.click();
    }

    public PaginaPayment(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
