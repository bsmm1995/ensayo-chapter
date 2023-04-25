package com.bp.ensayo.ct1.repository;

import com.bp.ensayo.ct1.domain.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    @Query("""
            SELECT ae FROM com.bp.ensayo.ct1.domain.entity.AccountEntity ae WHERE ae.accountNumber = :accountNumber
            """)
    Optional<AccountEntity> findByAccountNumber(String accountNumber);
}
