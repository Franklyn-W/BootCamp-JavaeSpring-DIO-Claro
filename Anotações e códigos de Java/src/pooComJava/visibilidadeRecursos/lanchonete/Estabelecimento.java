package pooComJava.visibilidadeRecursos.lanchonete;

import pooComJava.visibilidadeRecursos.lanchonete.area.cliente.Cliente;
import pooComJava.visibilidadeRecursos.lanchonete.atendimento.Atendente;
import pooComJava.visibilidadeRecursos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponiveis para toda a aplicação
        /*
         * cozinheiro.lavarIngredientes();
         * cozinheiro.selecionarIngredientesVitamina();
         * cozinheiro.baterVitaminaLiquidificador();
         * cozinheiro.prepararLanche();
         * cozinheiro.prepararVitamina();
         * cozinheiro.prepararCombo();
         */

        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        /*
         * Todas as ações do almoxarife são realizadas em seu pacote, entre ele o
         * cozinheiro
         * Almoxarife almoxarife = new Almoxarife();
         * ações que não precisam estarem disponiveis para toda a aplicação
         * almoxarife.controlarEntrada();
         * almoxarife.controlarSaida();
         * ações que somente o seu pacote cozinha precisa conhecer (default)
         * almoxarife.entregarIngredientes();
         * almoxarife.trocarGas();
         */

        Atendente atendente = new Atendente();
        // Método de pegarLanche é um metodo privado que é chamado pelo outro médodo de
        // servindoMesa
        // atendente.pegarLancheCozinha();
        atendente.servindoMesa();
        atendente.receberPagamento();

        // Atendente não troca mais gas
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        // Cliente não pega mais pedido no balcao
        // cliente.pegarPedidoBalcao();
        // Cliente consulta o saldo dentro do método pagarConta
        // cliente.consultarSaldoAplicativo();
        cliente.pagarConta();

        // Cozinheiro não pede mais para atendente trocar o gas
        // cozinheiro.pedirParaTrocarGas(atendente);

        // O pedido de troca do gás é feito ao almoxarife dentro do pacote de cozinha
        // cozinheiro.pedirParaTrocarGas(almoxarife);
    }

}
