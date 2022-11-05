package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.BebidaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BebidaController {

    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping(value = "/bebidas")
    public String lista(Model model) {
        model.addAttribute("lista", bebidaService.listar());

        return "bebida/lista";
    }

    @GetMapping(value = "/bebidas/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        bebidaService.excluir(id);
        return "redirect:/bebidas";
    }
}
