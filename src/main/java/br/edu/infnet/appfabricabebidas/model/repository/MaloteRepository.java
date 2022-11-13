package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Malote;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaloteRepository extends CrudRepository<Malote, Integer> {

    List<Malote> findAllByUsuarioId(Integer userId);
}
