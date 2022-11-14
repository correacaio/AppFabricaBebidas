package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.RefrigeranteService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class RefrigeranteController {

    private final RefrigeranteService refrigeranteService;

    public RefrigeranteController(RefrigeranteService refrigeranteService) {
        this.refrigeranteService = refrigeranteService;
    }

    @GetMapping(value = "/refrigerantes")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", refrigeranteService.listar(usuario.get()));
            model.addAttribute("foco", "refrigerantes");

            return "refrigerante/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/refrigerantes/cadastrar")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("foco", "refrigerantes");
            return "refrigerante/cadastro";
        }

        return "redirect:/";
    }

    @PostMapping(value = "/refrigerantes")
    public String incluir(Refrigerante refrigerante, @SessionAttribute("usuario") Usuario usuario) {
        refrigerante.setUsuario(usuario);
        refrigeranteService.incluir(refrigerante);
        return "redirect:/refrigerantes";
    }

    @GetMapping(value = "/refrigerantes/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        refrigeranteService.excluir(id);
        return "redirect:/refrigerantes";
    }
}
