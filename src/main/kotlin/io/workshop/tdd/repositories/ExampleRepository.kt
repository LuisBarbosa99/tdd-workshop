package io.workshop.tdd.repositories

import io.workshop.tdd.models.entities.Example
import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository: JpaRepository<Example, Long>