package com.baitando.swagger.samples.codegen.springbootclient.service.internal;

import com.baitando.swagger.samples.codegen.springbootclient.model.AccountDto;
import com.baitando.swagger.samples.codegen.springbootclient.model.GetAccountsResponseDto;
import com.baitando.swagger.samples.codegen.springbootclient.service.model.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountConverter {

    static List<Account> convertFromDto(GetAccountsResponseDto accountDtos) {
        return accountDtos.getItems().stream().map(AccountConverter::convertFromDto).collect(Collectors.toList());
    }

    static Account convertFromDto(AccountDto accountDto) {
        return new Account(accountDto.getIban());
    }
}
