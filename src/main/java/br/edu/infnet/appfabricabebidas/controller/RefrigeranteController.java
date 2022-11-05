package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.RefrigeranteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RefrigeranteController {

    private final RefrigeranteService refrigeranteService;

    public RefrigeranteController(RefrigeranteService refrigeranteService) {
        this.refrigeranteService = refrigeranteService;
    }

    @GetMapping(value = "/refrigerantes")
    public String lista(Model model) {
        model.addAttribute("lista", refrigeranteService.listar());
        return "refrigerante/lista";
    }

    @GetMapping(value = "/refrigerantes/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        refrigeranteService.excluir(id);
        return "redirect:/refrigerantes";
    }
}
