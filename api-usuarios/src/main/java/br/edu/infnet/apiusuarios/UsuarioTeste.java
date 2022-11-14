package br.edu.infnet.apiusuarios;

import br.edu.infnet.apiusuarios.model.domain.Endereco;
import br.edu.infnet.apiusuarios.model.domain.Usuario;
import br.edu.infnet.apiusuarios.model.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class UsuarioTeste implements ApplicationRunner {

    private final UsuarioService usuarioService;

    public UsuarioTeste(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Usuario:");

        Endereco endereco = new Endereco();
        endereco.setBairro("Bairro");
        endereco.setCep("14825000");
        endereco.setComplemento("Complemento");
        endereco.setLocalidade("Localidade");
        endereco.setUf("SP");
        endereco.setLogradouro("Logradouro");

        Usuario usuario = new Usuario();
        usuario.setNome("Usuario");
        usuario.setEmail("admin@admin.com");
        usuario.setSenha("admin");
        usuario.setEndereco(endereco);

        System.out.println(usuario);
        usuarioService.incluir(usuario);
    }
}
