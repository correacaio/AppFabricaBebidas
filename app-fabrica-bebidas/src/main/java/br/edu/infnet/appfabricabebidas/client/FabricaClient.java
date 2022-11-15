package br.edu.infnet.appfabricabebidas.client;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import java.util.Collection;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "localhost:8082/api/fabricas", name = "fabricaClient")
public interface FabricaClient {

    @GetMapping
    Collection<Fabrica> listar(@RequestParam Integer usuarioId);

    @PostMapping
    void incluir(@RequestBody Fabrica fabrica);

    @DeleteMapping("/{id}")
    void excluir(@PathVariable Integer id);
}
