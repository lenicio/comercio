public class Eletronico extends Produto implements Descontavel{
  private String marca, modelo;
  private int garantia;

  public Eletronico(String nome, int id, int quantidade, double preco, String marca, String modelo, int garantia) {
    super(nome, id, quantidade, preco);
    this.marca = marca;
    this.modelo = modelo;
    this.garantia = garantia;
  }

  @Override
  public void exibirDetalhes() {
    System.out.printf("""
        --------------------------------------
        Nome: %s
        Preço: %.2f
        ID: %d
        Quantidade: %d
        Marca: %s
        Modelo: %s
        Garantia: %d
        --------------------------------------
        """, getNome(), getPreco(), getId(), getQuantidade(), this.marca, this.modelo, this.garantia);
  }

  @Override
  public void aplicarDesconto(double percentual) {
    setPreco(getPreco() * (1 - (percentual/100)));
  }
}
