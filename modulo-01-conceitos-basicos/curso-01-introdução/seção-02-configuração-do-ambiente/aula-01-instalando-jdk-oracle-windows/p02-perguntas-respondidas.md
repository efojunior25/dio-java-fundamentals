# Perguntas e Respostas — Instalação do Java no Windows

## Conceituais

1. Qual é o objetivo da aula?
   Instalar e configurar o Java no Windows.

2. Qual versão do Java foi utilizada?
   Java 21.

3. Por que o comando `java -version` falhou no início?
   Porque o Java ainda não estava instalado.

4. O que é o JAVA_HOME?
   Uma variável que aponta para o diretório do JDK.

5. Para que serve o PATH?
   Permitir executar comandos Java de qualquer pasta.

6. O que é o diretório bin?
   Onde ficam os executáveis do Java.

7. Por que o PATH precisa apontar para o bin?
   Porque é nele que estão o java e o javac.

8. O Java funciona sem PATH?
   Só usando o caminho completo.

9. O método mostrado é flexível?
   Não, é um método fixo.

10. Ele é adequado para servidores?
    Sim.

## Técnicas

11. Qual comando valida a instalação?
    java -version

12. Como ver o valor do JAVA_HOME?
    echo %JAVA_HOME%

13. Onde o Java foi instalado?
    No diretório definido pelo instalador.

14. É preciso reiniciar o terminal?
    Sim, para atualizar variáveis.

15. O que acontece se JAVA_HOME estiver errado?
    Os comandos podem falhar.

16. Posso usar esse método em produção?
    Sim.

17. Posso usar várias versões?
    Não facilmente.

18. O PATH aceita múltiplos valores?
    Sim.

19. Por que salvar o caminho do JDK?
    Para configurar o JAVA_HOME.

20. Qual comando compila Java?
    javac.

## Estilo entrevista júnior

21. Por que configurar o JAVA_HOME?
    Para padronizar o uso do JDK.

22. O que acontece sem PATH?
    O Java não roda no terminal.

23. O que é o JDK?
    Kit de desenvolvimento Java.

24. Java 21 é LTS?
    Sim.

25. Como saber se Java está ativo?
    Rodando java -version.

26. Preciso do JDK para programar?
    Sim.

27. Onde ficam os executáveis?
    Na pasta bin.

28. Posso mover o JDK?
    Sim, mas deve atualizar o JAVA_HOME.

29. O Windows precisa de variável?
    Sim.

30. Qual o próximo método será mostrado?
    Um método mais flexível de gestão de versões.
