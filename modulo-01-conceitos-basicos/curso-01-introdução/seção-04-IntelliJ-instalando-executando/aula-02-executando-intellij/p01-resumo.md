# Executando o Primeiro Programa no IntelliJ IDEA

## IDEs Online vs IDE Local
Antes de usar o IntelliJ, o professor apresenta IDEs online como:
- JDoodle
- OnlineGDB

Essas ferramentas permitem executar códigos Java no navegador, mas não são ideais para desenvolvimento profissional, pois não possuem todos os recursos de uma IDE completa como o IntelliJ.

---

## Estrutura do projeto no IntelliJ
O IntelliJ cria automaticamente vários arquivos e pastas, incluindo:
- Configurações da IDE
- Arquivos temporários
- Gitignore
- External Libraries (onde aparece o JDK e futuras bibliotecas)

Esses arquivos são necessários para o funcionamento do projeto e da IDE.

---

## Classe principal e método main
O código Java começa em uma classe pública, por exemplo `Main`.

Dentro dela deve existir o método:

`public static void main(String[] args)`

Esse método é o ponto de entrada de qualquer programa Java executável.

Bibliotecas que não são executadas diretamente não precisam ter esse método.

---

## Impressão no console
O Java usa:

`System.out.println()`

para imprimir mensagens no console.

Cada instrução em Java deve terminar com ponto e vírgula (;).

---

## Compilação e execução via terminal
É possível compilar o código manualmente com:

`javac Main.java`

Isso gera um arquivo .class.

Para executar:

`java Main`

---

## Argumentos de linha de comando
O parâmetro args do método main é um vetor de Strings que recebe argumentos passados pelo terminal.

Exemplo:

`java Main Java JDK`

Dentro do programa:

```
args[0] → "Java"
args[1] → "JDK"
```
---

## Execução pelo IntelliJ
O IntelliJ cria uma configuração de execução (Run Configuration) que define:

Qual classe será executada

Qual JDK será usado

Quais argumentos serão passados

Quais variáveis de ambiente serão usadas

Os argumentos são configurados no campo Program arguments.

---

## Debug
O IntelliJ permite:

Criar breakpoints

Executar passo a passo

Inspecionar variáveis

Alterar valores em tempo de execução

Avaliar expressões

Isso ajuda a entender e testar o comportamento do código.

---

## Conclusão
A IDE facilita muito o desenvolvimento, mas é importante também saber compilar e executar Java pelo terminal para automações, scripts e ambientes sem IDE.

csharp
Copiar código

---

## 📁 `codigos/`

### 📄 `PrimeiroPrograma.java`

```java
/**
 * Demonstra:
 * - Impressão no console
 * - Uso de argumentos
 * - Concatenação de Strings
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {

        System.out.println("Hello World");

        if (args.length > 0) {
            System.out.println("Argumento 1: " + args[0]);
        }

        String linguagem = "Java";
        System.out.println("Programando em " + linguagem);
    }
}
```