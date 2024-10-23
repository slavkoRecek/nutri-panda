package com.recek.nutri.panda.costumers

import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
class CostumerService {

    fun getAll(): List<CustomerEntity> {
        return CustomerEntity.findAll().list()
    }

    @Transactional
    fun create(c: CustomerEntity): CustomerEntity {
        c.persist()
        return c
    }
}
