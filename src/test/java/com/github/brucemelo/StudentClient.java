package com.github.brucemelo;

import com.github.brucemelo.domain.Student;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("/students")
public interface StudentClient {

    @Get
    List<Student> list();

    @Post
    void save(@Body Student student);

}
