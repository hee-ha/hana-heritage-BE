package com.heeha.domain.account.repository;

import com.heeha.domain.account.entity.Account;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Boolean existsAccountByAccountNumber(Long accountNumber);
    @Query("SELECT a FROM account a join fetch a.customer where a.customer.id = :customerId")
    List<Account> findAccountByCustomerId(@Param(value = "customerId")Long customerId);

    Optional<Account> findByAccountNumber(Long recipientAccountNumber);
}
