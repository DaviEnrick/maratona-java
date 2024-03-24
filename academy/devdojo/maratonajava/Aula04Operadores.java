package academy.devdojo.maratonajava;



public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int resultado= numero1 * numero2;
        System.out.println (" O resultado é: " + resultado );
        // %=resto
        int resto = 20 % 2;
        System.out.println(resto);
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte" +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" +isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" +isDezIgualVinte);
        System.out.println("isDezIgualDez" +isDezIgualDez);
        System.out.println("isDezDiferenteDez" +isDezDiferenteDez);
    }
}
