package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.repository.UsuarioRepository;
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
}
