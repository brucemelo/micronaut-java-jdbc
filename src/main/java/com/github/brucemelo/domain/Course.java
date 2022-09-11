package com.github.brucemelo.domain;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;

import java.util.List;

@MappedEntity
public record Course(@Id @GeneratedValue @Nullable
                     Long id,
                     String name,
                     @Relation(value = Relation.Kind.MANY_TO_MANY, mappedBy = "courses")
                     List<Student> students) {
}
