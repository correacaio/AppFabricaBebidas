package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FabricaController {

    private static final Map<Integer, Fabrica> FABRICAS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Fabrica fabrica) {
        FABRICAS.put(id++, fabrica);
    }

    public static void excluir(Integer id) {
        FABRICAS.remove(id);
    }

    public static Collection<Fabrica> listar() {
        return FABRICAS.values();
    }
    
    @GetMapping(value = "/fabricas")
    public String lista(Model model) {
        model.addAttribute("lista", listar());
        return "fabrica/lista";
    }

    @GetMapping(value = "/fabricas/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/fabricas";
    }
}
