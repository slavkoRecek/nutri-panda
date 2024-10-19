package com.recek.nutri.panda.tasks


import io.quarkus.hibernate.reactive.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheEntity
import jakarta.persistence.Entity

@Entity
class TaskEntity: PanacheEntity() {
    companion object: PanacheCompanion<TaskEntity> {
        fun byName(name: String) = list("name", name)
    }

    lateinit var name: String
    lateinit var description: String
}
