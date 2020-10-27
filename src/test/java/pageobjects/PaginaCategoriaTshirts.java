package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaginaCategoriaTshirts{
    WebDriver driver;

    @FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
    WebElement fadedShortsSleeve;

    @FindBy(xpath ="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")
    WebElement botonAddToCard;

    @FindBy(xpath ="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
    WebElement botonCheckOut;

    public void comprarfadedShortsSleeve(){
        Actions action = new Actions(this.driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", fadedShortsSleeve);
        action.moveToElement(fadedShortsSleeve).moveToElement(botonAddToCard)
                .click().build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));
        action.moveToElement(botonCheckOut);
        action.click();
        action.perform();
    }

    public PaginaCategoriaTshirts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
