package com.github.brucemelo.domain;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@JdbcRepository(dialect = Dialect.H2)
public interface StudentRepository extends CrudRepository<Student, Long> {
    Optional<Student> findByName(String name);

    @Override
    List<Student> findAll();
}
