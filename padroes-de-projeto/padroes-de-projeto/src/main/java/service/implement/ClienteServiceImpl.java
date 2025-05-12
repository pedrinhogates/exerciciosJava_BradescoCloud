package service.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.CleinteRepository;
import model.Cliente;
import model.EnderecoRepository;
import service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private CleinteRepository cleinteRepository;
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
        enderecoRepository.findById(cliente.getEndereco().getCep());
        
        

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub

    }

}
