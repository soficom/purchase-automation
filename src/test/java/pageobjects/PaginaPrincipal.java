package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement botonSingIn;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a" )
    WebElement etiquetaTshirt;

    public void irAcategoriaTshirt(){
        etiquetaTshirt.click();
    }

    public void irASignIn(){
        botonSingIn.click();
    }

    public PaginaPrincipal(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
