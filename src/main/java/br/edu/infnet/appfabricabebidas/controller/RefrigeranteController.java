package br.edu.infnet.appfabricabebidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RefrigeranteController {

    @GetMapping(value = "/refrigerantes")
    public String lista() {
        return "refrigerante/lista";
    }
}
