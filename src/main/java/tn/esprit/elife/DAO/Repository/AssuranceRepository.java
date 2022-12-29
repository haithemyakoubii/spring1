package tn.esprit.elife.DAO.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.elife.DAO.Entities.Assurance;

@Repository
public interface AssuranceRepository extends CrudRepository<Assurance, Long>{

}
