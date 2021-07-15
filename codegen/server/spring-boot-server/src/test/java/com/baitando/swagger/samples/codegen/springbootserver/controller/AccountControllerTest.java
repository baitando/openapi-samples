package com.baitando.swagger.samples.codegen.springbootserver.controller;

import com.baitando.swagger.samples.codegen.springbootserver.api.AccountsApi;
import com.baitando.swagger.samples.codegen.springbootserver.service.AccountService;
import com.baitando.swagger.samples.codegen.springbootserver.service.data.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.verify;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest({
        AccountControllerTest.class,
        AccountsApi.class
})
@AutoConfigureRestDocs(outputDir = "target/generated-docs/snippets")
public class AccountControllerTest {

    @MockBean
    private AccountService accountService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAccounts_validRequest_returnsAccounts() throws Exception {

        // arrange
        when(accountService.getAccounts()).thenReturn(Arrays.asList(
                new Account("DE123"),
                new Account("AT321")
        ));

        // act
        ResultActions result = mockMvc.perform(
                get("/accounts")
                        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE));

        // assert
        result.andExpect(status().isOk())
                .andDo(document("get-accounts_success"));

//        verify(accountService, only()).getAccounts();
    }
}
