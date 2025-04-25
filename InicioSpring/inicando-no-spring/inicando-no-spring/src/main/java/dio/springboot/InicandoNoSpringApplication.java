package dio.springboot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InicandoNoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicandoNoSpringApplication.class, args);
	}
		@Bean
		public CommandLineRunner run (SistemaMensagem sistema) throws Exception {
			return args -> {
				sistema.confirmacaoCadastro();
				sistema.enviarMensagemBoasVindas();
			};
		}
	
	

}
