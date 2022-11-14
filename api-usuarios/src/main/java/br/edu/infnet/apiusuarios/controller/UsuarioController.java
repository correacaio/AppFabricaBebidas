package br.edu.infnet.apiusuarios.controller;

import br.edu.infnet.apiusuarios.model.domain.Usuario;
import br.edu.infnet.apiusuarios.model.service.UsuarioService;
import java.util.Collection;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public Collection<Usuario> listar() {
        return usuarioService.listar();
    }

    @PostMapping("/acessar")
    public Usuario acessar(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.obter(email, senha);
    }

    @PostMapping
    public void incluir(@RequestBody Usuario usuario) {
        usuarioService.incluir(usuario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);
    }
}
