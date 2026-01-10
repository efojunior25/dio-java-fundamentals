# Configuração do Ambiente Java

## 1. O que é o ambiente Java
O ambiente Java é o conjunto de ferramentas e configurações que permitem:
- Escrever código Java
- Compilar código Java
- Executar programas Java

Ele é composto principalmente por:
- **JDK (Java Development Kit)**
- Configuração correta do sistema operacional (PATH)

Sem isso, você não consegue trabalhar com Java.

---

## 2. Por que configurar o ambiente Java
Sem o ambiente configurado:
- O sistema não reconhece os comandos `java` e `javac`
- Não é possível compilar nem executar programas
- Ferramentas de desenvolvimento não funcionam corretamente

Configurar o ambiente é o primeiro passo para qualquer desenvolvedor Java.

---

## 3. O que é o JDK
O **JDK (Java Development Kit)** contém:
- O compilador (`javac`)
- A JVM
- Ferramentas de desenvolvimento
- Bibliotecas padrão

É obrigatório para quem vai programar em Java.

---

## 4. Principais distribuições do JDK

### Oracle JDK
- Distribuição oficial da Oracle
- Possui suporte comercial
- Algumas versões exigem licença para uso empresarial

### OpenJDK
- Versão open source
- Gratuita
- Base para a maioria das outras distribuições

### Distribuições baseadas no OpenJDK
Todas são compatíveis entre si:
- Amazon Corretto
- Adoptium
- Azul Zulu
- BellSoft Liberica

Qualquer uma pode ser usada para estudar e desenvolver em Java.

---

## 5. Passos básicos de configuração

### 1) Instalar o JDK
Você deve:
- Escolher uma distribuição
- Baixar a versão correta para seu sistema
- Instalar

### 2) Configurar a variável PATH
O PATH permite:
- Executar `java` e `javac` de qualquer pasta
- Evitar erros de comando não encontrado

Sem isso, o Java fica inutilizável no terminal.

### 3) Verificar a instalação
No terminal, execute:

java -version
javac -version

yaml
Copiar código

Se aparecer a versão do Java, está tudo correto.

---

## 6. Ferramentas para gerenciar versões

### SDKMAN!
- Funciona no Linux e macOS
- Permite:
    - Instalar múltiplas versões do Java
    - Alternar entre elas facilmente
    - Atualizar versões
- Evita configuração manual de PATH