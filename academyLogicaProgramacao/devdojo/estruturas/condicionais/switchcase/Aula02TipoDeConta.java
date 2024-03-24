package academyLogicaProgramacao.devdojo.estruturas.condicionais.switchcase;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
            String conta = "Conta Poupanca";
            switch (conta){
                case "Conta Poupanca":
                    System.out.println("0.05%");
                    break;
                case "Conta Corrente":
                    System.out.println("0.02%");
                    break;
                case "Conta Investimento":
                    System.out.println("0.01%");
                    break;
                default:
                    System.out.println("Conta Inexistente");
            }
    }
}
