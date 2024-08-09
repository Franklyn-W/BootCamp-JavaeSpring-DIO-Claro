package pilaresPOO.interfaces.estabelecimento;

import pilaresPOO.interfaces.equipamentos.copiadora.Copiadora;
import pilaresPOO.interfaces.equipamentos.digitalizadora.Digitalizadora;
import pilaresPOO.interfaces.equipamentos.impressora.Impressora;
import pilaresPOO.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {public static void main(String[] args) {
    Impressora impressora = new EquipamentoMultifuncional();
    Digitalizadora digitalizadora = new EquipamentoMultifuncional();
    Copiadora copiadora = new EquipamentoMultifuncional();

    EquipamentoMultifuncional esEquipamentoMultifuncional = new EquipamentoMultifuncional();

    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();

    esEquipamentoMultifuncional.imprimir();
    esEquipamentoMultifuncional.digitalizar();
    esEquipamentoMultifuncional.copiar();
}

}
