package com.jomondb.source.service

import com.jomondb.source.domain.Experts

interface ExpertService{
    fun getAllExperts(): List<Experts>

    fun createExpert(experts: Experts): Experts

    fun findExpertById(id: Int): Experts?
}