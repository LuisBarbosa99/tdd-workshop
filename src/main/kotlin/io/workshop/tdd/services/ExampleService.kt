package io.workshop.tdd.services

import io.workshop.tdd.models.entities.Example
import io.workshop.tdd.models.forms.CreateExampleForm
import io.workshop.tdd.repositories.ExampleRepository
import org.springframework.stereotype.Service

@Service
class ExampleService(
    val exampleRepository: ExampleRepository
) {
    
    fun createExample(form: CreateExampleForm) {
        val entity = Example(name = form.name.plus(" ${form.lastName}"))
        
        this.exampleRepository.save(entity)
    }
}