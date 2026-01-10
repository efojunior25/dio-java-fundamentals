# Instalação do JDK usando SDKMAN

## 1. Objetivo da aula
Nesta aula o professor apresenta a forma **mais flexível** de instalar e gerenciar o Java no sistema operacional, utilizando o **SDKMAN**, um gerenciador de SDKs que permite instalar, atualizar e alternar versões do Java e de outras ferramentas de desenvolvimento.

---

## 2. O que é o SDKMAN
O SDKMAN é um gerenciador de ferramentas de desenvolvimento que permite:
- Instalar múltiplas versões do Java
- Alternar entre versões facilmente
- Gerenciar outras ferramentas além do Java

Ele funciona nativamente no:
- Linux
- macOS  
  No Windows, ele funciona através do **WSL (Windows Subsystem for Linux)**.

---

## 3. Instalação do SDKMAN
O professor acessa o site **sdkman.io** e utiliza o comando de instalação fornecido na página.

Após executar o comando, ele roda:

`source ~/.sdkman/bin/sdkman-init.sh`

Em seguida, valida a instalação com:

`sdk version`


Se o comando funciona, o SDKMAN está instalado corretamente.

---

## 4. SDKMAN não é só para Java
O professor mostra que o SDKMAN pode instalar muitas ferramentas, como:
- Gradle
- Maven
- Kotlin
- Spring Boot CLI
- Micronaut
- GraalVM
- Quarkus
- Scala

Ou seja, ele é um gerenciador completo de ferramentas para o ecossistema Java e JVM.

---

## 5. Listando versões de Java disponíveis
Para ver todas as versões de Java disponíveis no SDKMAN, é usado o comando:

`sdk list java`

Esse comando mostra:
- Várias distribuições
- Várias versões
- Vários fornecedores (Amazon, Oracle, etc)

---

## 6. Escolhendo a distribuição
O professor escolhe:
- Distribuição: **Amazon Corretto**
- Versão: **Java 21**

Ele copia o identificador da versão exibido pelo SDKMAN.

---

## 7. Instalando o Java 21
A instalação é feita com:

`sdk install java <identificador>`

O SDKMAN:
- Baixa o JDK
- Descompacta
- Configura automaticamente
- Define a versão como **default** se não houver outra instalada

---

## 8. Validando a instalação
Após a instalação:

`java -version`


O sistema mostra:
- Java 21
- Amazon Corretto

Confirmando que a instalação funcionou corretamente.

---

## 9. Trabalhando com múltiplas versões
O professor mostra que no sistema dele existem:
- Java 8
- Java 17
- Java 21

O SDKMAN permite:
- Ver todas as versões instaladas
- Definir qual é a versão padrão
- Alternar versões conforme o projeto

---

## 10. Por que este método é o preferido
O professor afirma que:
- Este é o método **mais flexível**
- Ideal para desenvolvedores
- Permite trabalhar com projetos que exigem versões diferentes de Java
- Evita problemas de PATH e variáveis de ambiente