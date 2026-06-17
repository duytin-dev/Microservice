package com.iTech.accountservice.repository;

import com.iTech.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
