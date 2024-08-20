package collectionsJava.List.excercicosOpBasicasList.exerc02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensARemover = new ArrayList<>();

        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensARemover.add(item);
            }
        }
        carrinho.removeAll(itensARemover);
    }

    public void calcularValorTotal() {
        double soma = 0;

        for (Item item : carrinho) {
            soma += (item.getPreco() * item.getQuantidade());
        }

        System.out.println("Soma total dos itens do carrinho: R$ " + soma);
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Lápis",2, 3);
        carrinho.adicionarItem("Lápis",2, 3);
        carrinho.adicionarItem("Caderno",35, 1);
        carrinho.adicionarItem("Borracha",2, 2);

        carrinho.exibirItens();

        carrinho.removerItem("Lápis");

        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }

}
