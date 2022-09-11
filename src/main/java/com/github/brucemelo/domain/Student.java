package com.github.brucemelo.domain;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Relation;
import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.List;

@RecordBuilder
@MappedEntity
public record Student(@Id @GeneratedValue @Nullable
                      Long id,
                      String name,
                      @Relation(value = Relation.Kind.MANY_TO_MANY, cascade = Relation.Cascade.PERSIST)
                      List<Course> courses) {
}
