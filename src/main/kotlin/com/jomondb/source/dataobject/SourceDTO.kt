package com.jomondb.source.dataobject

import java.util.*
import kotlin.collections.ArrayList



data class SourceDTO (
    val ID: Int,
    val src_type: String,
    val authors: ArrayList<ExpertIDWithType>?,
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