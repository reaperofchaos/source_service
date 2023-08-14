package com.jomondb.source.repository

import com.jomondb.source.domain.Experts
import org.springframework.data.repository.CrudRepository

interface ExpertRepository : CrudRepository<Experts?, Int?> {
}