package com.example.mvc.controller.put

import com.example.mvc.model.http.Result
import com.example.mvc.model.http.UserRequest
import com.example.mvc.model.http.UserResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.validation.FieldError
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.StringBuilder
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class PutApiController {

    @PutMapping("/put-mapping")
    fun putMapping(): String{
        return "put-mapping"
    }

    @PutMapping(path = ["put-mapping/object"])
    fun putMappingObject(@Valid @RequestBody userRequest: UserRequest, bindingResult:BindingResult) : ResponseEntity<String>{
        if(bindingResult.hasErrors()){
            //500 error
                val msg = StringBuilder()
                bindingResult.allErrors.forEach{
                val field = it as FieldError
                val message = it.defaultMessage
                    msg.append(field.field + " : "+message+"\n")
            }
            return ResponseEntity.badRequest().body(msg.toString())
        }
        return ResponseEntity.ok("")
//
//        //response
//        return UserResponse().apply{
//
////            1. result
//            this.result = Result().apply{
//                this.resultCode = "OK"
//                this.resultMessage = "성공"
//                }
//            }.apply{
//                this.description = "description"
//        }.apply{
//            val userList = mutableListOf<UserRequest>()
//
//            userList.add(UserRequest().apply{
//                this.name = "a"
//                this.age = 10
//                this.email = "a@gmail"
//                this.address = "address"
//                this.phoneNumber = "010-3343-2342"
//
//            })
//            userList.add(UserRequest().apply{
//                this.name = "abf"
//                this.age = 105
//                this.email = "a@gmailasdf"
//                this.address = "addressasd"
//                this.phoneNumber = "010-3343-2342"
//
//            })
//
//            this.userRequest = userList
//        }

    }
}