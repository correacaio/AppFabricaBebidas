package br.edu.infnet.appfabricabebidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FabricaController {

    @GetMapping(value = "/fabricas")
    public String lista() {
        return "fabrica/lista";
    }
}
