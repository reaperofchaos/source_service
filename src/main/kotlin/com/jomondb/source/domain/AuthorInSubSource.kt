package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import java.io.Serializable


class AuthorsInSubSourceCompositeKey(
    var ExpertID: Int = 0,
    var SubSrcID: Int = 0,
) : Serializable

@Entity
@IdClass(AuthorsInSubSourceCompositeKey::class)
data class AuthorsInSubSource (
    @Id
    val ExpertID: Int,
    @Id
    val SubSrcID: Int
)