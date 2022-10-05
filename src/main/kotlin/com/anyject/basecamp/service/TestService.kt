package com.anyject.basecamp.service

import org.springframework.stereotype.Service

@Service("TestService")
class TestService {

    fun greet(): String {
        return "Hello World"
    }
}