package test.task.server.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import test.task.server.model.TestModel

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)

    val test = TestModel()
}

