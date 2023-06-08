package com.test.testspring.`code-test`

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Base64

@RestController
@RequestMapping("/code-test")
class CodeTestController {

    @GetMapping
    fun getCodeTest(): String {
        return "Hello"
    }

    @PostMapping("/decode")
    fun decodeBase64(@RequestBody base64encoded: String): String {
        // new character is not
        val formattedContent = base64encoded.replace("\\n", "")
        val decodedParam = Base64.getDecoder().decode(formattedContent)
        return decodedParam.decodeToString()
    }
}