package com.jomondb.source.dataobject

import java.util.*

data class SourceDTO (
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