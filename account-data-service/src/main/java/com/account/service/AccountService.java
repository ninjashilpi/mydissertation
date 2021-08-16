package com.account.service;


import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.account.acc_ws.AccountInfo;
import com.account.acc_ws.AccountRequest;
import com.account.model.Account;
import com.account.repository.AccountRepository;



@Service
public class AccountService {


	@Autowired
	AccountRepository accountRepository;

	private static long createRandomId(){    
		return (long)(Math.random()*100000 + 3333300000L);
	}

	public AccountInfo getAccountDetailsById(AccountRequest  acc) throws DatatypeConfigurationException {
		Account accountList=accountRepository.findByAccountNumber(acc.getAccountNumber());
		AccountInfo accountInfo=new AccountInfo();		
		XMLGregorianCalendar xmlDate = null;
		
		
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(accountList.getOpen_date());	 
			try{
				xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			}catch(Exception e){
				e.printStackTrace();
			}
			accountInfo.setId(createRandomId());
			accountInfo.setAccountNumber(accountList.getAccountNumber());
			accountInfo.setType(accountList.getType());
			accountInfo.setOpenDate(xmlDate);
			accountInfo.setCurrency(accountList.getCurrency());
			accountInfo.setScheme(accountList.getScheme());
			accountInfo.setCardNumber(accountList.getCard_number());
			accountInfo.setCharges(accountList.getCharges());
			accountInfo.setOverdraftAmout(accountList.getOverdraft_amount()); 
			accountInfo.setOverdraftLimit(accountList.getOverdraft_limit());
			accountInfo.setSortCode(accountList.getSort_code());
			accountInfo.setActive(accountList.getActive());
		
		
		return accountInfo;
	}

}
