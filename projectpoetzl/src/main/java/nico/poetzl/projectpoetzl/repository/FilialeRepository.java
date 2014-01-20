package nico.poetzl.projectpoetzl.repository;

import nico.poetzl.projectpoetzl.domain.Filiale;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialeRepository extends CrudRepository<Filiale, Long> {

    List<Filiale> findByName(String name);

}
