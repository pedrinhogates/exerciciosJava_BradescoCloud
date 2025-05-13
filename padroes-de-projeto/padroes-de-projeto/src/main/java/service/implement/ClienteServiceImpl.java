package service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.ClienteRepository;
import model.Endereco;
import model.Cliente;
import model.EnderecoRepository;
import service.ClienteService;
import service.ViaCepService;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository cleinteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return cleinteRepository.findAll();

    }

    @Override
    public Cliente buscarPorId(Long id) {
       Optional<Cliente> cliente = cleinteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        //enderecoRepository.findById(cliente.salvarClienteCep().getCep());
        salvarClienteCep(cliente);
        
        

    }

    private void salvarClienteCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = ViaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        cleinteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteAtualiza = cleinteRepository.findById(id);
        if (clienteAtualiza.isPresent()) {
            salvarClienteCep(cliente);
        } else {
            throw new RuntimeException("Cliente não encontrado");
        }   
            
        } 
 

    

    @Override
    public void deletar(Long id) {
        cleinteRepository.deleteById(id);
    }
}    


