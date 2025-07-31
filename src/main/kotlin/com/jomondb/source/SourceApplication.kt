package com.jomondb.source

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class SourceApplication

fun main(args: Array<String>) {
	runApplication<SourceApplication>(*args)
}
