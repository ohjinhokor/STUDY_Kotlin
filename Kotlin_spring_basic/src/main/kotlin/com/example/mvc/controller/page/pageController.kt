package com.example.mvc.controller.page

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class pageController {

    @GetMapping("/main")
    fun main(): String{
        println("init main")
        return "main.html"
    }
}