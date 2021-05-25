package me.codeislet.example.bucket4jexample

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


/**
 * @author Code Islet
 * @since 0.1.0
 */
@RestController
@RequestMapping("/greet")
class GreetController {

    @GetMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    fun greet(): String {
        return "welcome to the jungle!"
    }
}