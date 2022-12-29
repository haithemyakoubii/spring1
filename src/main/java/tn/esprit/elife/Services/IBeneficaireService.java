package tn.esprit.elife.Services;

import java.util.List;


import tn.esprit.elife.DAO.Entities.Beneficaire;

public interface IBeneficaireService {
	List <Beneficaire> retrieAllBeneficaire();
	Beneficaire addBeneficaire (Beneficaire b);
	void deleteBeneficaire(long id);
	Beneficaire updateBeneficaire (Beneficaire b);

}
