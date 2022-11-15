package br.edu.infnet.apifabricas.model.repository;

import br.edu.infnet.apifabricas.model.domain.Fabrica;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricaRepository extends CrudRepository<Fabrica, Integer> {

    List<Fabrica> findAllByUsuarioId(Integer userId);
}
