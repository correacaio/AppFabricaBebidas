package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MaloteController {

    private static final Map<Integer, Malote> MALOTES = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Malote malote) {
        MALOTES.put(id++, malote);
    }

    public static void excluir(Integer id) {
        MALOTES.remove(id);
    }

    @GetMapping(value = "/malotes")
    public String lista(Model model) {
        model.addAttribute("lista", MALOTES.values());
        return "malote/lista";
    }
}
