package academyLogicaProgramacao.devdojo.estruturas.condicionais.itelse;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.5F;
        float resultado = 0.0F;
        String porcentagem = "";
        if (salario > 4500.0F) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O valor final em porcentagem de " + porcentagem + " é de " + resultado);
    }
}

