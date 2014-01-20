package nico.poetzl.projectpoetzl.repositoryjpa;

import java.util.List;

import nico.poetzl.projectpoetzl.domain.Mitarbeiter;

import org.springframework.stereotype.Repository;

@Repository
public class MitarbeiterJpaRepository extends
		AbstractJpaRepository<Mitarbeiter> {

	public List<Mitarbeiter> findAll() {
		return entityManager().createQuery("SELECT t FROM Teacher t",
				Mitarbeiter.class).getResultList();
	}

	public Mitarbeiter findById(Long id) {
		return entityManager().find(Mitarbeiter.class, id);
	}
}
