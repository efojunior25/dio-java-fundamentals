/**
 * Programa que verifica o ambiente Java instalado na máquina.
 * Ele mostra:
 *  - Versão do Java
 *  - Fornecedor do JDK
 *  - Valor da variável JAVA_HOME
 *  - Se a versão ativa é Java 21 (versão do curso)
 *
 *  COMO EXECUTAR
 *   - No terminal, dentro da pasta onde esta o arquivo
 *   javac VerificadorAmbienteJava.java
 *   java VerificadorAmbienteJava
 */
public class VerificadorAmbienteJava {

    public static void main(String[] args) {

        // Obtém a versão do Java em uso
        String javaVersion = System.getProperty("java.version");

        // Obtém o fornecedor do Java (Oracle, Amazon, Azul, etc.)
        String javaVendor = System.getProperty("java.vendor");

        // Obtém o valor da variável de ambiente JAVA_HOME
        String javaHome = System.getenv("JAVA_HOME");

        // Exibe as informações
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Vendor: " + javaVendor);

        // Caso JAVA_HOME não esteja configurado
        if (javaHome == null || javaHome.isEmpty()) {
            System.out.println("JAVA_HOME: NÃO CONFIGURADO");
        } else {
            System.out.println("JAVA_HOME: " + javaHome);
        }

        // Verifica se a versão é Java 21
        if (javaVersion != null && javaVersion.startsWith("21")) {
            System.out.println("Status: Versão correta para o curso");
        } else {
            System.out.println("Status: Atenção — Esta não é a versão Java 21");
        }
    }
}
