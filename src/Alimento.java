public class Alimento extends Produto{
  private String dataValidade, tipo;
  private double peso;

  public Alimento(String nome, int id, int quantidade, double preco, String dataValidade, String tipo, double peso) {
    super(nome, id, quantidade, preco);
    this.dataValidade = dataValidade;
    this.tipo = tipo;
    this.peso = peso;
  }

  @Override
  protected void exibirDetalhes() {
    System.out.printf("""
        --------------------------------------
        Nome: %s
        Preço: %.2f
        ID: %d
        Quantidade: %d
        Data de validade: %s
        Tipo: %s
        Peso: %.2f
        --------------------------------------
        """, getNome(), getPreco(), getId(), getQuantidade(), this.dataValidade, this.tipo, this.peso);
  }
}
