package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Cerveja;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CervejaRepository extends CrudRepository<Cerveja, Integer> {

    List<Cerveja> findAllByUsuarioId(Integer userId);
}
