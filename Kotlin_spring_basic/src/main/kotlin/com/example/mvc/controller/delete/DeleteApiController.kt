package com.example.mvc.controller.delete

import com.example.mvc.model.http.ErrorResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.ConstraintViolationException
import javax.validation.constraints.NotNull
import javax.validation.constraints.Min
import javax.validation.constraints.Size
import kotlin.math.min

@RestController
@RequestMapping("/api")
@Validated
class DeleteApiController {

    @DeleteMapping("/delete-mapping")
    fun deleteMapping(
       @RequestParam name : String,
       @NotNull(message = " age값이 누락되었습니다")
       @Min(value=20, message = "age는 20보다 커야합니다.")
       @RequestParam age : Int
    ): String{
        println(name)
        println(age)
        return name + " " + age
    }

    @DeleteMapping(path= ["/delete-mapping/name/{name}/age/{age}"])
    fun deleteMappingPath(
        @PathVariable(value="name")
        @Size(min =2, max=5)
        @NotNull
        name:String,

        @NotNull(message = "age 값이 누락되었습니다.")
        @Min(value=20, message = "age는 20보다 커야합니다.")
        @PathVariable(name="age")
        age:Int
    ):String{
        println(name)
        println(age)
        return name+ " " + age
    }
}