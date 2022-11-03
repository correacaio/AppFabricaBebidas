package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Bebida;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping(value = "/bebidas")
    public String lista(Model model) {
        model.addAttribute("lista", BEBIDAS.values());

        return "bebida/lista";
    }
}
