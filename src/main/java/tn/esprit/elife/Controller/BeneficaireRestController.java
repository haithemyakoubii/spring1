package tn.esprit.elife.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.elife.DAO.Entities.Beneficaire;

import tn.esprit.elife.Services.IBeneficaireService;

@RestController
@RequestMapping("/beneficaire")
public class BeneficaireRestController {
	@Autowired
	IBeneficaireService beneficaireService;

	
	// http://localhost:8092/SpringMVC/beneficaire/retrieve-all-beneficaire
				@GetMapping("/retrieve-all-beneficaire")
				@ResponseBody
				public List<Beneficaire> getBeneficaire() {
				List<Beneficaire> listBeneficaire = beneficaireService.retrieAllBeneficaire();
				

				return listBeneficaire;
			}

				// http://localhost:8092/SpringMVC/beneficaire/add-beneficaire
				@PostMapping("/add-beneficaire")
				@ResponseBody
				public Beneficaire addBeneficaire(@RequestBody Beneficaire b)
				{
					Beneficaire beneficaire = beneficaireService.addBeneficaire(b);
				return beneficaire;
				}
				
				// http://localhost:8092/SpringMVC/beneficaire/remove-beneficaire/{beneficaire-id}
				@DeleteMapping("/remove-beneficaire/{beneficaire-id}")
				@ResponseBody
				public void removeClient(@PathVariable("beneficaire-id") Long beneficaireId) {
					beneficaireService.deleteBeneficaire(beneficaireId);
				}
				
				// http://localhost:8092/SpringMVC/beneficaire/modify-beneficaire
				@PutMapping("/modify-beneficaire")
				@ResponseBody
				public Beneficaire modifyBeneficaire(@RequestBody Beneficaire beneficaire) {
				return beneficaireService.updateBeneficaire(beneficaire);
				}
}
