package com.jomondb.source.web.rest

import com.jomondb.source.dataobject.SourceDTO
import com.jomondb.source.service.SourceService
import com.jomondb.source.service.mappers.SourceMapper
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/source")
class SourceController(val sourceService: SourceService) {
    val mapper = SourceMapper()

    @GetMapping("/")
    fun test(): String{
        return "test";
    }
    @GetMapping("/{id}")
    fun getSourceById(@PathVariable id: Int): SourceDTO?{
        return sourceService.findSourceById(id)?.let { mapper.SourceToSourceDTO(it) } ?: throw
        ResponseStatusException(HttpStatus.NOT_FOUND, "This source does not exist")
    }
}