package br.edu.infnet.apifabricas;

import br.edu.infnet.apifabricas.model.domain.Fabrica;
import br.edu.infnet.apifabricas.model.domain.Usuario;
import br.edu.infnet.apifabricas.model.service.FabricaService;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class FabricaTeste implements ApplicationRunner {

    private final FabricaService fabricaService;

    public FabricaTeste(FabricaService fabricaService) {
        this.fabricaService = fabricaService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Fabrica:");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Fabrica fabrica1 = new Fabrica();
        fabrica1.setNome("Ambev");
        fabrica1.setCnpj("123456701234");
        fabrica1.setDataCriacao(LocalDate.of(2012, Month.APRIL, 20));
        fabrica1.setUsuario(usuario);

        Fabrica fabrica2 = new Fabrica();
        fabrica2.setNome("Heineken");
        fabrica2.setCnpj("43210987654321");
        fabrica2.setDataCriacao(LocalDate.of(2095, Month.JUNE, 30));
        fabrica2.setUsuario(usuario);

        Fabrica fabrica3 = new Fabrica();
        fabrica3.setNome("Hocus Pocus");
        fabrica3.setCnpj("13131313131313");
        fabrica3.setDataCriacao(LocalDate.of(2022, Month.NOVEMBER, 22));
        fabrica3.setUsuario(usuario);

        List<Fabrica> fabricas = List.of(fabrica1, fabrica2, fabrica3);
        fabricas.forEach(System.out::println);
        fabricas.forEach(fabricaService::incluir);
    }
}
