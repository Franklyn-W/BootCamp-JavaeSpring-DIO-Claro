package pilaresPOO.interfaces.equipamentos.multifuncional;

import pilaresPOO.interfaces.equipamentos.copiadora.Copiadora;
import pilaresPOO.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilaresPOO.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");

    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");

    }

    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

}
