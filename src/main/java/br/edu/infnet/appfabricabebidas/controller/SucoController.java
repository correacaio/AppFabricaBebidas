package br.edu.infnet.appfabricabebidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SucoController {

    @GetMapping(value = "/sucos")
    public String lista() {
        return "suco/lista";
    }
}
