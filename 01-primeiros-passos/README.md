## 1. 🚶 Primeiros Passos na linguagem

<details>
    <summary><strong>O que é Java?</strong></summary>


- É uma linguagem de programação `Orientada a Objetos` de alto nível;
- É uma linguagem multi-plataforma, ou seja, pode ser usada em diversos contextos;
- É rápida, segura e confiável;
</details>

<details>
    <summary><strong>Por que aprender Java?</strong></summary>


- É usada no mundo inteiro;
  - Roda em Smartphones;
  - Geladeiras;
  - Carros;
  - Servidores;

- Está entre as 3 linguagens mais usadas no mundo;

- A maioria das empresas líderes nos seus segmentos usam Java;
  - Mercado Livre
  - Shopee
  - Amazon
  - PagSeguro
  - Hotmart
  - Magalu

- Vagas e salários ofertadas no mercado
- Java é gratuíto e `opensource`
- Possui suporte comercial
- Comunidade de desenvolvedores engajada
- Vários cursos, eventos e cursos livres
- É independente de Sistema Operacional
- Ecossistema de ferramentas, bibliotecas e frameworks é enorme
- É orientada a objetos
- Outras linguagens podem rodar na plataforma java
  - Java
  - Groovy
  - Scala
  - Kotlin
- É uma das linguagens mais rápidas que existe
- A linguagem não morrerá tão cedo
</details>


<details>
    <summary><strong>Um pouco da história do Java</strong></summary>

- Em 1991 Sun Mycrosystems inicia um projeto de uma linguagem voltada para dispositivos móveis
- O projeto foi desenvolvido com as linguagens C e C++
- Mas era muita inovação para a época
- Logo após o projeto foi colocado em risco por questões contratuais
- O nome Java surgiu devido à uma referência à ilha de Java que produzia café
- Em 1993 a popularidade da web explode
  - Começaram a se usar applets
- Em 1995 surge o Java 1.0a2
  - "Write Once, Run Everywhere"
- Em 1996 surge o Java One
- Em 1998 surge o Java Community Process (JCP)
- Java em aplicações servidoras tomam a frente
- Em 2006 o Java se torna open source (GNU)
- Em 2009, A Oracle compra a Sun
- Em 2017, os ciclos de novas versões passam a ser lançadas à cada 6 meses
- Java é um sucesso para aplicações de pequeno e grande porte
</details>

<details>
    <summary><strong>Plataformas Java</strong></summary>


- **Java SE (Standard Edition)**
  - Destinada ao desenvolvimento das aplicações desktop e servidores;
  - É a base para outras plataformas;
  - Possui várias APIs;

- **Jakarta EE (antigo Java EE e J2EE) - Enterprise Edition**
  - É um conjunto de especificações;
  - Desenvolve aplicações para alta escalabilidade e segurança;
  - Plataforma "guarda-chuva";
  - Jakarta Servlet;
  - Jakarta Persistence (`JPA`)
    - Hibernate ORM
  - Jakarta Bean Validation
  - Jakarta Context and Dependency Injection (CDI)
  - Jakarta RESTful Web Services (JAX-RS)
  - Jakarta Enterprise Beans (EJB)
- **Java ME (Micro Edition)**
  - Criação de sistemas embarcados
    - celulares
    - impressoras
    - controles remotos
- **Java Card**
  - Desenvolvimento de aplicações em cartões inteligentes
  - chips de telefones celulares
</details>

<details>
    <summary><strong>Máquina Virtual Java (<code>JVM</code>)</strong></summary>

- Para executar aplicações Java, nós precisamos de um software que converte o código escrito em Java, para uma linguagem que os computadores entendem;
- A JVM vem para simplificar o processo de compilação dos códigos e interpretação dos mesmos pelos diferentes Sistemas Operacionais;


- **Processo de funcionamento da JVM**
  - O código fonte é compilado;
  - É gerado um arquivo `Bytecode`;
    - Apenas a JVM entende esse código;
  - Para rodar o Bytecode, basta ter uma `JVM` compatível com o Sistema Operacional;
  - Um programa que não é escrito em java, pode ser convertido para Bytecode;
</details>

<details>
    <summary><strong>Java Runtime Environment (<code>JRE</code>)</strong></summary>

- Para rodar o Java na nossa máquina, nós precisamos de uma máquina virtual do Java (JVM);
- Mas a JVM é apenas um componente da `JRE` (Ambiente de Execução Java);
- A JRE é um ambiente de execulção de programas Java;
  - É o software que vai carregar e executar os programas escritos em Java;
  - Possuí bibliotecas padrão
  - Class Loader
  - JVM
  - Existem distribuições JRE para Linux, Windows e MacOS
