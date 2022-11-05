package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class SucoService {

    private static final Map<Integer, Suco> SUCOS = new HashMap<>();

    public void incluir(Suco suco) {
        SUCOS.put(suco.getId(), suco);
    }

    public void excluir(Integer id) {
        SUCOS.remove(id);
    }

    public Collection<Suco> listar() {
        return SUCOS.values();
    }

    public Suco obter(Integer id) {
        return SUCOS.get(id);
    }
}
