package nico.poetzl.projectpoetzl.repositoryjpa;



public interface PersistenceFactory {
	
	
	AutoJpaRepository AutoRepository();
	FilialeJpaRepository FilialeRepository();
	KaufJpaRepository KaufRepository();
	KundeJpaRepository KundeRepository();
	MitarbeiterJpaRepository MitarbeiterRepository();

}
