package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Empresa;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpresaController {

    private static final Map<Integer, Empresa> EMPRESAS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Empresa empresa) {
        EMPRESAS.put(id++, empresa);
    }

    public static void excluir(Integer id) {
        EMPRESAS.remove(id);
    }
    
    @GetMapping(value = "/empresas")
    public String lista(Model model) {
        model.addAttribute("lista", EMPRESAS.values());
        return "empresa/lista";
    }
}
