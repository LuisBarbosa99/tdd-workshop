package io.workshop.tdd.controllers

import io.workshop.tdd.services.ExampleService
import org.mockito.Mock

class ExampleControllerTest {
    
    @Mock
    lateinit var exampleService: ExampleService
    
    lateinit var exampleController: ExampleController
    
    fun setup() {
        exampleController = ExampleController(exampleService)
    }
}