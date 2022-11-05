package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CervejaService {

    private static final Map<Integer, Cerveja> CERVEJAS = new HashMap<>();

    public void incluir(Cerveja cerveja) {
        CERVEJAS.put(cerveja.getId(), cerveja);
    }

    public void excluir(Integer id) {
        CERVEJAS.remove(id);
    }

    public Collection<Cerveja> listar() {
        return CERVEJAS.values();
    }

    public Cerveja obter(Integer id) {
        return CERVEJAS.get(id);
    }
}
