package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
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
        System.out.println("Cadastro Fabrica:");

        Fabrica fabrica1 = new Fabrica();
        fabrica1.setLocalizacao("Sao Carlos - SP");
        fabrica1.setTamanho("P");
        fabrica1.setDataInicializacao(LocalDate.of(2012, Month.APRIL, 20));

        Fabrica fabrica2 = new Fabrica();
        fabrica2.setLocalizacao("Santa Lucia - SP");
        fabrica2.setTamanho("PP");
        fabrica2.setDataInicializacao(LocalDate.of(2095, Month.JUNE, 30));

        Fabrica fabrica3 = new Fabrica();
        fabrica3.setLocalizacao("Fortaleza - CE");
        fabrica3.setTamanho("M");
        fabrica3.setDataInicializacao(LocalDate.of(2022, Month.NOVEMBER, 22));

        List.of(fabrica1, fabrica2, fabrica3)
            .stream().map(fabrica -> "Fabrica - " + fabrica)
            .forEach(System.out::println);
    }
}
