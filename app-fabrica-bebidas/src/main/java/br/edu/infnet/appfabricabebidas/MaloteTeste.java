package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.MaloteService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MaloteTeste implements ApplicationRunner {

    private final MaloteService maloteService;

    public MaloteTeste(MaloteService maloteService) {
        this.maloteService = maloteService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro Malote:");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Cerveja cerveja = new Cerveja();
        cerveja.setId(1);

        Refrigerante refrigerante = new Refrigerante();
        refrigerante.setId(2);

        Suco suco = new Suco();
        suco.setId(3);

        Fabrica fabrica = new Fabrica();
        fabrica.setId(1);

        Malote malote1 = new Malote();
        malote1.setValorTotal(200.30F);
        malote1.setStatus("CONCLUIDO");
        malote1.setDataSolicitacao(LocalDateTime.of(2012, Month.APRIL, 10, 0, 42, 40));
        malote1.setDataConclusao(LocalDateTime.of(2012, Month.APRIL, 20, 20, 19, 43));
        malote1.setFabrica(fabrica);
        malote1.setBebidas(List.of(cerveja, refrigerante));
        malote1.setUsuario(usuario);

        Malote malote2 = new Malote();
        malote2.setValorTotal(140.46F);
        malote2.setStatus("CONCLUIDO");
        malote2.setDataSolicitacao(LocalDateTime.of(2019, Month.JUNE, 5, 11, 44, 51));
        malote2.setDataConclusao(LocalDateTime.of(2021, Month.APRIL, 19, 0, 51, 34));
        malote2.setFabrica(fabrica);
        malote2.setBebidas(List.of(cerveja, suco));
        malote2.setUsuario(usuario);

        Malote malote3 = new Malote();
        malote3.setValorTotal(100F);
        malote3.setStatus("PENDENTE");
        malote3.setDataSolicitacao(LocalDateTime.of(2019, Month.JUNE, 30, 11, 44, 51));
        malote3.setFabrica(fabrica);
        malote3.setBebidas(List.of(cerveja, refrigerante, suco));
        malote3.setUsuario(usuario);

        List<Malote> malotes = List.of(malote1, malote2, malote3);

        malotes.forEach(System.out::println);
        malotes.forEach(maloteService::incluir);
    }
}
