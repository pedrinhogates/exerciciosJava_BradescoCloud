package dio.web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dio.web_api.model.usuario;
import dio.web_api.repository.usuarioRepository;

@RestController
public class usuarioController {
    @Autowired
    private usuarioRepository repository;
    @GetMapping("/usuario")
    public List <usuario> getUsers () {
       
        return repository.listAll();
        }
    @GetMapping("/usuario/{login}")
    public usuario getOne (@PathVariable ("login")String login) {
        return repository.findByLogin(login);
    }

}        