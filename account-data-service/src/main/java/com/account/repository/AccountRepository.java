package com.account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.account.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

	Account findByAccountNumber(long account_number);
	
	

}
