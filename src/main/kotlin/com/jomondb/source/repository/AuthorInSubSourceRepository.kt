package com.jomondb.source.repository

import com.jomondb.source.domain.AuthorsInSubSource
import org.springframework.data.repository.CrudRepository

interface AuthorInSubSourceRepository : CrudRepository<AuthorsInSubSource?, Int?> {
}