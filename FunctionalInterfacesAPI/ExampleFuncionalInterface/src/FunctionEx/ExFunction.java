package FunctionEx;

import java.util.Arrays;
import java.util.List;

public class ExFunction {
    public static void main(String[] args) {

       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usando a função de map para multiplicar cada número por 2
        List<Integer> numerosMultiplicados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimindo os números multiplicados
        numerosMultiplicados.forEach(System.out::println); 
    }
}