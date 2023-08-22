package com.jomondb.source.service

import com.jomondb.source.domain.AuthorsInSubSource

interface AuthorInSubSourceService {
    fun createAuthorInSubSource(authorsInSubSource: AuthorsInSubSource): String;

    fun getAllAuthorsForSubSourceId(id: Int): List<AuthorsInSubSource>?
}