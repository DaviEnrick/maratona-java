package academyLogicaProgramacao.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {
        int[] [] arrayMult1 = new int[2][2];
        arrayMult1 [0] [0] = 22;
        arrayMult1 [0] [1] = 11;
        arrayMult1 [1] [0] = 55;
        arrayMult1 [1] [1] = 44;
        System.out.println(arrayMult1[0] [0]);
        System.out.println(arrayMult1[0] [1]);
        System.out.println(arrayMult1[1] [0]);
        System.out.println(arrayMult1[1] [1]);
    }
}
