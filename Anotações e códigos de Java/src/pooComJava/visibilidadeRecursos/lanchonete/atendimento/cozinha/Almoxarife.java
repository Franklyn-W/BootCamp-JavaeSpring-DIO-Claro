package pooComJava.visibilidadeRecursos.lanchonete.atendimento.cozinha;

public class Almoxarife {
    /* Comentado para apagar aviso de não uso do método
     * private void controlarEntrada() {
     * System.out.println("CONTROLANDO A ENTRADA DE ITENS");
     * }
     */

    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }

    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }

}
