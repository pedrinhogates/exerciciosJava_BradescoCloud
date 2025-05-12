package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cliente;
import service.ClienteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("clientes")
public class ClienteRestController {


    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@RequestParam Long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
        
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    @PostMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@RequestParam Long id, @RequestBody Cliente cliente) {   
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    @PostMapping("/{id}")
    public ResponseEntity<Void> deletar(@RequestParam Long id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
    
    

}
