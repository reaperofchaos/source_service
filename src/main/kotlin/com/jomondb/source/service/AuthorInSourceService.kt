package com.jomondb.source.service

import com.jomondb.source.domain.AuthorsInSource
import com.jomondb.source.domain.SourceFiles

interface AuthorInSourceService {
    fun createAuthorInSource(authorsInSource: AuthorsInSource): String

    fun getAuthorsFromSource(id: Int): List<AuthorsInSource>?
}

