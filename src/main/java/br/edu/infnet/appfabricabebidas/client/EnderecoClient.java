package br.edu.infnet.appfabricabebidas.client;

import br.edu.infnet.appfabricabebidas.model.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface EnderecoClient {

    @GetMapping("/{cep}/json")
    Endereco obter(@PathVariable String cep);
}
