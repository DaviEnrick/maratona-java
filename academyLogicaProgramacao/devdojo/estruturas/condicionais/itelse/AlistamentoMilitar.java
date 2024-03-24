package academyLogicaProgramacao.devdojo.estruturas.condicionais.itelse;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'M';
        int idade = 17;
        if ((sexo == 'M' || sexo == 70) && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar? ");
        }

    }
}

