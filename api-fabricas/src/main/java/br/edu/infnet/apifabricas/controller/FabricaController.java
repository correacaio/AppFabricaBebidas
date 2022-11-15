package br.edu.infnet.apifabricas.controller;

import br.edu.infnet.apifabricas.model.domain.Fabrica;
import br.edu.infnet.apifabricas.model.domain.Usuario;
import br.edu.infnet.apifabricas.model.service.FabricaService;
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
@RequestMapping("/api/fabricas")
public class FabricaController {

    private final FabricaService fabricaService;

    public FabricaController(FabricaService fabricaService) {
        this.fabricaService = fabricaService;
    }

    @GetMapping
    public Collection<Fabrica> listar(@RequestParam Integer usuarioId) {
        return fabricaService.listar(new Usuario(usuarioId));
    }

    @PostMapping
    public void incluir(@RequestBody Fabrica fabrica) {
        fabricaService.incluir(fabrica);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        fabricaService.excluir(id);
    }
}
