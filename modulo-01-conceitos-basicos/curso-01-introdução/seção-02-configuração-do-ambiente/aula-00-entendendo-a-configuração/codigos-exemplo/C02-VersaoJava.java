/**
 * Mostra informações básicas da JVM em execução.
 */
public class VersaoJava {

    public static void main(String[] args) {
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Fornecedor: " + System.getProperty("java.vendor"));
        System.out.println("Sistema operacional: " + System.getProperty("os.name"));
    }
}