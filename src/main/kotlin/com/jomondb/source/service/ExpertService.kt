package com.jomondb.source.service

import com.jomondb.source.integration.rest.dataobject.ExpertDTO
import com.jomondb.source.integration.rest.feign.ExpertServiceFeign
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpertService{
    @Autowired
    private lateinit var expertServiceFeign: ExpertServiceFeign

    fun getAllExperts(): List<ExpertDTO>{
        return expertServiceFeign.getAllExperts();
    }


    fun createExpert(expert: ExpertDTO): ExpertDTO{
        return expertServiceFeign.createExpert(expert)
    }

    fun findExpertById(id: Int): ExpertDTO?{
        return expertServiceFeign.getExpertById(id)
    }
}