package com.github.brucemelo;

import com.github.brucemelo.domain.StudentBuilder;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@MicronautTest
class StudentControllerTest {

    @Inject
    @Client("/students")
    StudentClient client;

    @Test
    @DisplayName("Should save students")
    void testSave() {
        Assertions.assertTrue(client.list().isEmpty());
        client.save(StudentBuilder.builder().name("Bruce Melo").build());
        Assertions.assertFalse(client.list().isEmpty());
    }

}
