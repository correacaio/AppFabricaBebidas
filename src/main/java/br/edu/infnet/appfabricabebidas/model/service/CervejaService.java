package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import br.edu.infnet.appfabricabebidas.model.repository.CervejaRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class CervejaService {

    private final CervejaRepository cervejaRepository;

    public CervejaService(CervejaRepository cervejaRepository) {
        this.cervejaRepository = cervejaRepository;
    }

    public void incluir(Cerveja cerveja) {
        cervejaRepository.save(cerveja);
    }

    public void excluir(Integer id) {
        cervejaRepository.deleteById(id);
    }

    public Collection<Cerveja> listar() {
        return (Collection<Cerveja>) cervejaRepository.findAll();
    }

    public Cerveja obter(Integer id) {
        return cervejaRepository.findById(id).orElse(null);
    }
}
