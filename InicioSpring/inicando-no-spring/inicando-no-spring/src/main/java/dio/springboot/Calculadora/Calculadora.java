package dio.springboot.Calculadora;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma (int a, int b) {
        return a + b;
    }
}
