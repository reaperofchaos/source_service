package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import java.io.Serializable


class AuthorsInSourceCompositeKey(
    var AuthorType: String = "",
    var ExpertID: Int = 0,
    var SrcID: Int = 0,
    ) : Serializable


@Entity
@IdClass( AuthorsInSourceCompositeKey::class)
data class AuthorsInSource(
    @Id val AuthorType: String,
    @Id val ExpertID: Int,
    @Id val SrcID: Int
    )