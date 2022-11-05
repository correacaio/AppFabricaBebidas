package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class RefrigeranteService {

    private static final Map<Integer, Refrigerante> REFRIGERANTES = new HashMap<>();

    public void incluir(Refrigerante refrigerante) {
        REFRIGERANTES.put(refrigerante.getId(), refrigerante);
    }

    public void excluir(Integer id) {
        REFRIGERANTES.remove(id);
    }

    public Collection<Refrigerante> listar() {
        return REFRIGERANTES.values();
    }

    public Refrigerante obter(Integer id) {
        return REFRIGERANTES.get(id);
    }
}
