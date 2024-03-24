package academyLogicaProgramacao.devdojo.estruturas.condicionais.itelse;
import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = Input.next();
        System.out.println("Digite a sua idade: ");
        int idade = Input.nextInt();
        String nome2 = null;
        nome = "";
        if (nome2 == null || nome2 == "") {
            System.out.println("O nome digitado foi: " + nome);
        }

        System.out.println("A idade digitada foi: " + idade);
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria infantil ");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("participará da categoria Pré adulto");
        } else if (idade > 20) {
            System.out.println("participará da categoria Adulto");
        }
    }
}