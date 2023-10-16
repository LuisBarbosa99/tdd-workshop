package io.workshop.tdd.controllers

import io.workshop.tdd.models.forms.CreateExampleForm
import io.workshop.tdd.services.ExampleService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/example")
class ExampleController(
    val exampleService: ExampleService
){
    
    @PostMapping
    fun createPostExample(@RequestBody form: CreateExampleForm) =
        this.exampleService.createExample(form)
    
    
}