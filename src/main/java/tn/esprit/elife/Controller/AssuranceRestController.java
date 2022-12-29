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

import tn.esprit.elife.DAO.Entities.Assurance;

import tn.esprit.elife.Services.IAssuranceService;

@RestController
@RequestMapping("/assurance")
public class AssuranceRestController {
	
	@Autowired
	IAssuranceService assuranceService;
	
	// http://localhost:8092/SpringMVC/assurance/retrieve-all-assurance
			@GetMapping("/retrieve-all-assurance")
			@ResponseBody
			public List<Assurance> getAssurance() {
			List<Assurance> listAssurance = assuranceService.retrieAllAssurance();
			

			return listAssurance;
		}

			// http://localhost:8092/SpringMVC/assurance/add-assurance
			@PostMapping("/add-assurance")
			@ResponseBody
			public Assurance addAssurance(@RequestBody Assurance a)
			{
			Assurance assurance = assuranceService.addAssurance(a);
			return assurance;
			}
			
			// http://localhost:8092/SpringMVC/assurance/remove-assurance/{assurance-id}
			@DeleteMapping("/remove-assurance/{assurance-id}")
			@ResponseBody
			public void removeClient(@PathVariable("assurance-id") Long assuranceId) {
			assuranceService.deleteAssurance(assuranceId);
			}
			
			// http://localhost:8092/SpringMVC/assurance/modify-assurance
			@PutMapping("/modify-assurance")
			@ResponseBody
			public Assurance modifyAssurance(@RequestBody Assurance assurance) {
			return assuranceService.updateAssurance(assurance);
			}
			
			
			
}
