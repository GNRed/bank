package com.deloitte.bank.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deloitte.bank.entity.Bank;
import com.deloitte.bank.repository.DataRepository;

@Service
public class ServiceImpl implements BankService {

	@Autowired
	private DataRepository datarepo;

	@Override
	public Bank saveDetails(Bank bd) {

		return datarepo.save(bd);
	}

	@Override
	public Bank updateDetails(Bank bd, Long acc) {
		
		Bank bank = datarepo.findById(acc).get();
		 
        if (Objects.nonNull(bd.getName()) && !"".equalsIgnoreCase(bd.getName())) {
           
        	bank.setName(bd.getName());
        }
 
        if (Objects.nonNull(bd.getAddress()) && !"".equalsIgnoreCase(bd.getAddress())) {
            
        	bank.setAddress(bd.getAddress());
        }
 
        return datarepo.save(bank);
		
	}

	
	@Override
	public List<Bank> fetchDetails() {
		
		return datarepo.findAll();
	}

	@Override
	public void deleteDetails(Long acc) {
		
		datarepo.deleteById(acc);
	}
	
	

}
