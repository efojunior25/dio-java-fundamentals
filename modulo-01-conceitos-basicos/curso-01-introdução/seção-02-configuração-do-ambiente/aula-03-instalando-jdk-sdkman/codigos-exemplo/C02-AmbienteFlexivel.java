/**
 * Demonstra o conceito de ambiente flexível com múltiplas versões de Java.
 */
public class AmbienteFlexivel {

    public static void main(String[] args) {
        String versao = System.getProperty("java.version");

        if (versao.startsWith("21")) {
            System.out.println("Você está usando Java 21 (versão do curso)");
        } else {
            System.out.println("Você está usando outra versão de Java: " + versao);
        }
    }
}
