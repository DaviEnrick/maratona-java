package academyLogicaProgramacao.devdojo.variaveis;

public class CalculadoraImposto {
    public static void main (String[] args) {
        double salario = 2500.00F;
        double resultado = salario * 0.3;
        System.out.println("30% eh: " + resultado);
        resultado = salario * 0.15;
        System.out.println("15% eh: " + resultado);
        resultado = salario * 0.05;
        System.out.println("5% eh: " + resultado);
    }
}
