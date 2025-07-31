package com.jomondb.source.service

import com.jomondb.source.integration.rest.dataobject.DownloadFile
import com.jomondb.source.integration.rest.feign.GSuiteFeign
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GSuiteService {
    @Autowired
    private lateinit var gSuiteFeign: GSuiteFeign;

    fun getFolders(): List<DownloadFile>{
        return gSuiteFeign.getFolders();
    }
}