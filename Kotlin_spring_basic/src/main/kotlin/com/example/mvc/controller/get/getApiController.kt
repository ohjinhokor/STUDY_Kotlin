package com.example.mvc.controller.get

import com.example.mvc.model.http.UserRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class getApiController {

    @GetMapping(path =["/hello", "/abcd"])
    fun hello() : String {
        return "hello kotlin";
    }

    @RequestMapping(method = [RequestMethod.GET], path = ["request-mapping"])
    fun requestMapping() : String{
        return "request-mapping";
    }

    @GetMapping("get-mapping/path-variable/{name}")
    fun pathVariable(@PathVariable name : String): String{
        println(name);
        return name;
    }

    @GetMapping("/get-mapping/query-param")
    fun queryParam(
        @RequestParam name : String,
        @RequestParam(value = "age") age : Int
    ) : String{
        println("${name} , ${age}")
        return name + " " + age
    }

    @GetMapping("/get-mapping/query-param/object")
    fun queryParamObject(userRequest: UserRequest) : UserRequest{
        println(userRequest)
        return userRequest
    }
    // object는 json형태로 반환함

    @GetMapping("/get-mapping/query-param/map")
    fun queryParamMap(@RequestParam map: Map<String, Any>): Map<String, Any>{
        println(map)
        return map
    }

}

//restcontroller, requestmapping
