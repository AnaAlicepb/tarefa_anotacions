package AnotacaoTabela; // Declaração do pacote

import java.lang.annotation.*; // Importa todas as classes e interfaces do pacote java.lang.annotation

@Target(ElementType.TYPE) // Indica que a anotação pode ser aplicada a tipos (classes, interfaces, etc).
@Retention(RetentionPolicy.RUNTIME) // Indica que a anotação estará disponível em tempo de execução.
public @interface Tabela { // Declaração da anotação personalizada chamada Tabela.
    String nome(); // Declaração de um elemento da anotação que retorna uma string.
}
