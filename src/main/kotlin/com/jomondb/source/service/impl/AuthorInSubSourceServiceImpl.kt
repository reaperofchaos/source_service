package com.jomondb.source.service.impl

import com.jomondb.source.domain.AuthorsInSubSource
import com.jomondb.source.repository.AuthorInSubSourceRepository
import com.jomondb.source.service.AuthorInSubSourceService
import org.springframework.stereotype.Service

@Service
class AuthorInSubSourceServiceImpl(val authorInSubSourceRepository: AuthorInSubSourceRepository): AuthorInSubSourceService {
    override fun createAuthorInSubSource(authorsInSubSource: AuthorsInSubSource): String{
        authorInSubSourceRepository.save(authorsInSubSource)
        return "Author have been successfully added."
    }

    override fun getAllAuthorsForSubSourceId(id: Int): List<AuthorsInSubSource>?{
        val ids = arrayListOf<Int>(id);

        return authorInSubSourceRepository.findAllById(ids) as List<AuthorsInSubSource>
    }

}