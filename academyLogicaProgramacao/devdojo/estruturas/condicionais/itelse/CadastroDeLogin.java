package academyLogicaProgramacao.devdojo.estruturas.condicionais.itelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (!nome.equals("") && !nome.equalsIgnoreCase("admin") && !nome.equalsIgnoreCase("administrador")) {
            System.out.println(nome + " cadastrado com sucesso");
        } else {
            System.out.println("Usuário inválido");
        }
    }
}

