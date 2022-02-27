package com.example.mvc.controller.response

import com.example.mvc.model.http.UserRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/response")
class ResponseApiController {

    // 1. get 4XX
    //
    @GetMapping()
    fun getMapping(@RequestParam age : Int?) : ResponseEntity<String>{
//        // age == null -> 400 error
////        if(age==null){
////            return ResponseEntity.status(400).body("fail")
////        }
////
////        // age는 무조건 20살 이상. 아니면 -> 400 error
////        if(age<20){
////            return ResponseEntity.status(400).body("나이는 20살보다 커야 합니다.")
////        }
////
////        println(age)
////        return ResponseEntity.ok("OK")

        // 조금 더 코틀린스러운 코드로..

        return age?.let{
            if(it<20){
                return ResponseEntity.status(400).body("age 값은 20보다 커야합니다.")
            }

            ResponseEntity.ok("OK")
        }?: kotlin.run{
            return ResponseEntity.status(400).body("age값이 누락되었습니다.")
        }
    }

    // 2. post 200
    @PostMapping("")
    fun postMapping(@RequestBody userRequest : UserRequest?): ResponseEntity<Any>{
        return ResponseEntity.status(200).body(userRequest)
    }

    // 3. put 201
    @PutMapping("")
    fun putMapping(@RequestBody userRequest: UserRequest?): ResponseEntity<UserRequest> {
        return ResponseEntity.status(HttpStatus.CREATED).body(userRequest)
    }

    // 4. delete 500
    @DeleteMapping("/{id}")
    fun deleteMapping(@PathVariable id:Int): ResponseEntity<Any> {
        return ResponseEntity.status(500).body(null)
    }
}












