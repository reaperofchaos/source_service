package com.jomondb.source.web.rest

import com.jomondb.source.dataobject.ExpertDTO
import com.jomondb.source.dataobject.SourceFileDTO
import com.jomondb.source.domain.Experts
import com.jomondb.source.service.ExpertService
import com.jomondb.source.service.mappers.ExpertMapper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/author")
class AuthorController(val expertService: ExpertService) {
    val mapper = ExpertMapper()

    @GetMapping("/")
    fun getAllExperts(): List<ExpertDTO>{
        return mapper.listExpertToListExpertDTO(expertService.getAllExperts())
    }

    @GetMapping("/{id}")
    fun getExpertById(@PathVariable id: Int): ExpertDTO?{
        return expertService.findExpertById(id)?.let { mapper.ExpertToExpertDTO(it) } ?: throw
        ResponseStatusException(HttpStatus.NOT_FOUND, "This source does not exist")
    }

    @PostMapping("/")
    fun createExpert(@RequestBody expert: ExpertDTO): ExpertDTO {
        val result = expertService.createExpert(mapper.ExpertDTOToExpert(expert))
        println("result $result");

        return mapper.ExpertToExpertDTO(result)
    }

}