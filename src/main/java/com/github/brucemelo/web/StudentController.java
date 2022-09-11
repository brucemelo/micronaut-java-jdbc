package com.github.brucemelo.web;

import com.github.brucemelo.domain.Student;
import com.github.brucemelo.domain.StudentBuilder;
import com.github.brucemelo.service.StudentService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/students")
public record StudentController(@Inject StudentService studentService) {

    @Post
    public HttpResponse<Student> save(@Body Student student) {
        studentService.save(student);
        return HttpResponse.created(student);
    }

    @Get
    public HttpResponse<List<Student>> list() {
        return HttpResponse.ok(studentService.studentRepository().findAll());
    }

}
