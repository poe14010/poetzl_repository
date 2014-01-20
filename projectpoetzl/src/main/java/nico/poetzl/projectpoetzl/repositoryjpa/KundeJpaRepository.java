package nico.poetzl.projectpoetzl.repositoryjpa;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import nico.poetzl.projectpoetzl.domain.Kunde;



@SuppressWarnings("unused")
@Repository
public class KundeJpaRepository extends AbstractJpaRepository<Kunde> {

    public List<Kunde> findAll() {
        return entityManager().createQuery("SELECT t FROM Teacher t", Kunde.class).getResultList();
    }

    public Kunde findById(Long id) {
        return entityManager().find(Kunde.class, id);
    }

	
}