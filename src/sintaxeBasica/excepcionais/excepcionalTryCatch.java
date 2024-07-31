package sintaxeBasica.excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class excepcionalTryCatch {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scan.next();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scan.next();

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scan.nextDouble();

            System.out.println("Olá! Me chamo " + nome.toUpperCase() + " " + sobreNome.toUpperCase() + ".");
            System.out.println("Tenho: " + idade + " anos de idade.");
            System.out.println("Minha altura é " + altura);
            scan.close();

        } catch (InputMismatchException e) {
            System.err.println("Idade e altura devem ser do tipo numericos");
        }

    }
}
