package AnotacaoTabela; // Declaração do pacote

public class Main { // Declaração da classe principal chamada Main.
    public static void main(String[] args) { // Método principal, ponto de entrada do programa.
        // Verifica se a classe Usuario está anotada com @Tabela
        if (Usuario.class.isAnnotationPresent(Tabela.class)) { // Verifica se a anotação @Tabela está presente na classe Usuario.
            Tabela tabela = Usuario.class.getAnnotation(Tabela.class); // Obtém a anotação @Tabela da classe Usuario.
            String nomeDaTabela = tabela.nome(); // Obtém o valor da anotação (nome da tabela) e armazena na variável nomeDaTabela.
            System.out.println("Classe Usuario está associada à tabela: " + nomeDaTabela); // Imprime o nome da tabela associada à classe Usuario.
        } else { // Se a anotação @Tabela não estiver presente na classe Usuario.
            System.out.println("Classe Usuario não está anotada com @Tabela."); // Imprime que a classe Usuario não está anotada com @Tabela.
        }
    }
}
