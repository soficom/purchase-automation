package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaShipping {

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    WebElement checkbox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
    WebElement botonCheckOut;

    public void finalizarCompra(){
        checkbox.click();
        botonCheckOut.click();
    }

    public PaginaShipping(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
