package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.repository.SucoRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class SucoService {

    private final SucoRepository sucoRepository;

    public SucoService(SucoRepository sucoRepository) {
        this.sucoRepository = sucoRepository;
    }

    public void incluir(Suco suco) {
        sucoRepository.save(suco);
    }

    public void excluir(Integer id) {
        sucoRepository.deleteById(id);
    }

    public Collection<Suco> listar() {
        return (Collection<Suco>) sucoRepository.findAll();
    }

    public Collection<Suco> listar(Usuario usuario) {
        return sucoRepository.findAllByUsuarioId(usuario.getId());
    }

    public Suco obter(Integer id) {
        return sucoRepository.findById(id).orElse(null);
    }
}
