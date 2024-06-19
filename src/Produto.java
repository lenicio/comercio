public abstract class Produto {

  private String nome;
  private int id, quantidade;
  private double preco;

  protected Produto(String nome, int id, int quantidade, double preco) {
    this.nome = nome;
    this.id = id;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  protected void exibirDetalhes() {
    System.out.printf("""
        --------------------------------------
        Nome: %s
        Preço: %.2f
        ID: %d
        Quantidade: %d
        --------------------------------------
        """, nome, preco, id, quantidade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
}
