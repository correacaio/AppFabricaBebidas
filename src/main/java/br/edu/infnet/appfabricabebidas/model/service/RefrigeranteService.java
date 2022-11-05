package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import br.edu.infnet.appfabricabebidas.model.repository.RefrigeranteRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class RefrigeranteService {

    private final RefrigeranteRepository refrigeranteRepository;

    public RefrigeranteService(RefrigeranteRepository refrigeranteRepository) {
        this.refrigeranteRepository = refrigeranteRepository;
    }

    public void incluir(Refrigerante refrigerante) {
        refrigeranteRepository.save(refrigerante);
    }

    public void excluir(Integer id) {
        refrigeranteRepository.deleteById(id);
    }

    public Collection<Refrigerante> listar() {
        return (Collection<Refrigerante>) refrigeranteRepository.findAll();
    }

    public Refrigerante obter(Integer id) {
        return refrigeranteRepository.findById(id).orElse(null);
    }
}
