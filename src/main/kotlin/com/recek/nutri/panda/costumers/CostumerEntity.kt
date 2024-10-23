package com.recek.nutri.panda.costumers

import com.recek.nutri.panda.tasks.TaskEntity
import com.recek.nutri.panda.tasks.TaskEntity.Companion.list
import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table


@Entity
@Table(name = "customers")
class CustomerEntity : PanacheEntity {
    companion object: PanacheCompanion<CustomerEntity> {
    }

    @Column(nullable = false)
    var name: String? = null

    @Column(nullable = false, unique = true)
    var email: String? = null

    constructor()

    constructor(id: Long?, name: String?, email: String?) {
        this.id = id
        this.name = name
        this.email = email
    }
}

