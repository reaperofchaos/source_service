package com.jomondb.source.repository

import com.jomondb.source.domain.SubSources
import org.springframework.data.repository.CrudRepository

interface SubSourceRepository : CrudRepository<SubSources?, Int?> {
}