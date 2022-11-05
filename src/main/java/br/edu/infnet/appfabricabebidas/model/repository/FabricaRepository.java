package br.edu.infnet.appfabricabebidas.model.repository;

import br.edu.infnet.appfabricabebidas.model.domain.Fabrica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricaRepository extends CrudRepository<Fabrica, Integer> {
}
