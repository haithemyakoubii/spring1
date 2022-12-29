package tn.esprit.elife.DAO.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.DAO.Entities.Beneficaire;

@Repository
public interface BeneficaireRepository extends CrudRepository<Beneficaire, Long>{

}
