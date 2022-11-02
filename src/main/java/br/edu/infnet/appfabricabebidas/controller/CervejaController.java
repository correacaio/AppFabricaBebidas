package br.edu.infnet.appfabricabebidas.controller;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CervejaController {

    @GetMapping(value = "/cervejas")
    public String lista(Model model) {
        List<Cerveja> cervejas = new ArrayList<>();

        Cerveja cerveja1 = new Cerveja();
        cerveja1.setNome("Brahma");
        cerveja1.setDescricao("Cerveja brasileira");
        cerveja1.setValor(3.50F);
        cerveja1.setTipo("Pilsen");
        cerveja1.setPctAlcool(3.5F);
        cerveja1.setFamilia("Lager");

        Cerveja cerveja2 = new Cerveja();
        cerveja2.setNome("Skol");
        cerveja2.setDescricao("Outra cerveja brasileira");
        cerveja2.setValor(3.40F);
        cerveja2.setTipo("Pilsen");
        cerveja2.setPctAlcool(3.5F);
        cerveja2.setFamilia("Lager");

        Cerveja cerveja3 = new Cerveja();
        cerveja3.setNome("American Ipa Baden Baden");
        cerveja3.setDescricao("Origem artesanal");
        cerveja3.setValor(12F);
        cerveja3.setTipo("IPA");
        cerveja3.setPctAlcool(5.5F);
        cerveja3.setFamilia("Ale");

        cervejas.add(cerveja1);
        cervejas.add(cerveja2);
        cervejas.add(cerveja3);

        model.addAttribute("lista", cervejas);

        return "cerveja/lista";
    }
}
