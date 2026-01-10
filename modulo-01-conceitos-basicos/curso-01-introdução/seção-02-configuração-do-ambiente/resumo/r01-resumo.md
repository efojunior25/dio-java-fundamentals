📘 1. Resumo Completo — Instalação do Java (Windows, Linux e SDKMAN)
Visão geral

Para programar em Java é necessário ter um JDK (Java Development Kit) instalado e corretamente configurado. O JDK inclui:

Compilador (javac)

JVM

Ferramentas de desenvolvimento

Bibliotecas padrão

Existem diversas distribuições do JDK, todas compatíveis entre si:

Oracle JDK (pode exigir licença em produção)

OpenJDK

Amazon Corretto

Azul Zulu

BellSoft Liberica, entre outras

Instalação no Windows (Oracle JDK)

O processo consiste em:

Baixar o Java 21 no site da Oracle

Executar o instalador

Configurar variáveis de ambiente

Variáveis essenciais

JAVA_HOME → aponta para a pasta do JDK

PATH → deve conter:

%JAVA_HOME%\bin


Isso garante que os comandos java e javac funcionem em qualquer diretório.

Validação
java -version
javac -version
echo %JAVA_HOME%

Instalação no Linux (Amazon Corretto)

O Amazon Corretto é uma distribuição gratuita e suportada pela AWS.

Processo:

Adicionar o repositório da AWS

Atualizar o sistema

Instalar o JDK

sudo apt-get update
sudo apt-get install -y java-21-amazon-corretto-jdk


Validação:

java -version

Instalação com SDKMAN (Linux, macOS, WSL)

O SDKMAN é um gerenciador de versões de SDKs.

Ele permite:

Instalar várias versões de Java

Trocar a versão ativa

Gerenciar ferramentas como Maven, Gradle, Kotlin, Spring CLI, etc.

Instalação do SDKMAN:

curl -s "https://get.sdkman.io" | bash
source ~/.sdkman/bin/sdkman-init.sh
sdk version


Listar versões:

sdk list java


Instalar Java 21 (Amazon Corretto):

sdk install java <identificador>


Validação:

java -version


O SDKMAN define automaticamente a versão default.