package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.BebidaService;
import br.edu.infnet.appfabricabebidas.model.service.FabricaService;
import br.edu.infnet.appfabricabebidas.model.service.MaloteService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class MaloteController {

    private final MaloteService maloteService;
    private final FabricaService fabricaService;
    private final BebidaService bebidaService;

    public MaloteController(
        MaloteService maloteService,
        FabricaService fabricaService,
        BebidaService bebidaService
    ) {
        this.maloteService = maloteService;
        this.fabricaService = fabricaService;
        this.bebidaService = bebidaService;
    }

    @GetMapping(value = "/malotes")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", maloteService.listar(usuario.get()));
            model.addAttribute("foco", "malotes");

            return "malote/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/malotes/cadastrar")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("foco", "malotes");
            model.addAttribute("fabricas", fabricaService.listar(usuario.get()));
            model.addAttribute("bebidas", bebidaService.listar(usuario.get()));

            return "malote/cadastro";
        }

        return "redirect:/";
    }

    @PostMapping(value = "/malotes")
    public String incluir(Malote malote, @SessionAttribute("usuario") Usuario usuario) {
        malote.setUsuario(usuario);
        maloteService.incluir(malote);
        return "redirect:/malotes";
    }

    @GetMapping(value = "/malotes/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        maloteService.excluir(id);
        return "redirect:/malotes";
    }
}
