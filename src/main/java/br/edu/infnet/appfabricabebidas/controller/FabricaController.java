package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.FabricaService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class FabricaController {

    private final FabricaService fabricaService;

    public FabricaController(FabricaService fabricaService) {
        this.fabricaService = fabricaService;
    }

    @GetMapping(value = "/fabricas")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", fabricaService.listar(usuario.get()));
            model.addAttribute("foco", "fabricas");

            return "fabrica/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/fabricas/cadastrar")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("foco", "fabricas");
            return "fabrica/cadastro";
        }

        return "redirect:/";
    }

    @PostMapping(value = "/fabricas")
    public String incluir(Fabrica fabrica, @SessionAttribute("usuario") Usuario usuario) {
        fabrica.setUsuario(usuario);
        fabricaService.incluir(fabrica);
        return "redirect:/fabricas";
    }

    @GetMapping(value = "/fabricas/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        fabricaService.excluir(id);
        return "redirect:/fabricas";
    }
}
