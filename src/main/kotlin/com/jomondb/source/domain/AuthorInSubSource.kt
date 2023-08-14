package com.jomondb.source.domain

import jakarta.persistence.Entity

data class AuthorsInSubSource (
    val ExpertID: Int,
    val SubSrcID: Int
)