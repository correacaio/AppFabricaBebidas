package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MaloteService {

    private static final Map<Integer, Malote> MALOTES = new HashMap<>();

    public void incluir(Malote malote) {
        MALOTES.put(malote.getId(), malote);
    }

    public void excluir(Integer id) {
        MALOTES.remove(id);
    }

    public Collection<Malote> listar() {
        return MALOTES.values();
    }

    public Malote obter(Integer id) {
        return MALOTES.get(id);
    }
}
