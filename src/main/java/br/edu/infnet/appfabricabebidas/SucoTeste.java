package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import br.edu.infnet.appfabricabebidas.model.service.SucoService;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SucoTeste implements ApplicationRunner {

    private final SucoService sucoService;

    public SucoTeste(SucoService sucoService) {
        this.sucoService = sucoService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Suco: ");

        Suco suco1 = new Suco();
        suco1.setId(0);
        suco1.setNome("Del Valle Laranja");
        suco1.setDescricao("Laranja?");
        suco1.setValor(6F);
        suco1.setFruta("Laranja");
        suco1.setAdicaoAcucar(true);
        suco1.setPctSucoFruta(5.5F);

        Suco suco2 = new Suco();
        suco2.setId(1);
        suco2.setNome("Del Valle Uva");
        suco2.setDescricao("Suco. Nao vinho.");
        suco2.setValor(6.5F);
        suco2.setFruta("Uva");
        suco2.setAdicaoAcucar(true);
        suco2.setPctSucoFruta(6.2F);

        Suco suco3 = new Suco();
        suco3.setId(2);
        suco3.setNome("Del Valle Manga");
        suco3.setDescricao("Existe?");
        suco3.setValor(5.8F);
        suco3.setFruta("Manga");
        suco3.setAdicaoAcucar(false);
        suco3.setPctSucoFruta(5.2F);

        List<Suco> sucos = List.of(suco1, suco2, suco3);
        sucos.forEach(System.out::println);
        sucos.forEach(sucoService::incluir);
    }
}
