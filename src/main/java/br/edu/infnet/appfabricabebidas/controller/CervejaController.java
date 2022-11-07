package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.CervejaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CervejaController {

    private final CervejaService cervejaService;

    public CervejaController(CervejaService cervejaService) {
        this.cervejaService = cervejaService;
    }

    @GetMapping(value = "/cervejas")
    public String listar(Model model) {
        model.addAttribute("lista", cervejaService.listar());
        model.addAttribute("foco", "cervejas");

        return "cerveja/lista";
    }

    @GetMapping(value = "/cervejas/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        cervejaService.excluir(id);
        return "redirect:/cervejas";
    }
}
