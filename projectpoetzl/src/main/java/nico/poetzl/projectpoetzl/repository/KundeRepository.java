package nico.poetzl.projectpoetzl.repository;

import nico.poetzl.projectpoetzl.domain.Kunde;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundeRepository extends CrudRepository<Kunde, Long> {

    List<Kunde> findByName(String name);

}
