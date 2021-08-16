package com.customer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {	
	@Query("{'account_id':?0}")
	List<Customer> retrieveByCustomerDetailsById(int account_id);

}
