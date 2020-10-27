package pruebas;
import org.junit.Assert;
import org.junit.Test;

public class Compra extends BaseTestSuite {

    @Test
    public void hacer_una_compra() {
        paginaPrincipal.irASignIn();
        paginaSignIn.identificarse("sofiacontivero@hotmail.com", "12345");
        paginaPrincipal.irAcategoriaTshirt();
        paginaCategoriaTshirts.comprarfadedShortsSleeve();
        paginaSummary.HacerClickEnCheckout();
        paginaAddress.hacerClickProceedCheckout();
        paginaShipping.finalizarCompra();
        paginaPayment.PagarConCheque();
        paginaPayment.confirmarOrden();
        Assert.assertTrue(paginaPayment.resultadoDeOrden("Your order on My Store is complete."));
    }
}
