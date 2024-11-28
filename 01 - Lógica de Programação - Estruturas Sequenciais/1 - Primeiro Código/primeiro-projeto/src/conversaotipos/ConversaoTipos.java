package conversaotipos;

public class ConversaoTipos {
    /**
     * <h1> Treinamento Minha Vaga Dev Java - Lógica de Programação: Estruturas Sequencias </h1>
     * 7 - Casting (conversões em Java)<br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   28/11/2024
     */
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDois);
        Long numeroConvertidoLong = Long.parseLong(numeroStringDois);

        Long numeroLong = 10L;
        String numeroStringLong = numeroInteger.toString();

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString);
        System.out.println(numeroStringDois + " " + numeroConvertido);
    }
}
