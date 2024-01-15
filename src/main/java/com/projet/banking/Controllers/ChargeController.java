package com.projet.banking.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.banking.entities.Charge;
import com.projet.banking.services.ChargeService;

@RestController
@RequestMapping("/charge")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ChargeController {
	private ChargeService chargeService;

	public ChargeController(ChargeService chargeService) {
		super();
		this.chargeService = chargeService;
	}
	
	@PostMapping("/create")
	public Charge create(@RequestBody Charge charge) {
		
		return chargeService.create(charge);
	}
	

}
