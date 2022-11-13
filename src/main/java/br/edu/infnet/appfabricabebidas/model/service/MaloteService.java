package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.repository.MaloteRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class MaloteService {

    private final MaloteRepository maloteRepository;

    public MaloteService(MaloteRepository maloteRepository) {
        this.maloteRepository = maloteRepository;
    }

    public void incluir(Malote malote) {
        maloteRepository.save(malote);
    }

    public void excluir(Integer id) {
        maloteRepository.deleteById(id);
    }

    public Collection<Malote> listar() {
        return (Collection<Malote>) maloteRepository.findAll();
    }

    public Collection<Malote> listar(Usuario usuario) {
        return maloteRepository.findAllByUsuarioId(usuario.getId());
    }

    public Malote obter(Integer id) {
        return maloteRepository.findById(id).orElse(null);
    }
}
