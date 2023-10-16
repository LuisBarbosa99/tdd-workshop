package io.workshop.tdd.models.entities

import io.workshop.tdd.models.forms.CreateExampleForm
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "example")
data class Example(
    @Id
    val id: Long? = 1,
    
    @Column
    val name: String
)