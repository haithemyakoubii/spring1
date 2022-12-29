package tn.esprit.elife.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import tn.esprit.elife.DAO.Entities.Contrat;
import tn.esprit.elife.DAO.Repository.ContratRepository;

@Service
@Slf4j
public class ContratService implements IContratService {
	
	@Autowired
	ContratRepository ContratRepo;

	@Override
	public List<Contrat> retrieAllContrat() {
		
		return (List <Contrat>)ContratRepo.findAll();
	}

	@Override
	public Contrat addContrat(Contrat c) {
		ContratRepo.save(c);
		return c;
	}

	@Override
	public void deleteContrat(long id) {
		ContratRepo.deleteById(id);
		
	}

	@Override
	public Contrat updateContrat(Contrat c) {
		ContratRepo.save(c);
		return c;
	}
	

}
