package dio.springboot.Scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Remetente remetente () {
        System.out.println("Remetente criado!");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com");
        remetente.setNome("DIO");
        return remetente;
    }
}
