package sintaxeBasica.condicionais;

public class condicionalSwitch {
    public static void main(String[] args) {
        String sigla = "M";

        condicionaisEncadeadas(sigla);
        switchCase(sigla);
        switchSemBreak();

    }

    public static void condicionaisEncadeadas(String sigla) {
        if (sigla == "P") {
            System.out.println("PEQUENO");
        } else if (sigla == "M") {
            System.out.println("MÉDIO");
        } else if (sigla == "G") {
            System.out.println("GRANDE");
        } else {
            System.out.println("INDEFINIDO");
        }
    }

    public static void switchCase(String sigla) {
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }

    public static void switchSemBreak() {
        String plano = "T"; // Opções B, M e T.

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram");
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
