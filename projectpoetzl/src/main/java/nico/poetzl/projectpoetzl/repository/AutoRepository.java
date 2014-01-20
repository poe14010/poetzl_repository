

package nico.poetzl.projectpoetzl.repository;

import nico.poetzl.projectpoetzl.domain.Auto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends CrudRepository<Auto, Long> {

    List<Auto> findByName(String name);

}
