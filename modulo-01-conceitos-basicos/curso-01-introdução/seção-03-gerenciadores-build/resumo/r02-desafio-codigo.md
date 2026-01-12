# Desafio — Verificador de Ferramentas de Build

Crie um programa Java que:

1. Mostre a versão do Java
2. Mostre o valor de MAVEN_HOME
3. Mostre o valor de GRADLE_HOME
4. Informe se o ambiente está pronto para:
    - Usar Maven
    - Usar Gradle

Exemplo de saída:
```
Java Version: 21
MAVEN_HOME: C:\Tools\Maven
GRADLE_HOME: C:\Tools\Gradle
Status Maven: OK
Status Gradle: OK
```

Use:
- `System.getProperty("java.version")`
- `System.getenv()`