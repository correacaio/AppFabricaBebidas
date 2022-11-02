package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.domain.Empresa;
import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.domain.Suco;
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

        Empresa empresa = new Empresa();
        empresa.setNome("Ambev");
        empresa.setCnpj("123456701234");
        empresa.setAnoFundacao(1800);

        Fabrica fabrica1 = new Fabrica();
        fabrica1.setLocalizacao("Sao Carlos - SP");
        fabrica1.setTamanho("P");
        fabrica1.setDataInicializacao(LocalDate.of(2012, Month.APRIL, 20));
        fabrica1.setEmpresa(empresa);
        fabrica1.setBebidas(List.of(cerveja, refrigerante));

        Fabrica fabrica2 = new Fabrica();
        fabrica2.setLocalizacao("Santa Lucia - SP");
        fabrica2.setTamanho("PP");
        fabrica2.setDataInicializacao(LocalDate.of(2095, Month.JUNE, 30));
        fabrica2.setEmpresa(empresa);
        fabrica2.setBebidas(List.of(cerveja, suco));

        Fabrica fabrica3 = new Fabrica();
        fabrica3.setLocalizacao("Fortaleza - CE");
        fabrica3.setTamanho("M");
        fabrica3.setDataInicializacao(LocalDate.of(2022, Month.NOVEMBER, 22));
        fabrica3.setEmpresa(empresa);
        fabrica3.setBebidas(List.of(cerveja, refrigerante, suco));

        List.of(fabrica1, fabrica2, fabrica3)
            .stream().map(fabrica -> "Fabrica - " + fabrica)
            .forEach(System.out::println);
    }
}
