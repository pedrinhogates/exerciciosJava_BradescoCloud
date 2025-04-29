package dio.web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import dio.web_api.model.usuario;

@Configuration
public class usuarioRepository {
    public void save(usuario usuario) {
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void update(usuario usuario) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<usuario> listAll() {
        List<usuario> usuarios = new ArrayList<>();
        usuarios.add(new usuario("gleyson", "password"));
        usuarios.add(new usuario("frank", "masterpass"));
        return usuarios;
    }

    public usuario finById(Integer id) {
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        List<usuario> usuarios = listAll();

        for (usuario user : usuarios) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;

    }

    public usuario findByLogin(String login) {
        System.out.println(String.format("GET/id - Recebendo o login: %s para localizar um usuário", login));
        List<usuario> usuarios = listAll();

        for (usuario user : usuarios) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
