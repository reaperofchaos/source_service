package com.jomondb.source.repository

import com.jomondb.source.domain.AuthorsInSource
import org.springframework.data.repository.CrudRepository

interface AuthorInSourceRepository : CrudRepository<AuthorsInSource?, Int?> {
}