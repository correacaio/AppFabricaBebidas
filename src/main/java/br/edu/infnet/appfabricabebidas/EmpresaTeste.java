package br.edu.infnet.appfabricabebidas;

import br.edu.infnet.appfabricabebidas.model.domain.Empresa;
import br.edu.infnet.appfabricabebidas.model.domain.builder.EmpresaConstrutor;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmpresaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Empresa empresa1 = EmpresaConstrutor.novo()
                .nome("Ambev")
                .cnpj("123456701234")
                .anoFundacao(1800)
                .constroi();

        Empresa empresa2 = EmpresaConstrutor.novo()
            .nome("Heineken")
            .cnpj("43210987654321")
            .anoFundacao(1700)
            .constroi();

        Empresa empresa3 = EmpresaConstrutor.novo()
            .nome("Hocus Pocus")
            .cnpj("13131313131313")
            .anoFundacao(2014)
            .constroi();

        List.of(empresa1, empresa2, empresa3)
            .forEach(System.out::println);
    }
}
