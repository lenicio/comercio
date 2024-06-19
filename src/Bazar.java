public class Bazar extends Produto implements Descontavel{
  public Bazar(String nome, int id, int quantidade, double preco) {
    super(nome, id, quantidade, preco);
  }

  @Override
  public void aplicarDesconto(double percentual) {
    setPreco(getPreco() * (1 - (percentual/100)));
  }


}
