package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BebidaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Bebida:");

        Cerveja cerveja = new Cerveja();
        cerveja.setNome("Brahma");
        cerveja.setDescricao("Cerveja brasileira");
        cerveja.setValor(3.50F);
        cerveja.setTipo("Pilsen");
        cerveja.setPctAlcool(3.5F);
        cerveja.setFamilia("Lager");

        Refrigerante refrigerante = new Refrigerante();
        refrigerante.setNome("Coca Cola");
        refrigerante.setDescricao("Classico");
        refrigerante.setValor(8F);
        refrigerante.setGaseificado(true);
        refrigerante.setGramasAcucar(100);
        refrigerante.setSabor("Coca");

        Suco suco = new Suco();
        suco.setNome("Del Valle Laranja");
        suco.setDescricao("Laranja?");
        suco.setValor(6F);
        suco.setFruta("Laranja");
        suco.setAdicaoAcucar(true);
        suco.setPctSucoFruta(5.5F);

        System.out.println("Cerveja - " + cerveja);
        System.out.println("Refrigerante - " + refrigerante);
        System.out.println("Suco - " + suco);
    }
}
