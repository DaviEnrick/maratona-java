package academyLogicaProgramacao.devdojo.estruturas.condicionais.itelse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 5;
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR: " + numero % 2);
        }
    }
}

