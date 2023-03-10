package com.deloitte.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deloitte.bank.entity.Bank;

@Repository
public interface DataRepository extends JpaRepository< Bank, Long> {

}
