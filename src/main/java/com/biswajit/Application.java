package com.biswajit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.biswajit.entity.Account;
import com.biswajit.entity.AccountPK;
import com.biswajit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountRepo bean = context.getBean(AccountRepo.class);
/*
		AccountPK pk = new AccountPK();
		pk.setAccNum(1525852666);
		pk.setAccType("Savings");

		Account acc = new Account();
		acc.setHolderName("Biswajit");
		acc.setBranch("Ameerpet");
		acc.setAccountPk(pk);

		bean.save(acc);
		System.out.println("Record saved.....");
*/
		

		AccountPK pk = new AccountPK();
		pk.setAccNum(1525852666);
		pk.setAccType("Savings");
		
		Optional<Account>  findById=bean.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}

		
		
		
	}

}
