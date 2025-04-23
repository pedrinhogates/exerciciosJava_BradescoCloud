package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(null, "banana", "maçã", "laranja", "abacaxi", "uva", "kiwi", "manga", "morango", "cabelos");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra != null && palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);


    }

}
