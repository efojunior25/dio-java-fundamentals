/**
 * Programa que verifica se Maven e Gradle estão disponíveis no ambiente.
 * Simula o que um desenvolvedor faz antes de iniciar um projeto.
 */
public class VerificadorMavenGradle {

    public static void main(String[] args) {

        String mavenHome = System.getenv("MAVEN_HOME");
        String gradleHome = System.getenv("GRADLE_HOME");

        System.out.println("=== Verificação de Build Tools ===");

        if (mavenHome == null || mavenHome.isEmpty()) {
            System.out.println("MAVEN_HOME não configurado");
        } else {
            System.out.println("MAVEN_HOME: " + mavenHome);
        }

        if (gradleHome == null || gradleHome.isEmpty()) {
            System.out.println("GRADLE_HOME não configurado");
        } else {
            System.out.println("GRADLE_HOME: " + gradleHome);
        }

        if (mavenHome != null && gradleHome != null) {
            System.out.println("Ambiente pronto para usar Maven e Gradle.");
        } else {
            System.out.println("Ambiente incompleto. Configure as variáveis.");
        }
    }
}
