package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.BebidaService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class BebidaController {

    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping(value = "/bebidas")
    public String listar(Model model, @SessionAttribute("usuario") Optional<Usuario> usuario) {
        if (usuario.isPresent()) {
            model.addAttribute("lista", bebidaService.listar(usuario.get()));
            model.addAttribute("foco", "bebidas");

            return "bebida/lista";
        }

        return "redirect:/";
    }

    @GetMapping(value = "/bebidas/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        bebidaService.excluir(id);
        return "redirect:/bebidas";
    }
}
