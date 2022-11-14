package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.CervejaService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class CervejaController {

    private final CervejaService cervejaService;

    public CervejaController(CervejaService cervejaService) {
        this.cervejaService = cervejaService;
    }

    @GetMapping(value = "/cervejas")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", cervejaService.listar());
            model.addAttribute("foco", "cervejas");

            return "cerveja/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/cervejas/cadastrar")
    public String telaCadastro(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("foco", "cervejas");
            return "cerveja/cadastro";
        }

        return "redirect:/";
    }

    @PostMapping(value = "/cervejas")
    public String incluir(Cerveja cerveja, @SessionAttribute("usuario") Usuario usuario) {
        cerveja.setUsuario(usuario);
        cervejaService.incluir(cerveja);
        return "redirect:/cervejas";
    }

    @GetMapping(value = "/cervejas/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        cervejaService.excluir(id);
        return "redirect:/cervejas";
    }
}
