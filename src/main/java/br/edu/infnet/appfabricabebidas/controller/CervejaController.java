package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CervejaController {

    private static final Map<Integer, Cerveja> CERVEJAS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Cerveja cerveja) {
        CERVEJAS.put(id++, cerveja);
    }

    public static void excluir(Integer id) {
        CERVEJAS.remove(id);
    }

    @GetMapping(value = "/cervejas")
    public String lista(Model model) {
        model.addAttribute("lista", CERVEJAS.values());
        return "cerveja/lista";
    }
}
