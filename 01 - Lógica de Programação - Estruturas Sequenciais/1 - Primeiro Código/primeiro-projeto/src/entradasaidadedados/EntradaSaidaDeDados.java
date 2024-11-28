package entradasaidadedados;

import java.util.Scanner;

public class EntradaSaidaDeDados {
    /**
     * <h1> Treinamento Minha Vaga Dev Java - Lógica de Programação: Estruturas Sequencias </h1>
     * 6 - Entrada e Saída de Dados<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   28/11/2024
     */
    public static void main(String[] args) {
//        System.out.println("Olá eu faço impressão e pulo a linha");
//        System.out.print("Olá eu faço a impressão na mesma linha");
//        System.out.printf("Olá eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Idade: " + idade);
        System.out.println("Digite se você está empregado sim(true) ou não(false): ");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, sou " + nome + " tenho " + idade + " estou empregado" + empregado);
        scanner.close();
    }
}
