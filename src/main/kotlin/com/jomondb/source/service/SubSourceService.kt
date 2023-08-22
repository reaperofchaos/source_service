package com.jomondb.source.service

import com.jomondb.source.domain.SubSources

interface SubSourceService{
    fun findSubSourceById(id: Int): SubSources?

    fun createSubSource(subSource: SubSources): String

    fun deleteSubSource(id: Int): String
}
