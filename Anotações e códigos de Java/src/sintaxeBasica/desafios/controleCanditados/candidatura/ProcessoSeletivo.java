package sintaxeBasica.desafios.controleCanditados.candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProcessoSeletivo {

    private static ArrayList<Candidato> candidatosSelecionados = new ArrayList<>();
    private static ArrayList<Candidato> candidatosANegociar = new ArrayList<>();
    private static ArrayList<Candidato> candidatosAguardando = new ArrayList<>();

    private static double salarioBase = 2000.0;

    public static void main(String[] args) {
        String novaPesquisa = "Y";

        Scanner scan = new Scanner(System.in);

        while (novaPesquisa == "Y") {

            selecaoCandidatos();

            System.out.println("Candidatos selecionados" + candidatosSelecionados);
            System.out.println("Candidatos a negociar" + candidatosANegociar);
            System.out.println("Candidatos aguardando resultado dos demais" + candidatosAguardando);

            if (candidatosSelecionados.size() < 5) {
                repescagem();
            }

            System.out.println("Candidatos selecionados" + candidatosSelecionados);
            System.out.println("Candidatos a negociar" + candidatosANegociar);
            System.out.println("Candidatos aguardando resultado dos demais" + candidatosAguardando);

            imprimirSelecionados();

            entrandoEmContato();

            System.out.println("Realizar nova pesquisa? (Y/N)");
            novaPesquisa = scan.next().toUpperCase();
        }
        scan.close();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Wulublor", "Queosisn", "Tyuiskeo", "Beutiuns", "Haidamal", "Dieziaxo", "Muwehier",
                "Fionuxun", "Buealbia", "Xuinuois" };

        System.out.println("----------------------FILTRAGEM INICIAL DOS CANDIDADTOS----------------------");
        for (String candidato : candidatos) {
            analisarCandidato(candidato);
        }
    }

    static void analisarCandidato(String candidato) {

        Candidato candidatoAtual = new Candidato(candidato);

        System.out.println(
                "O candidato " + candidatoAtual.getNomeCanditado()
                        + " solicitou este valor de salario: R$ "
                        + candidatoAtual.getSalarioPretendido());

        if (salarioBase > candidatoAtual.getSalarioPretendido()) {
            System.out.println(
                    "O candidato " + candidatoAtual.getNomeCanditado()
                            + " foi selecionado para a vaga\n");
            candidatosSelecionados.add(candidatoAtual);

        } else if (salarioBase == candidatoAtual.getSalarioPretendido()) {
            System.out.println("Realizar contato de contra proposta para o candidato " + candidatoAtual + "\n");
            candidatosAguardando.add(candidatoAtual);

        } else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS\n");
            candidatosANegociar.add(candidatoAtual);
        }
    }

    static void repescagem() {
        while (candidatosSelecionados.size() < 5) {
            System.out
                    .println("\n----------------------COMPLETANDO LISTA DE CANDIDATOS APROVADOS----------------------");
            for (int i = 0; candidatosSelecionados.size() < 5 && i < candidatosAguardando.size(); i++) {
                Candidato candidatoRepescagem = candidatosAguardando.get(i);
                candidatoRepescagem.setNovoSalarioPretendido();
                if (candidatoRepescagem.getSalarioPretendido() < salarioBase) {
                    System.out.println(
                            "O candidato " + candidatoRepescagem.getNomeCanditado().toString()
                                    + " solicitou este valor de salario: R$ "
                                    + candidatoRepescagem.getSalarioPretendido());
                    System.out.println(
                            "O candidato " + candidatoRepescagem.getNomeCanditado().toString()
                                    + " foi selecionado para a vaga\n");
                    candidatosSelecionados.add(candidatoRepescagem);
                    candidatosAguardando.remove(candidatoRepescagem);
                }
            }

            for (int i = 0; candidatosSelecionados.size() < 5 && i < candidatosANegociar.size(); i++) {
                Candidato candidatoRepescagem = candidatosANegociar.get(i);
                candidatoRepescagem.setNovoSalarioPretendido();
                if (candidatoRepescagem.getSalarioPretendido() < salarioBase) {
                    System.out.println(
                            "O candidato " + candidatoRepescagem.getNomeCanditado().toString()
                                    + " solicitou este valor de salario: R$ "
                                    + candidatoRepescagem.getSalarioPretendido());
                    System.out.println(
                            "O candidato " + candidatoRepescagem.getNomeCanditado().toString()
                                    + " foi selecionado para a vaga\n");
                    candidatosSelecionados.add(candidatoRepescagem);
                    candidatosANegociar.remove(candidatoRepescagem);
                }
            }
        }
    }

    static void imprimirSelecionados() {

        System.out.println("\nImprimindo a lista de candidatos, informando o indice do elemento");

        System.out.println("Utilizando laço for");
        for (int indice = 0; indice < candidatosSelecionados.size(); indice++) {
            System.out.println("O candidato no indice " + (indice + 1) + " é o "
                    + candidatosSelecionados.get(indice).getNomeCanditado());
        }

        System.out.println("\nUtilizando laço foreach");
        for (Candidato candidato : candidatosSelecionados) {
            System.out.println("O candidato " + candidato.getNomeCanditado() + " foi selecionado");
        }
        System.out.println();
    }

    static void entrandoEmContato() {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.println("----------------------ENTRANDO EM CONTATO COM OS SELECIONADOS----------------------");

        for (Candidato candidato : candidatosSelecionados) {
            
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                
                if (continuarTentando) {
                    tentativasRealizadas++;
                } else {
                    System.out.println("CONTATO REALIZADO COM SUCESSO " + candidato.getNomeCanditado().toUpperCase());
                }
                
            } while (continuarTentando && tentativasRealizadas < 4);
            
            if (atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato.getNomeCanditado().toUpperCase() + " APÓS " + tentativasRealizadas
                + " TENTATIVAS\n");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato.getNomeCanditado().toUpperCase() + "\n");
            }
        }
    }

    // Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
        // Gera randomicamente um número entre 1 e 3
        // Caso o número gerado seja igual a 1, o método retorna true
    }
}
