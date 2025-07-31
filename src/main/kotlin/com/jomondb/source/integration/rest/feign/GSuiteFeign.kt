package com.jomondb.source.integration.rest.feign

import com.jomondb.source.integration.rest.dataobject.DownloadFile
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "gsuite", url="\${gateway.hostname}/" + "gsuite/")
public interface GSuiteFeign {
    @GetMapping("/folders", produces = ["application/json"])
    fun getFolders(): List<DownloadFile>

}