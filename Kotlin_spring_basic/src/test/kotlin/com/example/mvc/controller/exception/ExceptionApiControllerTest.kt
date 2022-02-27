package com.example.mvc.controller.exception

import com.example.mvc.model.http.UserRequest
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.util.LinkedMultiValueMap

@WebMvcTest
@AutoConfigureMockMvc
class ExceptionApiControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun helloTest(){
        mockMvc.perform(
            MockMvcRequestBuilders.get("/api/exception/hello")
        ).andExpect(
            MockMvcResultMatchers.status().isOk
        ).andExpect(
            MockMvcResultMatchers.content().string("hello")
        ).andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun getTest(){
        val queryParams = LinkedMultiValueMap<String, String>()
        queryParams.add("name","steve")
        queryParams.add("age","20")

        mockMvc.perform(
            MockMvcRequestBuilders.get("/api/exception")
                .queryParams(queryParams)
        ).andExpect(
            MockMvcResultMatchers.status().isOk
        ).andExpect(
            MockMvcResultMatchers.content().string("steve 20")
        ).andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun getFailTest(){
        val queryParams = LinkedMultiValueMap<String, String>()
        queryParams.add("name","steve")
        queryParams.add("age","9")

        mockMvc.perform(
            MockMvcRequestBuilders.get("/api/exception")
                .queryParams(queryParams)
        ).andExpect(
            MockMvcResultMatchers.status().isBadRequest
        ).andExpect(
            MockMvcResultMatchers.content().contentType("application/json")
        ).andExpect(
            MockMvcResultMatchers.jsonPath("\$.result_code").value("FAIL")
        ).andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun postTest(){

        val userRequest = UserRequest().apply{
            this.name = "steve"
            this.age = 10
            this.phoneNumber = "010-1234-1234"
            this.address = "경기도 성남시"
            this.email = "steve@gmail.com"
            this.createdAt = "2020-10-02 13:00:00"
        }

        val json = jacksonObjectMapper().writeValueAsString(userRequest)
        println(json)

        mockMvc.perform(
            MockMvcRequestBuilders.post("/api/exception")
                .content(json)
                .contentType("application/json")
                .accept("application/json")
        ).andExpect(
            MockMvcResultMatchers.status().isOk
        ).andExpect(
            MockMvcResultMatchers.jsonPath("\$.name").value("steve")
        ).andExpect(
            MockMvcResultMatchers.jsonPath("\$.age").value(10)
        ).andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun postFailTest(){

        val userRequest = UserRequest().apply{
            this.name = "steve"
            this.age = -1
            this.phoneNumber = "010-1234-1234"
            this.address = "경기도 성남시"
            this.email = "steve@gmail.com"
            this.createdAt = "2020-10-02 13:00:00"
        }

        val json = jacksonObjectMapper().writeValueAsString(userRequest)
        println(json)

        mockMvc.perform(
            MockMvcRequestBuilders.post("/api/exception")
                .content(json)
                .contentType("application/json")
                .accept("application/json")
        ).andExpect(
            MockMvcResultMatchers.status().`is`(400)
        ).andDo(MockMvcResultHandlers.print())
    }
}