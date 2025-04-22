package Consumer;
import java.util.Arrays;
import java.util.List;
public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(numero ->  {
                if (numero % 2 == 0) {
                    System.out.println(numero + " é par.");
                    
                }
            }
        );
    }
}