package com.baitando.openapi.samples.gen.springbootclient.service.internal;

import com.baitando.openapi.samples.gen.springbootclient.service.AccountService;
import com.baitando.openapi.samples.gen.springbootclient.service.model.Account;
import com.baitando.openapi.samples.gen.springbootclient.api.DefaultApi;
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
