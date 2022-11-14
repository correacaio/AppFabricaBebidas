package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.CervejaService;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CervejaTeste implements ApplicationRunner {

    private final CervejaService cervejaService;

    public CervejaTeste(CervejaService cervejaService) {
        this.cervejaService = cervejaService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Cerveja:");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Cerveja cerveja1 = new Cerveja();
        cerveja1.setId(0);
        cerveja1.setNome("Brahma");
        cerveja1.setDescricao("Cerveja brasileira");
        cerveja1.setValor(3.50F);
        cerveja1.setTipo("Pilsen");
        cerveja1.setPctAlcool(3.5F);
        cerveja1.setFamilia("Lager");
        cerveja1.setUsuario(usuario);

        Cerveja cerveja2 = new Cerveja();
        cerveja2.setId(1);
        cerveja2.setNome("Skol");
        cerveja2.setDescricao("Outra cerveja brasileira");
        cerveja2.setValor(3.40F);
        cerveja2.setTipo("Pilsen");
        cerveja2.setPctAlcool(3.5F);
        cerveja2.setFamilia("Lager");
        cerveja2.setUsuario(usuario);

        Cerveja cerveja3 = new Cerveja();
        cerveja3.setId(2);
        cerveja3.setNome("American Ipa Baden Baden");
        cerveja3.setDescricao("Origem artesanal");
        cerveja3.setValor(12F);
        cerveja3.setTipo("IPA");
        cerveja3.setPctAlcool(5.5F);
        cerveja3.setFamilia("Ale");
        cerveja3.setUsuario(usuario);

        List<Cerveja> cervejas = List.of(cerveja1, cerveja2, cerveja3);
        cervejas.forEach(System.out::println);
        cervejas.forEach(cervejaService::incluir);
    }
}
