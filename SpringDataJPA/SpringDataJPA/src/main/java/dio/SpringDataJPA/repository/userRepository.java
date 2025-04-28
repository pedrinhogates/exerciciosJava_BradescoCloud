package dio.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.SpringDataJPA.model.User;

public interface userRepository extends JpaRepository<User, Integer> {

    
    
}
