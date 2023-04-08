package com.biswajit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biswajit.entity.Account;
import com.biswajit.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account,AccountPK> {

}
