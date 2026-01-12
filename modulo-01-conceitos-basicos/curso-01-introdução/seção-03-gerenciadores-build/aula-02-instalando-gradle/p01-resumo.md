# Instalação do Gradle no Windows

## Contexto da aula
Nesta aula o professor demonstra a **instalação manual do Gradle** no Windows.  
Ele reforça novamente que prefere usar o **SDKMAN**, mas considera importante mostrar a instalação manual para entender o funcionamento e resolver problemas de ambiente.

---

## Download do Gradle
O professor acessa o site oficial do Gradle e vai até a área de download.

Ele encontra duas opções:
- Versão completa
- Versão binária

Ele escolhe a versão **binária**, pois ela é suficiente para executar o Gradle.

O arquivo é baixado para a pasta de downloads do Windows.

---

## Preparação da pasta
Assim como foi feito com o Maven, o professor:
- Cria uma pasta para o Gradle
- Copia o arquivo ZIP para essa pasta
- Extrai os arquivos do Gradle

Somente após a extração é possível configurar o Gradle corretamente.

---

## Teste antes da configuração
O professor executa:

`gradle -v`

O comando não é reconhecido, confirmando que o Gradle ainda não está configurado no sistema.

---

## Criação da variável GRADLE_HOME
Nas variáveis de ambiente do Windows:
- É criada uma nova variável chamada:

`GRADLE_HOME`

- O valor é o diretório onde o Gradle foi extraído, por exemplo:

`C:\Gradle\gradle-8.13`


---

## Configuração do PATH
Na variável PATH, é adicionada a entrada:

`%GRADLE_HOME%\bin`


Assim, o Windows passa a encontrar o comando `gradle`.

---

## Teste após a configuração
O terminal é aberto novamente (como administrador) e o comando é executado:

`gradle -v`

O Gradle responde exibindo:
- Versão do Gradle (8.13)
- Informações de build
- Versão do Kotlin
- Versão do Groovy

Isso confirma que o Gradle está funcionando corretamente.

---

## Conclusão
O Gradle foi instalado manualmente com sucesso e o ambiente está pronto para ser utilizado nas próximas aulas.