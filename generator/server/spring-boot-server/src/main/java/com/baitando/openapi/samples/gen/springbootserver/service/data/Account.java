package com.baitando.openapi.samples.gen.springbootserver.service.data;

/**
 * Represents a bank account.
 */
public class Account {

    private final String iban;

    public Account(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
}
