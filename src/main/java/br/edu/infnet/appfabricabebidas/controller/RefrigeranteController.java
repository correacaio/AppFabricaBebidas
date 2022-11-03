package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RefrigeranteController {

    private static final Map<Integer, Refrigerante> REFRIGERANTES = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Refrigerante refrigerante) {
        REFRIGERANTES.put(id++, refrigerante);
    }

    public static void excluir(Integer id) {
        REFRIGERANTES.remove(id);
    }
    
    @GetMapping(value = "/refrigerantes")
    public String lista(Model model) {
        model.addAttribute("lista", REFRIGERANTES.values());
        return "refrigerante/lista";
    }
}
