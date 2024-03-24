package academyLogicaProgramacao.devdojo.estruturas.condicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin) {
            System.out.println("Digite seu Login");
            String LoginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals(LoginDigitado) && password.equals(passwordDigitado)){
                System.out.println("Acesso concedido");
                exibirTelaLogin = false;
                break;
            }
                System.out.println("Acesso negado");
        }
        System.out.println("Programa Terminado");
    }
}
