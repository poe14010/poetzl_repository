package nico.poetzl.projectpoetzl.repositoryjpa;

import java.util.List;

import nico.poetzl.projectpoetzl.domain.Auto;

import org.springframework.stereotype.Repository;

@Repository
public class AutoJpaRepository extends
		AbstractJpaRepository<Auto> {

	public List<Auto> findAll() {
		return entityManager().createQuery("SELECT t FROM Teacher t",
				Auto.class).getResultList();
	}

	public Auto findById(Long id) {
		return entityManager().find(Auto.class, id);
	}
}