package com.baitando.swagger.samples.codegen.springbootclient.config;

import com.baitando.swagger.samples.codegen.springbootclient.client.ApiClient;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of the generated API client.
 */
@Configuration
public class ApiClientConfiguration {
    public ApiClientConfiguration(ApiClient apiClient) {
        apiClient.setBasePath("http://localhost:8080");
    }

}
