package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FabricaController {

    private static final Map<Integer, Fabrica> EMPRESAS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Fabrica fabrica) {
        EMPRESAS.put(id++, fabrica);
    }

    public static void excluir(Integer id) {
        EMPRESAS.remove(id);
    }
    
    @GetMapping(value = "/fabricas")
    public String lista(Model model) {
        model.addAttribute("lista", EMPRESAS.values());
        return "fabrica/lista";
    }
}
