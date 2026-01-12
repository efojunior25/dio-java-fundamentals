# Instalação do Maven no Windows

## Contexto da aula
Nesta aula o professor instala o Maven em um ambiente Windows que já possui:
- Java 21 instalado
- JAVA_HOME e PATH configurados manualmente

Ele reforça que esta é a forma **mais engessada** de instalação, indicada para:
- Servidores
- Ambientes que usam apenas uma versão do Maven

Para ambientes de desenvolvimento, o professor prefere o uso de ferramentas como SDKMAN.

---

## Download do Maven
O processo começa acessando o site oficial do Maven para baixar o pacote compactado (zip).

Após o download:
- O arquivo é copiado para uma pasta escolhida pelo usuário
- No exemplo, o professor cria `C:\Maven`
- O conteúdo do zip é extraído dentro dessa pasta

O arquivo compactado é removido após a extração.

---

## Teste inicial
Antes da configuração:

`mvn -version`

O comando não é reconhecido, mostrando que o Maven ainda não está disponível no sistema.

---

## Criação da variável MAVEN_HOME
Nas variáveis de ambiente do Windows:
- É criada uma nova variável chamada:
  
`MAVEN_HOME`

- Seu valor é o diretório onde o Maven foi extraído, por exemplo:

`C:\Maven`

---

## Configuração do PATH
Na variável PATH, é adicionada uma nova entrada:

`%MAVEN_HOME%\bin`

Isso permite que o Windows encontre o comando `mvn`.

---

## Primeiro teste após configuração
O comando:

`mvn -version`

ainda não funciona normalmente.

Ao rodar o terminal como administrador, o Maven funciona, o que indica um **problema de permissão no Windows**.

---

## Problema de permissões
O professor percebe que:
- A pasta `C:\Maven` está com restrições de acesso
- Isso impede que o `mvn` seja executado normalmente

Mesmo ajustando permissões, o problema persiste.

---

## Solução alternativa
O professor copia o Maven para uma pasta dentro do diretório do usuário, por exemplo:

`C:\Users<usuario>\Maven`


Ele atualiza:
- `MAVEN_HOME`
- `PATH`

Após isso, o Maven passa a funcionar corretamente sem precisar rodar como administrador.

---

## Conclusão
O Maven foi instalado com sucesso.
O problema enfrentado não foi de configuração, mas de **permissão do Windows ao usar C:\**.