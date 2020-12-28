import java.util.ArrayList;

import comercio.Carrinho;
import comercio.Produto;

public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto("1. Champagne Sidra Cereser 660 ml", "Bebidas", 15.99);
    Produto produto2 = new Produto("2. Pera Portuguesa Kg", "Hortifruti", 17.99);
    Produto produto3 = new Produto("3. Azeitona Verde Zaeli Especial 500g", "Mercearia", 26.99);
    Produto produto4 = new Produto("4. Bacon Sadia Inteiro 1 Kg", "Açougue", 37.99);
    Produto produto5 = new Produto("5. Kit Alvejante Vanish 2x1 Po2+White", "Limpeza", 49.99);

    Carrinho carrinho1 = new Carrinho();
    carrinho1.adicionar(produto1);
    carrinho1.adicionar(produto2);
    carrinho1.adicionar(produto3);
    carrinho1.adicionar(produto4);
    carrinho1.adicionar(produto5);

    carrinho1.mostrarProdutos();

  }
  
}