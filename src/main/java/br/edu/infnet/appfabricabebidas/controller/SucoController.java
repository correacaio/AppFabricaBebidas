package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.SucoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SucoController {

    private final SucoService sucoService;

    public SucoController(SucoService sucoService) {
        this.sucoService = sucoService;
    }
    
    @GetMapping(value = "/sucos")
    public String listar(Model model) {
        model.addAttribute("lista", sucoService.listar());
        return "suco/lista";
    }

    @GetMapping(value = "/sucos/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        sucoService.excluir(id);
        return "redirect:/sucos";
    }
}
