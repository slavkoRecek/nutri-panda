package com.recek.nutri.panda.costumers

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.common.mapper.TypeRef
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.Matchers.notNullValue
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

@QuarkusTest
class CustomerResourceTest {

    @Test
    fun shouldGetAllCustomers() {
        val customers: List<CustomerEntity> = given().`when`()
            .get("/api/customers")
            .then()
            .statusCode(200)
            .extract()
            .`as`(object : TypeRef<List<CustomerEntity>>() {})
        assertTrue(customers.size > 1)
    }

    @Test
    fun shouldCreateCustomerSuccessfully() {
        val customer = CustomerEntity(null, "John", "john@gmail.com")
        given().contentType(ContentType.JSON)
            .body(customer)
            .`when`()
            .post("/api/customers")
            .then()
            .statusCode(201)
            .body("id", notNullValue())
            .body("name", `is`("John"))
            .body("email", `is`("john@gmail.com"))
    }
}
