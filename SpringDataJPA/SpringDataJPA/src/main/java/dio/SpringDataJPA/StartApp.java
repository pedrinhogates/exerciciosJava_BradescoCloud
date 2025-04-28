package dio.SpringDataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.SpringDataJPA.model.User;
import dio.SpringDataJPA.repository.userRepository;
@Component
public class StartApp implements CommandLineRunner {
    private userRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user  = new User();
        user.setName("Pedro"); 
        user.setUsername("Pedrinho");
        user.setPassword("12345678");
        repository.save(user);


        for (User u : repository.findAll()) {
            System.out.println(u.getName() + " " + u.getUsername() + " " + u.getPassword());
        }
    }   
    
}
