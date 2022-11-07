package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/usuarios")
    public String listar(Model model) {
        model.addAttribute("lista", usuarioService.listar());
        return "usuario/lista";
    }

    @GetMapping(value = "/usuarios/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);
        return "redirect:/usuarios";
    }
}
