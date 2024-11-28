package operadoresaritmeticos;

public class OperadoresAritmeticos {
    /**
     * <h1> Treinamento Minha Vaga Dev Java - Lógica de Programação: Estruturas Sequencias </h1>
     * 4 - Operadores Aritméticos<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   27/11/2024
     */
    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor Total = R$ " + valorTotalMensal);
    }
}
