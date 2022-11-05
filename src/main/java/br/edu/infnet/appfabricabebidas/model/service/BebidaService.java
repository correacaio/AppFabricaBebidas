package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Bebida;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class BebidaService {

    private static final Map<Integer, Bebida> BEBIDAS = new HashMap<>();

    public void incluir(Bebida bebida) {
        BEBIDAS.put(bebida.getId(), bebida);
    }

    public void excluir(Integer id) {
        BEBIDAS.remove(id);
    }

    public Collection<Bebida> listar() {
        return BEBIDAS.values();
    }

    public Bebida obter(Integer id) {
        return BEBIDAS.get(id);
    }
}
