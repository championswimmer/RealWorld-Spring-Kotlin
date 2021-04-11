package tech.arnav.conduit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConduitApplication

fun main(args: Array<String>) {
    runApplication<ConduitApplication>(*args)
}
