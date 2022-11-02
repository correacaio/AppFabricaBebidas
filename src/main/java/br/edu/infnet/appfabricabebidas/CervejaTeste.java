package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.builder.CervejaConstrutor;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CervejaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Cerveja cerveja1 = CervejaConstrutor.novo()
            .nome("Brahma")
            .descricao("Cerveja brasileira")
            .valor(3.50F)
            .tipo("Pilsen")
            .pctAlcool(3.5F)
            .familia("Lager")
            .constroi();

        Cerveja cerveja2 = CervejaConstrutor.novo()
            .nome("Skol")
            .descricao("Outra cerveja brasileira")
            .valor(3.40F)
            .tipo("Pilsen")
            .pctAlcool(3.5F)
            .familia("Lager")
            .constroi();

        Cerveja cerveja3 = CervejaConstrutor.novo()
            .nome("American Ipa Baden Baden")
            .descricao("Origem artesanal")
            .valor(12F)
            .tipo("IPA")
            .pctAlcool(5.5F)
            .familia("Ale")
            .constroi();

        List.of(cerveja1, cerveja2, cerveja3)
                .forEach(System.out::println);
    }
}
