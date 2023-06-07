package com.test.testspring.`code-test`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/code-test")
class CodeTestController {

    @GetMapping
    fun getCodeTest(): String {
        return "Hello"
    }
}