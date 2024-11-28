package trabalhandocomstrings;

public class TrabalhandoComStrings {
    /**
     * <h1> Treinamento Minha Vaga Dev Java - Lógica de Programação: Estruturas Sequencias </h1>
     * 5 - String<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   28/11/2024
     */
    public static void main(String[] args) {
        String nome = "Joana";

        int tamanhoString = nome.length();

        String sobrenome = " da Silva";
        boolean saoIguais = nome.equals(sobrenome);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
