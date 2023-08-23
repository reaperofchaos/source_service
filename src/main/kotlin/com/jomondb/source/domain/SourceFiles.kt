package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class SourceFiles (
    @Id
    val ID: Int,
    val SrcId: Int,
    val SrcType: String,
    val SrcLocation: String,
    val DriveId: String,
    val Website: String?,
    val DOI: String?,
)