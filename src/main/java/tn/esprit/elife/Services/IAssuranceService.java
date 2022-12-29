package tn.esprit.elife.Services;

import java.util.List;

import tn.esprit.elife.DAO.Entities.Assurance;



public interface IAssuranceService {
	List <Assurance> retrieAllAssurance();
	Assurance addAssurance (Assurance a);
	void deleteAssurance(long id);
	Assurance updateAssurance (Assurance a);

}
