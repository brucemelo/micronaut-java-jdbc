package com.github.brucemelo;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@MicronautTest
class HomeControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    @DisplayName("Should test home message")
    void test() {
        Assertions.assertEquals(client.toBlocking().retrieve(HttpRequest.GET("/"), String.class), "Micronaut - Java With Micronaut Data JDBC");
    }

}
