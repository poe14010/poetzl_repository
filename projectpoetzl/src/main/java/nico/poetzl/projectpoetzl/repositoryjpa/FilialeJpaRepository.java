package nico.poetzl.projectpoetzl.repositoryjpa;

import java.util.List;

import nico.poetzl.projectpoetzl.domain.Filiale;

import org.springframework.stereotype.Repository;

@Repository
public class FilialeJpaRepository extends
		AbstractJpaRepository<Filiale> {

	public List<Filiale> findAll() {
		return entityManager().createQuery("SELECT t FROM Teacher t",
				Filiale.class).getResultList();
	}

	public Filiale findById(Long id) {
		return entityManager().find(Filiale.class, id);
	}
}