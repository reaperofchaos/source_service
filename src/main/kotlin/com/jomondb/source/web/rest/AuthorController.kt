package com.jomondb.source.web.rest

import com.jomondb.source.dataobject.ExpertDTO
import com.jomondb.source.service.ExpertService
import com.jomondb.source.service.mappers.ExpertMapper
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/author")
class AuthorController(val expertService: ExpertService) {
    val mapper = ExpertMapper()

    @GetMapping("/")
    fun test(): String{
        return "test";
    }

    @GetMapping("/{id}")
    fun getExpertById(@PathVariable id: Int): ExpertDTO?{
        return expertService.findExpertById(id)?.let { mapper.ExpertToExpertDTO(it) } ?: throw
        ResponseStatusException(HttpStatus.NOT_FOUND, "This source does not exist")
    }
}