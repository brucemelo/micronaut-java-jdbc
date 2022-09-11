package com.github.brucemelo.service;

import com.github.brucemelo.domain.Student;
import com.github.brucemelo.domain.StudentRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public record StudentService(@Inject StudentRepository studentRepository) {
    public void save(Student student) {
        studentRepository.save(student);
    }
}
