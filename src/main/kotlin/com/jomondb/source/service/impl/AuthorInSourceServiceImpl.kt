package com.jomondb.source.service.impl

import com.jomondb.source.domain.AuthorsInSource
import com.jomondb.source.repository.AuthorInSourceRepository
import com.jomondb.source.service.AuthorInSourceService
import org.springframework.stereotype.Service

@Service
class AuthorInSourceServiceImpl(val authorInSourceRepository: AuthorInSourceRepository): AuthorInSourceService {
    override fun createAuthorInSource(authorsInSource: AuthorsInSource): String{
        authorInSourceRepository.save(authorsInSource)
        return "Author have been successfully added."
    }

    override fun getAuthorsFromSource(id: Int): List<AuthorsInSource>{
        val ids = arrayListOf<Int>(id);

        return authorInSourceRepository.findAllById(ids) as List<AuthorsInSource>
    }

}