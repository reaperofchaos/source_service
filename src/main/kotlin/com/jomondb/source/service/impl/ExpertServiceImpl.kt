package com.jomondb.source.service.impl

import com.jomondb.source.domain.Experts
import com.jomondb.source.repository.ExpertRepository
import com.jomondb.source.service.ExpertService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ExpertServiceImpl(private val expertRepository: ExpertRepository): ExpertService {
    override fun getAllExperts(): List<Experts> {
        return expertRepository.findAll() as List<Experts>
    }
    override fun findExpertById( id: Int): Experts?{
        return expertRepository.findByIdOrNull(id)
    }
}