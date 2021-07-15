package com.baitando.swagger.samples.codegen.springbootclient.service.model;

public class Account {

    private String iban;

    public Account(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                '}';
    }
}
