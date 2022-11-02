package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CervejaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Cerveja:");

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

        List.of(cerveja1, cerveja2, cerveja3)
            .stream().map(cerveja -> "Cerveja - " + cerveja)
            .forEach(System.out::println);
    }
}
