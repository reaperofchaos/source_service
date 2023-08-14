package com.jomondb.source.service

import com.jomondb.source.domain.Experts
import com.jomondb.source.repository.ExpertRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ExpertServiceImpl(private val expertRepository: ExpertRepository): ExpertService {
    override fun findExpertById( id: Int): Experts?{
        return expertRepository.findByIdOrNull(id)
    }
}