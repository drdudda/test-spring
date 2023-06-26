package com.test.testspring.codetest

import org.springframework.stereotype.Service

@Service
class CodeTestService {
    fun hello(): String {
        return "hi"
    }
}