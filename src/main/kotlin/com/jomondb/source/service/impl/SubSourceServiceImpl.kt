package com.jomondb.source.service.impl

import com.jomondb.source.domain.SubSources
import com.jomondb.source.repository.SubSourceRepository
import com.jomondb.source.service.SubSourceService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SubSourceServiceImpl(val subSourceRepository: SubSourceRepository): SubSourceService {
    override fun findSubSourceById( id: Int): SubSources?{
        return subSourceRepository.findByIdOrNull(id)
    }

    override fun createSubSource(subSource: SubSources): String {
        subSourceRepository.save(subSource)
        return "Sub Source ${subSource.Title} was successfully added."
    }

    override fun deleteSubSource(id: Int): String {
        subSourceRepository.deleteById(id)
        return "Successfully deleted the sub source with the id, ${id}";
    }
}