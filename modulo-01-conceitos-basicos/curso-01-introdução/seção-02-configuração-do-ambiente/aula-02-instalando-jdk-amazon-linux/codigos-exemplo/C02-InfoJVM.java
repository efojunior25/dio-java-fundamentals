/**
 * Mostra informações da JVM instalada no sistema.
 */
public class InfoJVM {

    public static void main(String[] args) {
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Fornecedor: " + System.getProperty("java.vendor"));
        System.out.println("Diretório da JVM: " + System.getProperty("java.home"));
    }
}
