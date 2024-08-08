package pooComJava.visibilidadeRecursos.lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("ESCOLHENDO O LANCHE");
    }

    public void fazerPedido() {
        System.out.println("FAZENDO O PEDIDO");
    }

    public void pagarConta() {
        consultarSaldoAplicativo();
        System.out.println("PAGANDO A CONTA");
    }

    private void consultarSaldoAplicativo() {
        System.out.println("CONSULTANDO O SALDO NO APLICATIVO");
    }
    /*
     * Cliente não retira mais pedido no balcao
     * public void pegarPedidoBalcao(){
     * System.out.println("PEGANDO O PEDIDO NO BALCAO");
     * }
     */
}
