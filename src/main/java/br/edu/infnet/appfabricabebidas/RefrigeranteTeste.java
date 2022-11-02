package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.builder.RefrigeranteConstrutor;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RefrigeranteTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Refrigerante refrigerante1 = RefrigeranteConstrutor.novo()
            .nome("Coca Cola")
            .descricao("Classico")
            .valor(8F)
            .gaseificado(true)
            .gramasAcucar(100)
            .sabor("Coca")
            .constroi();

        Refrigerante refrigerante2 = RefrigeranteConstrutor.novo()
            .nome("Pepsi")
            .descricao("Pode ser?")
            .valor(7F)
            .gaseificado(true)
            .gramasAcucar(110)
            .sabor("Coca")
            .constroi();

        Refrigerante refrigerante3 = RefrigeranteConstrutor.novo()
            .nome("Dolly Coca")
            .descricao("Dollynho")
            .valor(4F)
            .gaseificado(false)
            .gramasAcucar(80)
            .sabor("Coca")
            .constroi();

        List.of(refrigerante1, refrigerante2, refrigerante3)
            .forEach(System.out::println);
    }
}
