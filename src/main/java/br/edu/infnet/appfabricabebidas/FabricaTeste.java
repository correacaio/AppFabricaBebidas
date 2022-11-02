package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.builder.FabricaConstrutor;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FabricaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Fabrica fabrica1 = FabricaConstrutor.novo()
                .localizacao("Sao Carlos - SP")
                .tamanho("P")
                .dataInicializacao(LocalDate.of(2012, Month.APRIL, 20))
                .constroi();

        Fabrica fabrica2 = FabricaConstrutor.novo()
            .localizacao("Santa Lucia - SP")
            .tamanho("PP")
            .dataInicializacao(LocalDate.of(2095, Month.JUNE, 30))
            .constroi();

        Fabrica fabrica3 = FabricaConstrutor.novo()
            .localizacao("Fortaleza - CE")
            .tamanho("M")
            .dataInicializacao(LocalDate.of(2022, Month.NOVEMBER, 22))
            .constroi();

        List.of(fabrica1, fabrica2, fabrica3)
            .forEach(System.out::println);
    }
}
