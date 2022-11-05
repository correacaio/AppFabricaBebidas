package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class FabricaService {

    private static final Map<Integer, Fabrica> FABRICAS = new HashMap<>();

    public void incluir(Fabrica fabrica) {
        FABRICAS.put(fabrica.getId(), fabrica);
    }

    public void excluir(Integer id) {
        FABRICAS.remove(id);
    }

    public Collection<Fabrica> listar() {
        return FABRICAS.values();
    }

    public Fabrica obter(Integer id) {
        return FABRICAS.get(id);
    }
}
