# Instalação e Configuração do Java no Windows

## 1. Objetivo da aula
O objetivo desta aula é realizar:
- A instalação do Java no Windows
- A verificação da instalação
- A configuração das variáveis de ambiente para permitir o uso do Java no terminal

O professor utiliza uma máquina virtual com Windows para demonstrar todo o processo.

---

## 2. Verificando se o Java já está instalado
No terminal (cmd), é executado o comando:

```java -version```

O sistema não reconhece o comando, indicando que o Java ainda não está instalado no ambiente.

---

## 3. Download do Java

O professor acessa o site da Oracle para baixar o Java:
- Seleciona a versão **Java 21**
- Escolhe o instalador para **Windows**
- Realiza o download do instalador

A versão 21 é apresentada como a versão estável utilizada no curso.

---

## 4. Processo de instalação

O instalador é executado normalmente:
- O usuário confirma as permissões
- O Java é instalado no diretório padrão
- O caminho de instalação deve ser anotado, pois será usado depois na configuração das variáveis de ambiente.

---

## 5. Verificando a instalação

Após a instalação, o comando:

```java -version```

passa a funcionar, exibindo a versão **Java 21**, confirmando que o Java está instalado corretamente.

---

## 6. Por que configurar as variáveis de ambiente

Mesmo com o Java funcionando, é necessário configurar as variáveis de ambiente para:
- Garantir que os comandos Java funcionem em qualquer pasta
- Evitar depender de caminhos absolutos

Isso é fundamental para trabalhar com Java via terminal, compilação e automação.

---

## 7. Criando a variável JAVA_HOME

No Windows:
1. Abrir **Editar variáveis de ambiente**
2. Criar uma nova variável do sistema chamada:

```JAVA_HOME```

3. Atribuir como valor o caminho da pasta onde o Java foi instalado, por exemplo:

```C:\Program Files\Java\jdk-21```

(ou o diretório real exibido no instalador)

---

## 8. Configurando o PATH

Na variável `Path` do sistema:
- Adicionar uma nova entrada:

```%JAVA_HOME%\bin```

Esse diretório `bin` contém os executáveis `java`, `javac` e outros comandos do Java.

---

## 9. Validando a configuração

No terminal, o comando:

```echo %JAVA_HOME%```

deve imprimir o caminho configurado, confirmando que a variável está funcionando corretamente.

---

## 10. Limitações desse método

O professor explica que:
- Essa configuração é **pouco flexível**
- É ideal para servidores que usam apenas uma versão do Java
- Para ambientes de desenvolvimento, existe uma forma mais flexível, que será apresentada na próxima aula.