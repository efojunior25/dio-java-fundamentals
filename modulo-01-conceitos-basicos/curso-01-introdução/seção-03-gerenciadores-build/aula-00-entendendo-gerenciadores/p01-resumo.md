# Introdução aos Gerenciadores de Build em Java

## O que é o processo de Build
No contexto da programação, build é o processo de transformar o código-fonte em algo executável ou distribuível.  
No Java, isso normalmente inclui:

- Compilar arquivos `.java` em `.class`
- Baixar bibliotecas externas (dependências)
- Executar testes automatizados
- Empacotar o projeto em `.jar` ou `.war`
- Preparar o projeto para distribuição

Fazer tudo isso manualmente é demorado, repetitivo e propenso a erros. Por isso, usamos ferramentas que automatizam esse processo.

---

## O que é um Gerenciador de Build
Um gerenciador de build é uma ferramenta que:
- Automatiza
- Organiza
- Padroniza

todo o processo de build de um projeto.

O desenvolvedor descreve o que o projeto precisa e o gerenciador executa os passos automaticamente.

---

## Principais gerenciadores no ecossistema Java
Os dois principais são:

### Maven
- Muito usado no mercado corporativo
- Baseado em XML
- Usa o princípio “convenção sobre configuração”
- Possui estrutura de pastas padronizada

### Gradle
- Ferramenta mais moderna
- Usa scripts (Groovy ou Kotlin)
- Arquivo principal: `build.gradle`
- Muito mais flexível que o Maven

---

## Por que usar Maven ou Gradle
Essas ferramentas permitem:
- Compilar o projeto
- Baixar dependências automaticamente
- Rodar testes
- Empacotar aplicações
- Evitar erros humanos

Tudo isso é feito com comandos simples no terminal.

---

## Instalação e variáveis de ambiente
Para usar Maven ou Gradle, é necessário:
- Instalar a ferramenta
- Configurar variáveis de ambiente

Variáveis importantes:
- `MAVEN_HOME`
- `GRADLE_HOME`

Essas variáveis devem apontar para a pasta onde a ferramenta foi instalada.

Além disso, é necessário adicionar:
```
<MAVEN_HOME>\bin
<GRADLE_HOME>\bin
```

yaml
Copiar código
ao `PATH`.

---

## Variáveis de usuário x variáveis do sistema
Existem dois níveis:
- Variáveis do usuário → afetam apenas seu usuário
- Variáveis do sistema → afetam todos os usuários

É fundamental que:
- A variável e o PATH estejam no mesmo nível (usuário ou sistema)

---

## Erro comum: mvn não é reconhecido
Esse erro acontece quando:
- O PATH não aponta para a pasta `bin`
- A variável MAVEN_HOME está errada
- Existe conflito entre variáveis de usuário e sistema
- Existem múltiplas versões configuradas

---

## Como corrigir problemas de configuração
1. Abrir Variáveis de Ambiente do Windows
2. Verificar se `MAVEN_HOME` aponta para o diretório correto
3. Verificar se `<MAVEN_HOME>\bin` está no PATH
4. Conferir se a configuração está no nível correto (usuário ou sistema)