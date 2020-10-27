package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
    WebDriver firefoxDriver;
    //creamos los elementos que armamos
    PaginaPrincipal paginaPrincipal;
    PaginaSignIn paginaSignIn;
    PaginaCategoriaTshirts paginaCategoriaTshirts;
    PaginaSummary paginaSummary;
    PaginaAddress paginaAddress;
    PaginaShipping paginaShipping;
    PaginaPayment paginaPayment;

    private void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        paginaSignIn = new PaginaSignIn(driver);
        paginaCategoriaTshirts = new PaginaCategoriaTshirts(driver);
        paginaSummary = new PaginaSummary(driver);
        paginaAddress = new PaginaAddress(driver);
        paginaShipping = new PaginaShipping(driver);
        paginaPayment = new PaginaPayment(driver);

    }

    @Before
    public void AbrirDriver(){
        //encontrar archivo exe de geckodriver
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");

        //creamos opciones sobre nuestro driver
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true);

        //nueva instancia de FirefoxDriver
        firefoxDriver = new FirefoxDriver(options);

        //definimos tiempo de espera con timeout
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        firefoxDriver.manage().window().maximize();

        inicializarPaginas(firefoxDriver);

        //Abrimos una URL
        firefoxDriver.get("http://automationpractice.com/index.php");
    }

    @After
    public void cerrarDriver(){
        firefoxDriver.quit();
    }

}


