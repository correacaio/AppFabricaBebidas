package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SucoController {

    private static final Map<Integer, Suco> SUCOS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Suco suco) {
        SUCOS.put(id++, suco);
    }

    public static void excluir(Integer id) {
        SUCOS.remove(id);
    }

    public static Collection<Suco> listar() {
        return SUCOS.values();
    }
    
    @GetMapping(value = "/sucos")
    public String lista(Model model) {
        model.addAttribute("lista", listar());
        return "suco/lista";
    }

    @GetMapping(value = "/sucos/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/sucos";
    }
}
