import javax.swing.JOptionPane;

public class ClassCalculadoraAposentadoria {

    public static void main(String[] args) {
        try {
            // Entrada de dados
            int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite sua idade:", "Cálculo de Aposentadoria", JOptionPane.QUESTION_MESSAGE)
            );

            String sexoInput = JOptionPane.showInputDialog(
                null, "Digite seu sexo (M para masculino, F para feminino):", 
                "Cálculo de Aposentadoria", JOptionPane.QUESTION_MESSAGE
            );
            
            // Validação simples de entrada
            if (sexoInput == null || sexoInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sexo não informado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            char sexo = Character.toUpperCase(sexoInput.charAt(0));

            int anosContribuicao = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite seus anos de contribuição:", "Cálculo de Aposentadoria", JOptionPane.QUESTION_MESSAGE)
            );

            // Regras de aposentadoria
            int idadeMinima = (sexo == 'M') ? 65 : 62;
            int contribuicaoMinima = (sexo == 'M') ? 35 : 30;

            boolean podePorIdade = idade >= idadeMinima;
            boolean podePorContribuicao = anosContribuicao >= contribuicaoMinima;

            StringBuilder resultado = new StringBuilder();

            if (podePorIdade || podePorContribuicao) {
                resultado.append("Parabéns! Você já pode se aposentar!\n\n");

                if (podePorIdade)
                    resultado.append("Cumpriu a idade mínima de ").append(idadeMinima).append(" anos.\n");

                if (podePorContribuicao)
                    resultado.append("Cumpriu o tempo mínimo de contribuição de ").append(contribuicaoMinima).append(" anos.");
            } else {
                int faltamIdade = idadeMinima - idade;
                int faltamContrib = contribuicaoMinima - anosContribuicao;

                resultado.append("Você ainda não pode se aposentar.\n\n");
                if (faltamIdade > 0)
                    resultado.append("- Faltam ").append(faltamIdade).append(" ano(s) para atingir a idade mínima.\n");
                if (faltamContrib > 0)
                    resultado.append("- Faltam ").append(faltamContrib).append(" ano(s) de contribuição.");
            }

            JOptionPane.showMessageDialog(null, resultado.toString(), "Resultado da Aposentadoria", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "Entrada inválida. Digite apenas números para idade e anos de contribuição.", 
                "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Ocorreu um erro: " + e.getMessage(), 
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
