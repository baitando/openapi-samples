package com.baitando.swagger.samples.codegen.springbootclient.controller;

import com.baitando.swagger.samples.codegen.springbootclient.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountsController {

    private final AccountService accountService;

    public AccountsController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(path = "/accounts")
    public String getAccounts(Model model) {
        model.addAttribute("accounts", accountService.getAccounts());
        return "list";
    }
}
