package com.jomondb.source.integration.rest.feign

import com.jomondb.source.integration.rest.dataobject.ExpertDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(value = "expert", url="\${gateway.hostname}/" + "expert/")
public interface ExpertServiceFeign {
    @PostMapping("/author/", produces = ["application/json"])
    fun createExpert(@RequestBody expert: ExpertDTO): ExpertDTO

    @GetMapping("/author/")
    fun getAllExperts(): List<ExpertDTO>

    @GetMapping("/author/{id}")
    fun getExpertById(@PathVariable id: Int): ExpertDTO?


}