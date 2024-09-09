package net.ipyana.banking.entity.mapper;

import net.ipyana.banking.dto.AccountDto;
import net.ipyana.banking.entity.Account;
import net.ipyana.banking.repository.AccountRepository;

public class AccountMapper {

    //method to map dto to jpa
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    //method to map jpa to dto
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return  accountDto;
    }
}
