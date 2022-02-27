package com.example.mvc.model.http

import com.example.mvc.annotation.StringFormatDateTime
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.validation.constraints.*

data class UserRequest (

    @field:NotEmpty
    @field:Size(min=2, max=8)
    var name : String? = null,

    @field:PositiveOrZero
    var age : Int? = null,

    @field:Email
    var email : String? = null,

    @field:NotBlank
    var address : String? = null,

    @field:Pattern(regexp="^\\d{2,3}-\\d{3,4}-\\d{4}\$") // 정규표현식
    var phoneNumber:String?=null,

    @field:StringFormatDateTime(pattern = "yyyy-MM-dd HH:mm:ss", message="패턴이 올바르지 않습니다. ")
    var createdAt : String?=null
){
//    @AssertTrue(message = "생성일자의 패턴은 yyyy-MM-dd HH:mm:ss여야 합니다")
//    private fun isValidCreatedAt():Boolean{
//
//        return try{
//            LocalDateTime.parse(this.createdAt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
//            true
//        }catch (e: Exception){
//            false
//        }
//    }
}

// data class, ?의 의미, var의 디폴트트