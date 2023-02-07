package com.deloitte.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.bank.entity.Bank;
import com.deloitte.bank.service.BankService;

@RestController
public class Controller {

	@Autowired
	private BankService bankService;
	
	@PostMapping("/bankdetails")
	public Bank saveDetails( @RequestBody Bank bd) {

		return bankService.saveDetails(bd);
	}

	@PutMapping("/bankdetails/{id}")
	public Bank updateDetails(@RequestBody Bank bd, @PathVariable("id") Long acc) {
	
		return bankService.updateDetails(bd, acc);
	}

	@GetMapping("/bankdetails")
	public List<Bank> fetchDetails() {
		
		return bankService.fetchDetails();
	}

	@DeleteMapping("/bankdetails/{id}")
	public void deleteDetails(@PathVariable("id") Long acc) {
		
		bankService.deleteDetails(acc);
	}
}
