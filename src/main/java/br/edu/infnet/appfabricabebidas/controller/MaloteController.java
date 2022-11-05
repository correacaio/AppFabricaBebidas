package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    public static Collection<Malote> listar() {
        return MALOTES.values();
    }

    @GetMapping(value = "/malotes")
    public String lista(Model model) {
        model.addAttribute("lista", listar());
        return "malote/lista";
    }

    @GetMapping(value = "/malotes/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/malotes";
    }
}
