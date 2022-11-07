package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.UsuarioService;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTeste implements ApplicationRunner {

    private final UsuarioService usuarioService;

    public UsuarioTeste(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Usuario:");

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Usuario 1");
        usuario1.setEmail("usuario@ambev.com.br");
        usuario1.setSenha("123");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Usuario 2");
        usuario2.setEmail("email@heineken.com.br");
        usuario2.setSenha("234");


        Usuario usuario3 = new Usuario();
        usuario3.setNome("Usuario 3");
        usuario3.setEmail("email@hocuspocus.com.br");
        usuario3.setSenha("345");

        List<Usuario> usuarios = List.of(usuario1, usuario2, usuario3);
        usuarios.forEach(System.out::println);
        usuarios.forEach(usuarioService::incluir);
    }
}
