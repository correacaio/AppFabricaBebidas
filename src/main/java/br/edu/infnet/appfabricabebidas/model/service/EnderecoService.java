package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.client.EnderecoClient;
import br.edu.infnet.appfabricabebidas.model.domain.Endereco;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    private EnderecoClient enderecoClient;

    public EnderecoService(EnderecoClient enderecoClient) {
        this.enderecoClient = enderecoClient;
    }

    public Endereco obter(String cep) {
        return enderecoClient.obter(cep);
    }
}
