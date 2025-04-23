package Supplier;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
    // Supplier é uma interface funcional que não recebe argumentos e retorna um
    // valor.
    // É usada quando você quer fornecer um valor, mas não precisa de nenhum
    // argumento para isso.
    public static void main(String[] args) {
        List<String> lista = Stream.generate(
                () -> "hello world!")

                .limit(5)
                .toList();

        lista.forEach(System.out::println);
    }
}
