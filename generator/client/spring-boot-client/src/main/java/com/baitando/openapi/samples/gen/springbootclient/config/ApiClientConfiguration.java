package com.baitando.openapi.samples.gen.springbootclient.config;

import com.baitando.openapi.samples.gen.springbootclient.client.ApiClient;
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
