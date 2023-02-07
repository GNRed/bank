package com.deloitte.bank.service;

import java.util.List;
import com.deloitte.bank.entity.Bank;

public interface BankService {

	// Save 
	Bank saveDetails(Bank bd);
	
	// Update
	Bank updateDetails(Bank bd, Long acc);
	
	// Retrieve Details
	List<Bank> fetchDetails();
	
	//Delete by acc_no
	void deleteDetails(Long acc);
}