</details>

<details>
    <summary><strong>Java Development Kit (<code>JDK</code>)</strong></summary>

- **JDK** - Kit de Desenvolvimento Java
- É um kit necessário para se desenvolver em Java
- O JDK já inclui o JRE e JVM
</details>

<details>
    <summary><strong>Conhecendo as versões do Java</strong></summary>

- **Java 6**
  - dez/2006 - abr/2013
  - suporte extendido até dez/2018

- **Java 7**
  - jul/2011 - jul/2022 (suporte extendido)

- **Java 8**
  - mar/2014 - até o momento

- **Java 9**
  - A cada 6 meses passa a ser lançada uma nova versão do Java
  - Era uma `Feature Release` - Versão para demonstrar novas funcionalidades
  - Se é usada uma versão `FR` e uma nova versão é lançada, é necessário atualizar a versão, pois o suporte é deixado
  - set/2017 - mar/2018

- **Java 10**
  - É uma FR
  - mar/2018 - set/2018

- **Java 11**
  - É uma versão `LTS` - Long Term Support, ou seja, é dado suporte à longo prazo
  - São lançadas FR à cada 6 meses
  - set/2018 - até o momento

- **Java 12**
  - mar/2019 - set/2019
  - Versão FR

- **Java 13**
  - set/2019 - mar/2019
  - Versão FR

- **Java 14**
  - mar/2020 - set/2020
  - Versão FR

- **Java 15**
  - set/2020 - mar/2021
  - Versão FR

- **Java 16**
  - mar/2020 - set/2021
  - Versão FR

- **Java 17**
  - Versão `LTS`
  - set/2021 - sem tempo definido

- **Java 18**
  - Versão `FR`
  - mar/2022 - set/2022

- Para Projetos Legados, podem existir versões 8, 11
- Para projetos novos, é recomendado utilizar a versão 17
</details>

<details>
    <summary><strong>Distribuições de JDKs e Licenças de Uso</strong></summary>

- **Java Community Process - JCP**
  - Define padrões técnicos e especificicações do ecosistema Java
  - Qualquer um pode participar do processo JSR (Java Specification Requests)

- **OpenJDK**
  - É uma implementação de referência feita baseada pela JCP

- Especificação Java SE (JSR)
  - OpenJDK (RI)
    - Oracle OpenJDK
    - Oracle JDK
    - Eclipse Temurin
    - Amazon Corretto

- Qual distribuição usar?
  - Existem vários tipos, como visto acima.
  - Amazon Corretto 17
  - Temurin 17
</details>

<details>
    <summary><strong>Instalando o JDK</strong></summary>

### No Linux Ubuntu

- Usar o SDKMan
  - Ele permite alternar entre versões diferentes de JDK
  
1. Abra o terminal
2. Verifique se já tem o `curl` instalado na máquina
   1. Caso não tenha, faça no terminal:
      1. Atualize os pacotes
        ```shell
          sudo apt update
        ```
      2. Instale o curl
        ```shell
          sudo apt install curl
        ```
3. Use o comando
    ```shell
      curl -s "https://get.sdkman.io" | bash
    ```
4. Use o comando
    ```shell
      source "/home/seu-usuario-aqui/.sdkman/bin/sdkman-init.sh"
   ```

5. Verifique se o SDK está instalado
    ```shell
      sdk version
   ```

6. Liste as opções que você tem no SDK para instalar o java
    ```shell
      sdk list java
   ```

7. Vamos usar a versão `17.0.5-tem` do Temurin
   1. Use o comando abaixo
      ```shell
        sdk install java 17.0.5-tem
      ```

8. Veja se foi realmente instalado com o comando:
    ```shell
      java -version
   ```
   
    A saída deve ser:
  
    ```shell
      openjdk version "17.0.5" 2022-10-18
      OpenJDK Runtime Environment Temurin-17.0.5+8 (build 17.0.5+8)
      OpenJDK 64-Bit Server VM Temurin-17.0.5+8 (build 17.0.5+8, mixed mode, sharing)
    ```

Se você quiser baixar outra versão usando o SDKMan, é possível.

Passos:
  - Baixe a versão desejada.
  - Use o comando `sdk list java` para ver as versões instaladas
  - Use o comando `sdk use java versao-baixada-por-voce`, por exemplo `sdk use java 11.0.14-tem`
  - Assim será trocada a versão do java que você está usando

Para definir uma versão padrão do JDK, usando o SDKMan, você pode usar o comando:
  - `sdk default java 11.0.14-tem`, onde `11.0.14-tem` é a versão que eu desejo ser default
</details>