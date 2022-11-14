package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.UsuarioService;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("usuario")
@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping(value = "/usuarios")
    public String telaListagem(Model model) {
        model.addAttribute("lista", usuarioService.listar());
        model.addAttribute("foco", "usuarios");

        return "usuario/lista";
    }

    @GetMapping(value = "/usuarios/cadastrar")
    public String telaCadastro(Model model) {
        model.addAttribute("foco", "cadastro");
        return "usuario/cadastro";
    }

    @GetMapping(value = "/usuarios/acessar")
    public String acesso(Model model) {
        model.addAttribute("foco", "acesso");
        return "usuario/acesso";
    }

    @PostMapping(value = "/usuarios/acessar")
    public String acesso(
        Model model,
        @RequestParam String email,
        @RequestParam String senha
    ) {
        Usuario usuario = usuarioService.obter(email, senha);

        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "redirect:/";
        }

        return "redirect:/usuarios/acessar";
    }

    @GetMapping(value = "/usuarios/sair")
    public String acesso(HttpSession session, SessionStatus status) {
        status.setComplete();

        session.removeAttribute("usuario");
        return "redirect:/";
    }

    @PostMapping(value = "/usuarios")
    public String incluir(Usuario usuario) {
        usuarioService.incluir(usuario);
        return "redirect:/usuarios";
    }

    @GetMapping(value = "/usuarios/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);
        return "redirect:/usuarios";
    }
}
