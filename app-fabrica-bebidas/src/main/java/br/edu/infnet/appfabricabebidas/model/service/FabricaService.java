package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.client.FabricaClient;
import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class FabricaService {

    private final FabricaClient fabricaClient;

    public FabricaService(FabricaClient fabricaClient) {
        this.fabricaClient = fabricaClient;
    }

    public void incluir(Fabrica fabrica) {
        fabricaClient.incluir(fabrica);
    }

    public void excluir(Integer id) {
        fabricaClient.excluir(id);
    }

    public Collection<Fabrica> listar(Usuario usuario) {
        return fabricaClient.listar(usuario.getId());
    }
}
