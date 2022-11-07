package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.MaloteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MaloteController {

    private final MaloteService maloteService;

    public MaloteController(MaloteService maloteService) {
        this.maloteService = maloteService;
    }

    @GetMapping(value = "/malotes")
    public String listar(Model model) {
        model.addAttribute("lista", maloteService.listar());
        return "malote/lista";
    }

    @GetMapping(value = "/malotes/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        maloteService.excluir(id);
        return "redirect:/malotes";
    }
}
