package com.jomondb.source.service

import com.jomondb.source.domain.Sources
import com.jomondb.source.repository.SourceRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class SourceServiceImpl(val sourceRepository: SourceRepository): SourceService {
    override fun findSourceById( id: Int): Sources?{
        return sourceRepository.findByIdOrNull(id)
    }
}