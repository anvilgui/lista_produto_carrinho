package comercio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
  private double valorTotal;
  private List<Produto> produtos = new ArrayList<Produto>();

  public void adicionar(Produto produto) {
    produtos.add(produto);
    valorTotal += produto.getPreco();
  }
    
  public void mostrarProdutos() {
    System.out.println("PRODUTOS DO CARRINHO");
      for (Produto produto : produtos) {
        System.out.format("%s (Categoria: %s) - R$%.2f\n", produto.getNome(), produto.getCategoria(), produto.getPreco());
      }
      System.out.println("Valor total dos Produtos: R$ " + valorTotal);

  }
    
  public double getTotal() {
    return valorTotal;
  }

}