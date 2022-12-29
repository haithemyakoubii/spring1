package tn.esprit.elife.Services;

import java.util.List;


import tn.esprit.elife.DAO.Entities.Contrat;

public interface IContratService {
	
	List <Contrat> retrieAllContrat();
	Contrat addContrat (Contrat c);
	void deleteContrat(long id);
	Contrat updateContrat (Contrat c);


}
