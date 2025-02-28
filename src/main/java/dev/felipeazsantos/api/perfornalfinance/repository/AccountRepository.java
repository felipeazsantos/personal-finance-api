package dev.felipeazsantos.api.perfornalfinance.repository;

import dev.felipeazsantos.api.perfornalfinance.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
