public class Vestuario extends Produto {
  private String tamanho, cor, material;

  public Vestuario(String nome, int id, int quantidade, double preco, String tamanho, String cor, String material) {
    super(nome, id, quantidade, preco);
    this.tamanho = tamanho;
    this.cor = cor;
    this.material = material;

  }

  @Override
  protected void exibirDetalhes() {
    System.out.printf("""
        --------------------------------------
        Nome: %s
        Preço: %.2f
        ID: %d
        Quantidade: %d
        Tamanho: %s
        Cor: %s
        Material: %s
        --------------------------------------
        """, getNome(), getPreco(), getId(), getQuantidade(), this.tamanho, this.cor, this.material);
  }
}

