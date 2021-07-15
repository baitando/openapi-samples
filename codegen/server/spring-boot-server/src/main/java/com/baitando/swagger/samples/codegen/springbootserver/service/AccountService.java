package com.baitando.swagger.samples.codegen.springbootserver.service;

import com.baitando.swagger.samples.codegen.springbootserver.service.data.Account;

import java.util.List;

/**
 * Service responsible for managing accounts.
 */
public interface AccountService {

    /**
     * Get all accounts.
     *
     * @return All accounts.
     */
    List<Account> getAccounts();
}
