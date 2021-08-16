package com.customer.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.model.Customer;
import com.customer.model.CustomerRequest;
import com.customer.model.CustomerResponse;
import com.customer.repository.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerResponse retrieveByCustomerDetailsById(CustomerRequest customer) {
		CustomerResponse customerResponse=null;
		List<Customer> custList= customerRepository.retrieveByCustomerDetailsById(customer.getParty_id());
		if (custList.size() == 1) 
		{	
			customerResponse= new CustomerResponse(createRandomId(),custList.get(0).getAccount_id(),custList.get(0).getTitle(),custList.get(0).getFirst_name(),custList.get(0).getLast_name(),custList.get(0).getProduct_data(),custList.get(0).getAddresses());
		}
		return customerResponse;
	}
	
	
	private static long createRandomId(){    
		return (long)(Math.random()*100000 + 3333300000L);
	}
		

}
