package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.client.UsuarioClient;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioClient usuarioClient;

    public UsuarioService(UsuarioClient usuarioClient) {
        this.usuarioClient = usuarioClient;
    }

    public void incluir(Usuario usuario) {
        usuarioClient.incluir(usuario);
    }

    public void excluir(Integer id) {
        usuarioClient.excluir(id);
    }

    public Collection<Usuario> listar() {
        return usuarioClient.listar();
    }

    public Usuario obter(String email, String senha) {
        return usuarioClient.acessar(email, senha);
    }
}
