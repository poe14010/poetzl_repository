package nico.poetzl.projectpoetzl.repository;

import nico.poetzl.projectpoetzl.domain.Mitarbeiter;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends CrudRepository<Mitarbeiter, Long> {

    List<Mitarbeiter> findByName(String name);

}
