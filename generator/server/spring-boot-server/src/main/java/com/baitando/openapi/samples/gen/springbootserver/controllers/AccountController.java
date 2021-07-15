package com.baitando.openapi.samples.gen.springbootserver.controllers;


import com.baitando.openapi.samples.gen.springbootserver.api.AccountsApi;
import com.baitando.openapi.samples.gen.springbootserver.model.AccountDto;
import com.baitando.openapi.samples.gen.springbootserver.model.GetAccountsResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Implementation of REST API which allows to manage accounts.
 */
@RestController
public class AccountController implements AccountsApi {

    @Override
    public ResponseEntity<GetAccountsResponseDto> getAccounts() {
        return ResponseEntity.ok(
                new GetAccountsResponseDto().items(
                        Arrays.asList(
                                createAccount("DEXXXX"),
                                createAccount("ENYYYY")))
        );
    }

    private AccountDto createAccount(String iban) {
        AccountDto account = new AccountDto();
        account.setIban(iban);
        return account;
    }
}
