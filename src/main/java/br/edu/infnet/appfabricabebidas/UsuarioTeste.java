package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.UsuarioService;
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

        Usuario usuario = new Usuario();
        usuario.setNome("Usuario");
        usuario.setEmail("usuario@email.com");
        usuario.setSenha("123");

        System.out.println(usuario);
        usuarioService.incluir(usuario);
    }
}
