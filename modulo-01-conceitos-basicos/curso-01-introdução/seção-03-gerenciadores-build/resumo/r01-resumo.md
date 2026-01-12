# Gerenciadores de Build — Resumo Completo

## O que é Build
Build é o processo que transforma código-fonte em um software executável ou distribuível.  
No Java, o build normalmente envolve:
- Compilar arquivos `.java` em `.class`
- Baixar dependências externas
- Executar testes automatizados
- Empacotar aplicações em `.jar` ou `.war`

Executar isso manualmente é trabalhoso e propenso a erros, por isso utilizamos ferramentas de build.

---

## O que é um Gerenciador de Build
Um gerenciador de build é uma ferramenta que automatiza e organiza todo o processo de build.  
Ele executa, de forma padronizada, as etapas necessárias para gerar o software final.

---

## Maven
O Maven é um gerenciador de build tradicional e amplamente utilizado no mercado corporativo.

Características:
- Usa XML para configuração
- Baseado em “convenção sobre configuração”
- Estrutura de pastas padronizada
- Usa o comando `mvn`

Para funcionar no Windows:
- Precisa do Java instalado
- Requer a variável `MAVEN_HOME`
- O diretório `%MAVEN_HOME%\bin` deve estar no `PATH`

---

## Gradle
O Gradle é um gerenciador de build mais moderno e flexível.

Características:
- Usa scripts (Groovy ou Kotlin)
- Arquivo principal: `build.gradle`
- Mais flexível que o Maven
- Usa o comando `gradle`

Para funcionar no Windows:
- Precisa do Java
- Requer a variável `GRADLE_HOME`
- O diretório `%GRADLE_HOME%\bin` deve estar no `PATH`

---

## Instalação Manual no Windows
Tanto Maven quanto Gradle são instalados de forma semelhante:
1. Baixar o arquivo ZIP no site oficial
2. Extrair para uma pasta
3. Criar a variável `MAVEN_HOME` ou `GRADLE_HOME`
4. Adicionar a pasta `bin` ao `PATH`
5. Validar com:

```aiignore
mvn -version
gradle -v
```
---

## Problemas comuns
- PATH incorreto
- Variáveis no nível errado (usuário x sistema)
- Conflito entre versões
- Problemas de permissão no Windows (especialmente ao usar C:\)

---

## Conclusão
Maven e Gradle são ferramentas essenciais no desenvolvimento Java moderno. Saber instalá-las, configurá-las e diagnosticar problemas de ambiente é uma habilidade fundamental para qualquer desenvolvedor Java.