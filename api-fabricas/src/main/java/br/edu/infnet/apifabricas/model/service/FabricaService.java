package br.edu.infnet.apifabricas.model.service;

import br.edu.infnet.apifabricas.model.domain.Fabrica;
import br.edu.infnet.apifabricas.model.domain.Usuario;
import br.edu.infnet.apifabricas.model.repository.FabricaRepository;
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

    public Collection<Fabrica> listar(Usuario usuario) {
        return fabricaRepository.findAllByUsuarioId(usuario.getId());
    }
}
