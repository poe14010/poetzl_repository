package nico.poetzl.projectpoetzl.service;

import nico.poetzl.projectpoetzl.domain.Mitarbeiter;
import nico.poetzl.projectpoetzl.repositoryjpa.MitarbeiterJpaRepository;

//import at.grueneis.timetable.repositoryjpa.ClassRoomJpaRepository;


import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimetableManagementService {
    @Autowired
	private MitarbeiterJpaRepository mitarbeiterJpaRepository;

	public void createNewMitarbeiter(String name) {
		// start transaction
		// write audit log
		Mitarbeiter teacher = new Mitarbeiter(new Date(),float,Filiale);
		mitarbeiterJpaRepository.persist(teacher);
		// end (commit) transaction
	}
}
