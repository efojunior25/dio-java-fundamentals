/**
 * Mostra informações do ambiente Java configurado.
 */
public class InformacoesAmbiente {

    public static void main(String[] args) {
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
        System.out.println("Diretório do Java: " + System.getProperty("java.home"));
    }
}
