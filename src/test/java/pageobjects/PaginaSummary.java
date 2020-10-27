package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaSummary{
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
    WebElement ProceedToCheckout;

    public void HacerClickEnCheckout(){
        WebDriverWait waits = new WebDriverWait(driver, 10);
        waits.until(ExpectedConditions.elementToBeClickable(ProceedToCheckout));
        WebElement ProceedToCheckout = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ProceedToCheckout);
        ProceedToCheckout.click();
    }

    public PaginaSummary(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
