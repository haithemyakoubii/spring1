package tn.esprit.elife.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import tn.esprit.elife.DAO.Entities.Beneficaire;
import tn.esprit.elife.DAO.Repository.BeneficaireRepository;

@Service
@Slf4j
public class BeneficaireService implements IBeneficaireService {

	@Autowired
	BeneficaireRepository BeneficaireRep;
	
	
	@Override
	public List<Beneficaire> retrieAllBeneficaire() {
		
		return (List <Beneficaire>)BeneficaireRep.findAll();
	}

	@Override
	public Beneficaire addBeneficaire(Beneficaire b) {
		BeneficaireRep.save(b);
		return b;
	}

	@Override
	public void deleteBeneficaire(long id) {
		BeneficaireRep.deleteById(id);
		
	}

	@Override
	public Beneficaire updateBeneficaire(Beneficaire b) {
		BeneficaireRep.save(b);
		return b;
		
	}

}
