/**
 * Mostra a versão da JVM ativa no sistema.
 * Útil para validar qual versão o SDKMAN está usando.
 */
public class VersaoJavaSDKMan {

    public static void main(String[] args) {
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Fornecedor: " + System.getProperty("java.vendor"));
    }
}
