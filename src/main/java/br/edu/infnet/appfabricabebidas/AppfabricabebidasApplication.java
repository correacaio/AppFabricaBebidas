package br.edu.infnet.appfabricabebidas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppfabricabebidasApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppfabricabebidasApplication.class, args);
    }

}
