package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaAddress {
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
    WebElement proceedAddress;

    public void hacerClickProceedCheckout(){
        proceedAddress.click();
    }

    public PaginaAddress(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
