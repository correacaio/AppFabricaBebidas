package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import br.edu.infnet.appfabricabebidas.model.domain.builder.SucoConstrutor;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SucoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Suco suco1 = SucoConstrutor.novo()
            .nome("Del Valle Laranja")
            .descricao("Laranja?")
            .valor(6F)
            .fruta("Laranja")
            .adicaoAcucar(true)
            .pctSucoFruta(5.5F)
            .constroi();

        Suco suco2 = SucoConstrutor.novo()
            .nome("Del Valle Uva")
            .descricao("Suco. Nao vinho.")
            .valor(6.5F)
            .fruta("Uva")
            .adicaoAcucar(true)
            .pctSucoFruta(6.2F)
            .constroi();

        Suco suco3 = SucoConstrutor.novo()
            .nome("Del Valle Manga")
            .descricao("Existe?")
            .valor(5.8F)
            .fruta("Manga")
            .adicaoAcucar(false)
            .pctSucoFruta(5.2F)
            .constroi();

        List.of(suco1, suco2, suco3)
            .forEach(System.out::println);
    }
}
