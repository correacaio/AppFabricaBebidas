package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Refrigerante;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefrigeranteRepository extends CrudRepository<Refrigerante, Integer> {

    List<Refrigerante> findAllByUsuarioId(Integer userId);
}
