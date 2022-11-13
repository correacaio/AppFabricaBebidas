package br.edu.infnet.appfabricabebidas.model.service;

import br.edu.infnet.appfabricabebidas.model.domain.Bebida;
import br.edu.infnet.appfabricabebidas.model.domain.Usuario;
import br.edu.infnet.appfabricabebidas.model.repository.BebidaRepository;
import java.util.Collection;
import org.springframework.stereotype.Service;

@Service
public class BebidaService {

    private final BebidaRepository bebidaRepository;

    public BebidaService(BebidaRepository bebidaRepository) {
        this.bebidaRepository = bebidaRepository;
    }

    public void incluir(Bebida bebida) {
        bebidaRepository.save(bebida);
    }

    public void excluir(Integer id) {
        bebidaRepository.deleteById(id);
    }

    public Collection<Bebida> listar() {
        return (Collection<Bebida>) bebidaRepository.findAll();
    }

    public Collection<Bebida> listar(Usuario usuario) {
        return bebidaRepository.findAllByUsuarioId(usuario.getId());
    }

    public Bebida obter(Integer id) {
        return bebidaRepository.findById(id).orElse(null);
    }
}
