package com.baitando.swagger.samples.codegen.springbootclient.service.internal;

import com.baitando.swagger.samples.codegen.springbootclient.api.DefaultApi;
import com.baitando.swagger.samples.codegen.springbootclient.service.AccountService;
import com.baitando.swagger.samples.codegen.springbootclient.service.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestAccountService implements AccountService {

    private final DefaultApi apiClient;

    public RestAccountService(DefaultApi apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public List<Account> getAccounts() {
        return AccountConverter.convertFromDto(apiClient.getAccounts());
    }
}
