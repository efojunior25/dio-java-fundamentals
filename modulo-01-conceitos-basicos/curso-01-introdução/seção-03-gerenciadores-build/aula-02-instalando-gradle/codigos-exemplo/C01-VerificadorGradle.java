/**
 * Simula a verificação do ambiente do Gradle,
 * como feito no vídeo ao rodar "gradle -v".
 */
public class VerificadorGradle {

    public static void main(String[] args) {

        String gradleHome = System.getenv("GRADLE_HOME");

        if (gradleHome == null || gradleHome.isEmpty()) {
            System.out.println("GRADLE_HOME não está configurado.");
        } else {
            System.out.println("GRADLE_HOME: " + gradleHome);
            System.out.println("Gradle parece estar configurado corretamente.");
        }

        System.out.println("Agora execute no terminal:");
        System.out.println("gradle -v");
    }
}
