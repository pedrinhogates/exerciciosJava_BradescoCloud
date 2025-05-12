package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleinteRepository extends CrudRepository<Cliente, Long> {
    

    
} 