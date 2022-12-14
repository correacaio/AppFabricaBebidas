package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Bebida;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Integer> {

    List<Bebida> findAllByUsuarioId(Integer userId);
}
