package com.jomondb.source.service.impl

import com.jomondb.source.domain.Sources
import com.jomondb.source.repository.SourceRepository
import com.jomondb.source.service.SourceService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SourceServiceImpl(val sourceRepository: SourceRepository): SourceService {
    override fun findSourceById( id: Int): Sources?{
        return sourceRepository.findByIdOrNull(id)
    }

    override fun createSource(source: Sources): Sources {
        return sourceRepository.save(source)
    }

    override fun deleteSource(id: Int): String {
        sourceRepository.deleteById(id)
        return "Successfully deleted the author with the id, ${id}";
    }
}