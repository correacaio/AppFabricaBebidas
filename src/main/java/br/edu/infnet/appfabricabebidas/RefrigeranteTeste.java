package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.controller.RefrigeranteController;
import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RefrigeranteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro Refrigerante: ");

        Refrigerante refrigerante1 = new Refrigerante();
        refrigerante1.setId(0);
        refrigerante1.setNome("Coca Cola");
        refrigerante1.setDescricao("Classico");
        refrigerante1.setValor(8F);
        refrigerante1.setGaseificado(true);
        refrigerante1.setGramasAcucar(100);
        refrigerante1.setSabor("Coca");

        Refrigerante refrigerante2 = new Refrigerante();
        refrigerante2.setId(1);
        refrigerante2.setNome("Pepsi");
        refrigerante2.setDescricao("Pode ser?");
        refrigerante2.setValor(7F);
        refrigerante2.setGaseificado(true);
        refrigerante2.setGramasAcucar(110);
        refrigerante2.setSabor("Coca");

        Refrigerante refrigerante3 = new Refrigerante();
        refrigerante3.setId(2);
        refrigerante3.setNome("Dolly Coca");
        refrigerante3.setDescricao("Dollynho");
        refrigerante3.setValor(4F);
        refrigerante3.setGaseificado(false);
        refrigerante3.setGramasAcucar(80);
        refrigerante3.setSabor("Coca");

        List
            .of(refrigerante1, refrigerante2, refrigerante3)
            .forEach(RefrigeranteController::incluir);
    }
}
