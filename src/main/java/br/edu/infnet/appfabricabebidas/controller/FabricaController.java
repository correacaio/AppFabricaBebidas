package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.FabricaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FabricaController {

    private final FabricaService fabricaService;

    public FabricaController(FabricaService fabricaService) {
        this.fabricaService = fabricaService;
    }

    @GetMapping(value = "/fabricas")
    public String listar(Model model) {
        model.addAttribute("lista", fabricaService.listar());
        model.addAttribute("foco", "fabricas");

        return "fabrica/lista";
    }

    @GetMapping(value = "/fabricas/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        fabricaService.excluir(id);
        return "redirect:/fabricas";
    }
}
