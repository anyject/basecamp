package com.anyject.basecamp.controller

import com.anyject.basecamp.service.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
@RequestMapping("/")
class TestController {


    @Resource(name = "TestService")
    lateinit var testService : TestService

    @GetMapping("/test")
    fun a() : String {

        return testService.greet()
    }
}