package me.dio.dio_santander_bootcamp_api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.dio_santander_bootcamp_api.domain.model.Account;
import me.dio.dio_santander_bootcamp_api.domain.repository.AccountRepository;
import me.dio.dio_santander_bootcamp_api.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    
    @Override
    public Account findById(Integer id) {
        return accountRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Account create(Account accountToCreate) {
        if (accountRepository.existsByUsername(accountToCreate.getUsername())){
            throw new IllegalArgumentException("Esse nome de usuário já existe.");
        }
        return accountRepository.save(accountToCreate);
    }

    @Override
    public Account updateAccount(Integer id, Account accountToModify) {
        Account existingAccount = accountRepository.findById(id).orElseThrow(NoSuchElementException::new);
        existingAccount.setPassword(accountToModify.getPassword());
        existingAccount.setEmail(accountToModify.getEmail());
        existingAccount.setCharacters(accountToModify.getCharacters());

        return accountRepository.save(existingAccount);
    }

    @Override 
    public void deleteAccount(Integer id) {
        Account accountToDelete = accountRepository.findById(id).orElseThrow(NoSuchElementException::new);
        accountRepository.delete(accountToDelete);
    }
}