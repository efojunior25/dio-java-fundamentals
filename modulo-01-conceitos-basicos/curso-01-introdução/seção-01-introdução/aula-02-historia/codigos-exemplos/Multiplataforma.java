/**
 * Representa o modelo de versões LTS do Java.
 */
public class VersoesJava {

    public static void main(String[] args) {
        int[] lts = {8, 11, 17, 21};

        for (int versao : lts) {
            System.out.println("Java " + versao + " é uma versão LTS");
        }
    }
}