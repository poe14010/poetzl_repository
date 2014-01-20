package nico.poetzl.projectpoetzl.repositoryjpa;

import java.util.List;

import nico.poetzl.projectpoetzl.domain.Kauf;

import org.springframework.stereotype.Repository;

@Repository
public class KaufJpaRepository extends
		AbstractJpaRepository<Kauf> {

	public List<Kauf> findAll() {
		return entityManager().createQuery("SELECT k FROM KAUF k",
				Kauf.class).getResultList();
	}

	public Kauf findById(Long id) {
		return entityManager().find(Kauf.class, id);
	}
}