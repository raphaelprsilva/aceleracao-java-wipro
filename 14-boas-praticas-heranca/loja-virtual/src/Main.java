import br.com.elraphael.loja.Carrinho;
import br.com.elraphael.loja.ItemCarrinho;
import br.com.elraphael.loja.pagamento.CartaoCredito;
import br.com.elraphael.loja.pagamento.MetodoPagamento;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("234234");

        carrinho.finalizar(metodoPagamento);
    }
}