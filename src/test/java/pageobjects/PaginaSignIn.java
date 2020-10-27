package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSignIn {

    @FindBy (xpath = "//input[@id='email']")
    WebElement campoEmail;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement campoPassword;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement botonSignIn;

    private void llenarCampoEmail(String email){
        campoEmail.sendKeys(email);
    }

    private void llenarCampoPassword(String password){
        campoPassword.sendKeys(password);
    }

    private void hacerClickSignIn(){
        botonSignIn.click();
    }

    public void identificarse(String email, String password){
        llenarCampoEmail(email);
        llenarCampoPassword(password);
        hacerClickSignIn();
    }

    public PaginaSignIn(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
