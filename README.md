
# Problema Jantar dos Filosofos
Na ciência da computação, o problema do jantar dos filósofos é um exemplo de problema frequentemente usado no projeto de algoritmos concorrentes para ilustrar problemas de sincronização e técnicas para resolvê-los.

Cinco filósofos jantam juntos na mesma mesa. Cada filósofo tem seu próprio prato à mesa. Há um garfo entre cada prato. O prato servido é uma espécie de espaguete que deve ser comido com dois garfos. Cada filósofo só pode pensar e comer alternadamente. Além disso, um filósofo só pode comer o seu espaguete quando tiver um garfo esquerdo e um direito. Assim, dois garfos só estarão disponíveis quando os seus dois vizinhos mais próximos estiverem pensando e não comendo. Depois que um filósofo individual termina de comer, ele larga os dois garfos. O problema é como conceber um regime (um algoritmo concorrente) tal que qualquer filósofo não morra de fome; isto é, cada um pode continuar para sempre a alternar entre comer e pensar, assumindo que nenhum filósofo pode saber quando outros podem querer comer ou pensar (uma questão de informação incompleta).

![Imagem de exemplo dos filosofos](/img/exemplo.png)

# Como executar
**É preciso ter ao menos um runtime do java instalado no seu computador, o [JRE ](https://www.java.com/pt-BR/download/manual.jsp) ou o  [JDK ](https://www.oracle.com/java/technologies/downloads/).**

### Para quem prefere usar uma IDE:

1.  **Abra sua IDE (por exemplo, IntelliJ IDEA, Eclipse, NetBeans).**
2.  **Clone o repositório do GitHub:**
    
    -   No IntelliJ IDEA:
        -   Vá para `File > New > Project from Version Control > Git`.
        -   Cole a URL do repositório e siga as instruções para clonar.
    -   Em outras IDEs, os passos são semelhantes, geralmente encontrados em menus como `File > Git > Clone Repository`.
3.  **Abra o projeto clonado na IDE:**
    
    -   No IntelliJ IDEA:
        -   Selecione o diretório do projeto clonado e clique em "Open".
    -   Em outras IDEs, geralmente basta abrir o diretório do projeto clonado.
4.  **Compile e execute o programa:**
    
    -   Compile o código-fonte clicando com o botão direito no arquivo `MeuPrograma.java` e selecionando a opção de compilação.
    -   Execute o programa clicando com o botão direito no arquivo compilado `MeuPrograma.class` e selecionando a opção de execução.
  
Claro, aqui está o passo a passo para rodar um programa console Java a partir da clonagem de um repositório no GitHub, tanto para quem prefere utilizar o console quanto para quem vai utilizar uma IDE:

### Para quem prefere usar o console:

1.  **Clone o repositório do GitHub:**
    `git clone https://github.com/EduardoRei/JantarDosFilosofos` 
    
2.  **Acesse o diretório do projeto:**
    `cd JantarDosFilosofos` 
    
3.  **Compile o código-fonte Java:**
    `javac Main.java` 
    
4.  **Execute o programa compilado:**
    `java Main`