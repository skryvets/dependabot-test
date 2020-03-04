package com.skryvets.dependabottest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DependabotTestApplication

fun main(args: Array<String>) {
	runApplication<DependabotTestApplication>(*args)
}
