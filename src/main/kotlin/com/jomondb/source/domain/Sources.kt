package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Sources (
    @Id
    val ID: Int,
    val src_type: String,
    val Year: Int?,
    val Date: Date?,
    val Title: String,
    val english_title: String?,
    val Journal: String?,
    val Volume: String?,
    val Issue: String?,
    val Level: String?,
    val Publisher: String?,
    val Location: String?,
    val ConferenceID: Int?,
)
