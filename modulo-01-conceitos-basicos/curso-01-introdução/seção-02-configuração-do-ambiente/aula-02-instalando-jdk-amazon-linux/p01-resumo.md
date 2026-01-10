# Instalação do JDK no Linux (Amazon Corretto)

## 1. Objetivo da aula
O objetivo desta aula é demonstrar uma das formas de instalar o Java (JDK) em um sistema Linux, utilizando uma distribuição baseada no OpenJDK chamada **Amazon Corretto**.  
O professor explica que essa não é a forma mais flexível, mas é uma forma válida, especialmente para ambientes mais controlados.

---

## 2. O que é o JDK e por que existem várias implementações
O professor reforça que:
- A Oracle mantém o código aberto do Java no GitHub
- A partir desse código, várias empresas criam suas próprias implementações
- Todas seguem o mesmo padrão da plataforma Java

Essas implementações são chamadas de **distribuições do JDK**.

---

## 3. Exemplos de distribuições citadas
O professor mostra várias distribuições disponíveis:

- Amazon Corretto (AWS)
- Microsoft JDK
- Alibaba Dragonwell
- BellSoft Liberica
- Oracle JDK (proprietário)

Ele recomenda, sempre que possível, escolher uma distribuição que tenha:
- Uma empresa grande por trás
- Suporte e manutenção ativa

---

## 4. Licenciamento
O professor explica que:
- O **Oracle JDK** é gratuito para desenvolvimento
- Mas exige pagamento de licença para uso em produção
- Já distribuições como Amazon Corretto são totalmente gratuitas

Por isso, ele escolhe o **Amazon Corretto** para o curso.

---

## 5. Verificando se o Java já está instalado
Em uma máquina virtual Ubuntu “limpa”, o professor executa:

`java -version`


O comando retorna **command not found**, confirmando que o Java ainda não está instalado.

---

## 6. Escolhendo a versão e arquitetura
O professor seleciona:
- Arquitetura **64 bits**
- Versão **Java 21**

Ele acessa a página do Amazon Corretto e visualiza:
- Instaladores para Windows
- Instaladores para macOS
- Pacotes para Linux
- Containers Docker prontos
- Downloads manuais (ZIP e binários)

---

## 7. Tipos de instalação disponíveis
O professor explica que é possível:
- Instalar via pacote do sistema (apt, rpm)
- Usar binários compactados (ZIP)
- Usar imagens Docker
- Fazer instalação manual

Ele escolhe a instalação baseada em **Debian/Ubuntu**, usando o repositório da AWS.

---

## 8. Instalando o Amazon Corretto no Ubuntu
Os passos realizados são:

1. Baixar o script da AWS usando `wget`
2. Adicionar o repositório do Corretto ao sistema
3. Atualizar a lista de pacotes
4. Instalar o JDK usando `apt-get`

Comandos principais:

`sudo apt-get update`
`sudo apt-get install -y java-21-amazon-corretto-jdk`

---

## 9. Finalizando a instalação
Após a instalação, o professor executa:

`java -version`

O sistema retorna:
- Java 21
- Amazon Corretto
- Funcionando corretamente

O ambiente Java está pronto para uso.

---

## 10. Considerações finais
O professor reforça que:
- A instalação é simples
- Funciona bem em servidores e máquinas Linux
- Existem formas mais flexíveis que serão mostradas depois