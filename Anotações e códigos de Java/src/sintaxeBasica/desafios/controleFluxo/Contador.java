package sintaxeBasica.desafios.controleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int parametro1 = scan.nextInt();
        int parametro2 = scan.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scan.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;
        for (int i = 1; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}
