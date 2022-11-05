package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Bebida;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BebidaController {

    private static final Map<Integer, Bebida> BEBIDAS = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Bebida bebida) {
        BEBIDAS.put(id++, bebida);
    }

    public static void excluir(Integer id) {
        BEBIDAS.remove(id);
    }

    public static Collection<Bebida> listar() {
        return BEBIDAS.values();
    }

    @GetMapping(value = "/bebidas")
    public String lista(Model model) {
        model.addAttribute("lista", listar());

        return "bebida/lista";
    }

    @GetMapping(value = "/bebidas/{id}/excluir")
    public String exclui(@PathVariable Integer id) {
        excluir(id);
        return "redirect:/bebidas";
    }
}
