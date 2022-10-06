package com.anyject.basecamp

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BasecampApplication

fun main(args: Array<String>) {
	runApplication<BasecampApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
