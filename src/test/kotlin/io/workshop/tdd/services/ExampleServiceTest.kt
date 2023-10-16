package io.workshop.tdd.services

import io.workshop.tdd.repositories.ExampleRepository
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock

class ExampleServiceTest {
    
    @Mock
    private lateinit var exampleRepository: ExampleRepository
    
    private lateinit var exampleService: ExampleService
    
    @BeforeEach
    fun setup() {
        exampleService = ExampleService(exampleRepository)
    }
    
}