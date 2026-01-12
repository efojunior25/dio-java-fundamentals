/**
 * Demonstra:
 * - Impressão no console
 * - Uso de argumentos
 * - Concatenação de Strings
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {

        System.out.println("Hello World");

        if (args.length > 0) {
            System.out.println("Argumento 1: " + args[0]);
        }

        String linguagem = "Java";
        System.out.println("Programando em " + linguagem);
    }
}