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


import tn.esprit.elife.DAO.Entities.Contrat;

import tn.esprit.elife.Services.IContratService;

@RestController
@RequestMapping("/contrat")
public class ContratRestController {

	@Autowired
	IContratService contratService;
	
	// http://localhost:8092/SpringMVC/contrat/retrieve-all-contrat
				@GetMapping("/retrieve-all-contrat")
				@ResponseBody
				public List<Contrat> getContrat() {
				List<Contrat> listContrat = contratService.retrieAllContrat();
				

				return listContrat;
			}

				// http://localhost:8092/SpringMVC/contrat/add-contrat
				@PostMapping("/add-contrat")
				@ResponseBody
				public Contrat addContrat(@RequestBody Contrat c)
				{
					Contrat contrat = contratService.addContrat(c);
				return contrat;
				}
				
				// http://localhost:8092/SpringMVC/contrat/remove-contrat/{contrat-id}
				@DeleteMapping("/remove-contrat/{contrat-id}")
				@ResponseBody
				public void removeContrat(@PathVariable("contrat-id") Long contratId) {
				contratService.deleteContrat(contratId);
				}
				
				// http://localhost:8092/SpringMVC/contrat/modify-contrat
				@PutMapping("/modify-contrat")
				@ResponseBody
				public Contrat modifyContrat(@RequestBody Contrat contrat) {
				return contratService.updateContrat(contrat);
				}
}
