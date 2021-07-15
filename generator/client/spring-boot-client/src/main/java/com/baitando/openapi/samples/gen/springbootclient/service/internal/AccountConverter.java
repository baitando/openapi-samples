package com.baitando.openapi.samples.gen.springbootclient.service.internal;

import com.baitando.openapi.samples.gen.springbootclient.service.model.Account;
import com.baitando.openapi.samples.gen.springbootclient.model.AccountDto;
import com.baitando.openapi.samples.gen.springbootclient.model.GetAccountsResponseDto;

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
