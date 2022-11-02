package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Empresa;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpresaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Cadastro de Empresa:");

        Empresa empresa1 = new Empresa();
        empresa1.setNome("Ambev");
        empresa1.setCnpj("123456701234");
        empresa1.setAnoFundacao(1800);

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Heineken");
        empresa2.setCnpj("43210987654321");
        empresa2.setAnoFundacao(1700);

        Empresa empresa3 = new Empresa();
        empresa3.setNome("Hocus Pocus");
        empresa3.setCnpj("13131313131313");
        empresa3.setAnoFundacao(2014);

        List.of(empresa1, empresa2, empresa3)
            .stream().map(empresa -> "Empresa - " + empresa)
            .forEach(System.out::println);
    }
}
