import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  List<Produto> produtos;

  public CarrinhoDeCompras() {
    produtos = new ArrayList<>();
  }

  public void adicionarProduto(Produto p) {
    this.produtos.add(p);
  }

  public void removerProduto(Produto p) {
    this.produtos.remove(p);
  }

  public double calcularTotal() {
    double total = 0;

    for (Produto produto : produtos) {
      total += produto.getPreco() * produto.getQuantidade();
    }

    return total;
  }

  public void exibirDetalhesCarrinho() {
    for (Produto produto : produtos) {
      produto.exibirDetalhes();
    }
    System.out.printf("TOTAL DO CARRINHO: %.2f", calcularTotal());
  }


}
