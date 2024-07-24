package me.dio.dio_santander_bootcamp_api.service;


import me.dio.dio_santander_bootcamp_api.domain.model.Account;

public interface AccountService {
    Account findById(Integer id);

    Account create(Account accountToCreate);

    Account updateAccount(Integer id, Account accountToModify);

    void deleteAccount(Integer id);
}