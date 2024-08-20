package collectionsJava.List.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numerosInteiros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        // Seta o maiorNumero como o menor valor de um int de 32bit
        int maiorNumero = Integer.MIN_VALUE;

        for (Integer numero : numerosInteiros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        // Seta o menorNumero como o maior possivel de Integer 32bits
        int menorNumero = Integer.MAX_VALUE;

        for (Integer numero : numerosInteiros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;

    }

    public void exibirNumeros(){
        System.out.println("Todos os numeros da lista: " + numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();


        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();
        
        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor numero da lista: " + somaNumeros.encontrarMenorNumero());
    }

}
