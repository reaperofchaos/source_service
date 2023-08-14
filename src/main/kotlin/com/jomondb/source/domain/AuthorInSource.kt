package com.jomondb.source.domain

import jakarta.persistence.Entity

data class AuthorsInSource (
    val AuthorType: String,
    val ExpertID: Int,
    val SrcID: Int,
)