public class Main {
  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarProduto(new Alimento("Coxinha De Costela Com Catupiry", 1, 5, 9.50, "19-06-2024", "Fritura", 200));
    carrinho.adicionarProduto(new Alimento("Pastel de Carne", 2, 10, 7.00, "20-06-2024", "Fritura", 150));
    carrinho.adicionarProduto(new Alimento("Empadinha de Frango", 1, 8, 6.50, "21-06-2024", "Assado", 120));

    carrinho.adicionarProduto(new Eletronico("Smartphone Galaxy S21", 1, 3, 3500.00, "Samsung", "S21", 12));
    carrinho.adicionarProduto(new Eletronico("Notebook Dell Inspiron 15", 2, 5, 4500.00, "Dell", "Inspiron 15", 24));
    carrinho.adicionarProduto(new Eletronico("Smart TV LG 55", 3, 2, 3800.00, "LG", "OLED55", 36));

    carrinho.adicionarProduto(new Vestuario("Camiseta Básica", 1, 20, 49.90, "M", "Branca", "Algodão"));
    carrinho.adicionarProduto(new Vestuario("Calça Jeans", 2, 15, 99.90, "42", "Azul", "Denim"));
    carrinho.adicionarProduto(new Vestuario("Jaqueta de Couro", 3, 5, 299.90, "G", "Preta", "Couro Sintético"));

    carrinho.adicionarProduto(new Bazar("Vaso Decorativo", 1, 10, 25.90));
    carrinho.adicionarProduto(new Bazar("Jogo de Talheres", 2, 5, 99.90));
    carrinho.adicionarProduto(new Bazar("Relógio de Parede", 3, 8, 49.90));

    carrinho.exibirDetalhesCarrinho();

  }
}