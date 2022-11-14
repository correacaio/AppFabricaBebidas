package br.edu.infnet.apiusuarios.model.service;

import br.edu.infnet.apiusuarios.model.domain.Usuario;
import br.edu.infnet.apiusuarios.model.repository.UsuarioRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Collection<Usuario> listar() {
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    public Usuario obter(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario obter(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email).orElse(null);

        if (usuario != null && usuario.getSenha().equals(senha)) {

            return usuario;
        }

        return null;
    }
}
