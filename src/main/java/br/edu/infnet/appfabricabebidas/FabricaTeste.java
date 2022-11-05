package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.controller.FabricaController;
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
        System.out.println("Cadastro de Fabrica:");

        Fabrica fabrica1 = new Fabrica();
        fabrica1.setId(0);
        fabrica1.setNome("Ambev");
        fabrica1.setCnpj("123456701234");
        fabrica1.setDataCriacao(LocalDate.of(2012, Month.APRIL, 20));

        Fabrica fabrica2 = new Fabrica();
        fabrica2.setId(1);
        fabrica2.setNome("Heineken");
        fabrica2.setCnpj("43210987654321");
        fabrica2.setDataCriacao(LocalDate.of(2095, Month.JUNE, 30));

        Fabrica fabrica3 = new Fabrica();
        fabrica3.setId(2);
        fabrica3.setNome("Hocus Pocus");
        fabrica3.setCnpj("13131313131313");
        fabrica3.setDataCriacao(LocalDate.of(2022, Month.NOVEMBER, 22));

        List
            .of(fabrica1, fabrica2, fabrica3)
            .forEach(FabricaController::incluir);
    }
}
