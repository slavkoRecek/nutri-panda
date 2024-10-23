package com.recek.nutri.panda.costumers

import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response

@Path("/api/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class CustomerResource(private val customerService: CostumerService) {

    @GET
    fun getAllCustomers(): List<CustomerEntity> {
        return customerService.getAll()
    }

    @POST
    fun createCustomer(customer: CustomerEntity): Response {
        val savedCustomer = customerService.create(customer)
        return Response.status(Response.Status.CREATED).entity(savedCustomer).build()
    }
}
