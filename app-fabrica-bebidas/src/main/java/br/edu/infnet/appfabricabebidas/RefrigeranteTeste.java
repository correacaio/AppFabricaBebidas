package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.service.RefrigeranteService;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RefrigeranteTeste implements ApplicationRunner {

    private final RefrigeranteService refrigeranteService;

    public RefrigeranteTeste(RefrigeranteService refrigeranteService) {
        this.refrigeranteService = refrigeranteService;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro Refrigerante: ");

        Usuario usuario = new Usuario();
        usuario.setId(1);

        Refrigerante refrigerante1 = new Refrigerante();
        refrigerante1.setId(0);
        refrigerante1.setNome("Coca Cola");
        refrigerante1.setDescricao("Classico");
        refrigerante1.setValor(8F);
        refrigerante1.setGaseificado(true);
        refrigerante1.setGramasAcucar(100);
        refrigerante1.setSabor("Coca");
        refrigerante1.setUsuario(usuario);

        Refrigerante refrigerante2 = new Refrigerante();
        refrigerante2.setId(1);
        refrigerante2.setNome("Pepsi");
        refrigerante2.setDescricao("Pode ser?");
        refrigerante2.setValor(7F);
        refrigerante2.setGaseificado(true);
        refrigerante2.setGramasAcucar(110);
        refrigerante2.setSabor("Coca");
        refrigerante2.setUsuario(usuario);

        Refrigerante refrigerante3 = new Refrigerante();
        refrigerante3.setId(2);
        refrigerante3.setNome("Dolly Coca");
        refrigerante3.setDescricao("Dollynho");
        refrigerante3.setValor(4F);
        refrigerante3.setGaseificado(false);
        refrigerante3.setGramasAcucar(80);
        refrigerante3.setSabor("Coca");
        refrigerante3.setUsuario(usuario);

        List<Refrigerante> refrigerantes = List.of(refrigerante1, refrigerante2, refrigerante3);
        refrigerantes.forEach(System.out::println);
        refrigerantes.forEach(refrigeranteService::incluir);
    }
}
