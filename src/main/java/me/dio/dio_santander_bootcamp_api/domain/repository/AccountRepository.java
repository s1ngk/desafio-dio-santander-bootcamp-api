package me.dio.dio_santander_bootcamp_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.dio_santander_bootcamp_api.domain.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    boolean existsByUsername(String accountUsername);
}