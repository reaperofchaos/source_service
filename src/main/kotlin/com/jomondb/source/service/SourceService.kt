package com.jomondb.source.service

import com.jomondb.source.domain.Sources

interface SourceService{
    fun findSourceById(id: Int): Sources?
}