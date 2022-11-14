package br.edu.infnet.appfabricabebidas.client;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import java.util.Collection;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "localhost:8081/api/usuarios", name = "usuarioClient")
public interface UsuarioClient {

    @PostMapping(":acesso")
    Usuario acessar(@RequestParam String email, @RequestParam String senha);

    @GetMapping
    Collection<Usuario> listar();

    @PostMapping
    void incluir(@RequestBody Usuario usuario);

    @DeleteMapping("/{id}")
    void excluir(@PathVariable Integer id);
}
