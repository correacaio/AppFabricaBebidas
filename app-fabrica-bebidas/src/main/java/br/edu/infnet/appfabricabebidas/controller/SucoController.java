package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.SucoService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class SucoController {

    private final SucoService sucoService;

    public SucoController(SucoService sucoService) {
        this.sucoService = sucoService;
    }
    
    @GetMapping(value = "/sucos")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", sucoService.listar());
            model.addAttribute("foco", "sucos");

            return "suco/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/sucos/cadastrar")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("foco", "sucos");
            return "suco/cadastro";
        }

        return "redirect:/";
    }

    @PostMapping(value = "/sucos")
    public String incluir(Suco suco, @SessionAttribute("usuario") Usuario usuario) {
        suco.setUsuario(usuario);
        sucoService.incluir(suco);
        return "redirect:/sucos";
    }

    @GetMapping(value = "/sucos/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        sucoService.excluir(id);
        return "redirect:/sucos";
    }
}
