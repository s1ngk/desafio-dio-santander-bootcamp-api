package me.dio.dio_santander_bootcamp_api.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.dio_santander_bootcamp_api.domain.model.Account;
import me.dio.dio_santander_bootcamp_api.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Integer id) {
        var account = accountService.findById(id);
        return ResponseEntity.ok(account);
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account accountToCreate) {
        var accountCreated = accountService.create(accountToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{account}").buildAndExpand(accountCreated.getUsername()).toUri();
        return ResponseEntity.created(location).body(accountCreated);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Integer id, @RequestBody Account accountToModify) {
        var updatedAccount = accountService.updateAccount(id, accountToModify);
        return ResponseEntity.ok(updatedAccount);
    }
}
