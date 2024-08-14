package sintaxeBasica.condicionais;

public class condicionalSimples {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // Caso a condição for verdadeira (true) o bloco de cógio será executado
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println(saldo);
    }
}
