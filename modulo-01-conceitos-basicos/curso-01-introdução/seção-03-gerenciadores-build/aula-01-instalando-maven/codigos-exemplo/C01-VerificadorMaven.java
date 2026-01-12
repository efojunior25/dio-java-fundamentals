/**
 * Simula o teste de ambiente feito no vídeo,
 * verificando se o Maven está configurado no sistema.
 */
public class VerificadorMaven {

    public static void main(String[] args) {

        String mavenHome = System.getenv("MAVEN_HOME");

        if (mavenHome == null || mavenHome.isEmpty()) {
            System.out.println("MAVEN_HOME não está configurado.");
        } else {
            System.out.println("MAVEN_HOME: " + mavenHome);
            System.out.println("Maven parece estar configurado.");
        }

        System.out.println("Agora execute no terminal:");
        System.out.println("mvn -version");
    }
}
