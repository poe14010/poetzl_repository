package nico.poetzl.projectpoetzl.service;

import nico.poetzl.projectpoetzl.domain.Filiale;
import nico.poetzl.projectpoetzl.domain.Mitarbeiter;
import nico.poetzl.projectpoetzl.repositoryjpa.MitarbeiterJpaRepository;

//import at.grueneis.timetable.repositoryjpa.ClassRoomJpaRepository;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagementService {
    @Autowired
	private MitarbeiterJpaRepository mitarbeiterJpaRepository;

	public void createNewMitarbeiter(String name) {
		// start transaction
		// write audit log
		float gehalt= 1900;
		  Filiale filiale= new Filiale("Filiale 1","Straße1", 4000 , new Date());
		Mitarbeiter mitarbeiter = new Mitarbeiter(new Date(), gehalt , filiale);
		mitarbeiterJpaRepository.persist(mitarbeiter);
		// end (commit) transaction
	}
}
