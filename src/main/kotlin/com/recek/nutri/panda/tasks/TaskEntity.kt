package com.recek.nutri.panda.tasks

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "tasks")
class TaskEntity: PanacheEntity() {
    companion object: PanacheCompanion<TaskEntity> {
        fun byName(name: String) = list("name", name)
    }

    lateinit var name: String
    lateinit var description: String
}
