## → Calculadora de Aposentadoria
---
### → Está classe é simples e utiliza JOptionPane para interagir com o usuário e determinar se uma pessoa já pode se aposentar com base em idade, sexo e tempo de contribuição.
---
** Funcionalidades **

Solicita ao usuário entrar com: ↓

→ Idade atual

→ Sexo (M ou F)

→ Anos de contribuição

Verifica se o usuário já pode se aposentar com base nas regras: ↓ 

→ Homens: 65 anos de idade ou 35 anos de contribuição

→ Mulheres: 62 anos de idade ou 30 anos de contribuição

Exibe mensagens: ↓

→ Se o usuário já pode se aposentar, ou

→ Quantos anos faltam para atingir os requisitos.

Inclui tratamento de erros para entradas inválidas (ex: letras no lugar de números).

### → Lógica de Funcionamento

O programa coleta os dados via janelas gráficas (JOptionPane).

Converte e valida as entradas (tratando exceções NumberFormatException).

Define os critérios mínimos com base no sexo informado: ↓

→ → Masculino → idade mínima 65, contribuição mínima 35

→ → Feminino → idade mínima 62, contribuição mínima 30

Verifica se o usuário cumpre ao menos um dos critérios (idade ou tempo de contribuição).

Exibe uma janela de resultado mostrando: ↓

→ Mensagem de parabéns caso já possa se aposentar, ou

→ Quanto tempo ainda falta para se aposentar.

### → Exemplo de Execução ↓

→ Digite (entrada via teclado) sua idade: EX: 60  

→ Digite  (entrada via teclado) seu sexo (M/F): EX: M  

→ Digite (entrada via teclado) seus anos de contribuição: EX: 33  


### → Resultado exibido: ↓

Você ainda não pode se aposentar.

- Faltam 5 ano(s) para atingir a idade mínima.
- Faltam 2 ano(s) de contribuição.

### → Tecnologias Utilizadas ↓

Linguagem: Java 8+

Interface gráfica: JOptionPane

Estrutura: Programa simples em linha única de execução (main)

### → Estrutura do Código
CalculadoraAposentadoria.java
→ Entrada de dados (idade, sexo, contribuição)
→ Validação de entrada
→ Cálculo das condições de aposentadoria
→ Exibição do resultado
→ Tratamento de exceções

### → Tratamento de Erros

O programa trata dois tipos principais de erros:

Entrada inválida → quando o usuário digita letras ou valores não numéricos.

Erro genérico → captura qualquer exceção inesperada e exibe uma mensagem amigável.

### → Como Executar

Salve o arquivo como CalculadoraAposentadoria.java

Compile o Classe no terminal Vscode para testar e implementar em seu programa:

javac ClassCalculadoraAposentadoria.java


### → Execute o programa:

java ClassCalculadoraAposentadoria

### → Licença

Está Classe é de uso livre para fin educacional.
Sinta-se à vontade para modificar, estudar e compartilhar.
