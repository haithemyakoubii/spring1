package tn.esprit.elife.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.elife.DAO.Entities.Assurance;

import tn.esprit.elife.DAO.Repository.AssuranceRepository;




@Service
@Slf4j
public class AssuranceService implements IAssuranceService{

	@Autowired
	AssuranceRepository AssuranceRep;
	
	@Override
	public List<Assurance> retrieAllAssurance() {
		
		return (List <Assurance>)AssuranceRep.findAll();
	}

	@Override
	public Assurance addAssurance(Assurance a) {
		
		AssuranceRep.save(a);
		return a;
	}

	@Override
	public void deleteAssurance(long id) {
		
		AssuranceRep.deleteById(id);
		
	}

	@Override
	public Assurance updateAssurance(Assurance a) {
		AssuranceRep.save(a);
		return a;
	}
	

}
