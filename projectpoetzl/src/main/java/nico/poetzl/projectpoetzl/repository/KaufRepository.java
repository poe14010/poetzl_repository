package nico.poetzl.projectpoetzl.repository;

import nico.poetzl.projectpoetzl.domain.Kauf;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaufRepository extends CrudRepository<Kauf, Long> {

    List<Kauf> findByName(String name);

}
