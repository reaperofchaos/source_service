package com.jomondb.source.service

import com.jomondb.source.domain.Experts

interface ExpertService{
    fun findExpertById(id: Int): Experts?
}