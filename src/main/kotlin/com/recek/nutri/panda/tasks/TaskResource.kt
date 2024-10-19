package com.recek.nutri.panda.tasks

import io.smallrye.mutiny.coroutines.awaitSuspending
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/tasks")
class TaskResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun getTasks(): List<TaskEntity> {
    return emptyList()
    return TaskEntity.listAll().awaitSuspending()
    }
}


data class Task(val name: String, val description: String)
