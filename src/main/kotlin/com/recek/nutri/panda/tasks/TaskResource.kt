package com.recek.nutri.panda.tasks

import kotlinx.serialization.Serializable
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/tasks")
class TaskResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getTasks(): List<Task> {
        return loadTasks()
    }

    fun loadTasks(): List<Task> {
        return TaskEntity.listAll().map {
            Task(
                name = it.name,
                description = it.description
            )
        }
    }
}


@Serializable
data class Task(val name: String, val description: String)
