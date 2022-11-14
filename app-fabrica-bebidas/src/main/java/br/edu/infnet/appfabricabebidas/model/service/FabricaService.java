package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.repository.FabricaRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class FabricaService {

    private final FabricaRepository fabricaRepository;

    public FabricaService(FabricaRepository fabricaRepository) {
        this.fabricaRepository = fabricaRepository;
    }

    public void incluir(Fabrica fabrica) {
        fabricaRepository.save(fabrica);
    }

    public void excluir(Integer id) {
        fabricaRepository.deleteById(id);
    }

    public Collection<Fabrica> listar() {
        return (Collection<Fabrica>) fabricaRepository.findAll();
    }

    public Collection<Fabrica> listar(Usuario usuario) {
        return fabricaRepository.findAllByUsuarioId(usuario.getId());
    }

    public Fabrica obter(Integer id) {
        return fabricaRepository.findById(id).orElse(null);
    }
}
