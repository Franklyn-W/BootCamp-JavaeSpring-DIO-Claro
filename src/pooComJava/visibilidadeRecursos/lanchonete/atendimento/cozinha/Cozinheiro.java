package pooComJava.visibilidadeRecursos.lanchonete.atendimento.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        prepararLanche();
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }

    public void adicionarSucoNoBalcao() {
        prepararVitamina();
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao() {
        prepararCombo();
    }

    private void prepararLanche() {
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBUGUER");
    }

    private void prepararVitamina() {
        baterVitaminaLiquidificador();
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        lavarIngredientes();
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        lavarIngredientes();
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        pedirIngredientes(null);
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        selecionarIngredientesVitamina();
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }

    private void fritarIngredientesLanche() {
        selecionarIngredientesLanche();
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBUGUER");
    }

    // Cozinheiro não pode mais pedir para o atendente trocar o gas
    /*
     * public void pedirParaTrocarGas(Atendente meuAmigo) {
     * meuAmigo.trocarGas();
     * }
     */

    /* Comentado para apagar aviso de não uso do método
     * private void pedirParaTrocarGas(Almoxarife meuAmigo) {
     * meuAmigo.trocarGas();
     * }
     */

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
