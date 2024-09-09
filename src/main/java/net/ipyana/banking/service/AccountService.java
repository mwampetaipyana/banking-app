package net.ipyana.banking.service;

import net.ipyana.banking.dto.AccountDto;


public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);
}
