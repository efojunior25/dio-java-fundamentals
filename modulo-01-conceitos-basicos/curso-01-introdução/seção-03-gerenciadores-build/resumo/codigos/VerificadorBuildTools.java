/**
 * Verifica se o ambiente está pronto para trabalhar com Maven e Gradle.
 * O programa lê:
 *  - Versão do Java
 *  - MAVEN_HOME
 *  - GRADLE_HOME
 * E informa se cada ferramenta está pronta para uso.
 */
public class VerificadorBuildTools {

    public static void main(String[] args) {

        // Versão do Java
        String javaVersion = System.getProperty("java.version");

        // Variáveis de ambiente
        String mavenHome = System.getenv("MAVEN_HOME");
        String gradleHome = System.getenv("GRADLE_HOME");

        System.out.println("=== Verificação do Ambiente de Build ===");

        // Exibe versão do Java
        System.out.println("Java Version: " + javaVersion);

        // Verificação do Maven
        if (mavenHome != null && !mavenHome.isEmpty()) {
            System.out.println("MAVEN_HOME: " + mavenHome);
            System.out.println("Status Maven: OK");
        } else {
            System.out.println("MAVEN_HOME: NÃO CONFIGURADO");
            System.out.println("Status Maven: ERRO");
        }

        // Verificação do Gradle
        if (gradleHome != null && !gradleHome.isEmpty()) {
            System.out.println("GRADLE_HOME: " + gradleHome);
            System.out.println("Status Gradle: OK");
        } else {
            System.out.println("GRADLE_HOME: NÃO CONFIGURADO");
            System.out.println("Status Gradle: ERRO");
        }

        // Conclusão geral
        if ((mavenHome != null && !mavenHome.isEmpty()) &&
                (gradleHome != null && !gradleHome.isEmpty())) {
            System.out.println("Ambiente de Build: PRONTO");
        } else {
            System.out.println("Ambiente de Build: INCOMPLETO");
        }
    }
}
