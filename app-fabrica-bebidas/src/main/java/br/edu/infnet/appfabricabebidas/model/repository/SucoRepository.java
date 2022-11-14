package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Suco;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucoRepository extends CrudRepository<Suco, Integer> {

    List<Suco> findAllByUsuarioId(Integer userId);
}
