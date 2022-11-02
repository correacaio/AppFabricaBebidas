package br.edu.infnet.appfabricabebidas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

    @GetMapping(value = "/empresas")
    public String lista() {
        return "empresa/lista";
    }
}
