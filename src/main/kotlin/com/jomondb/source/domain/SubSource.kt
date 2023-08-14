package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class SubSources (
    @Id
    val ID: Int,
    val SubSrcType: String,
    val Title: String,
    val EnglishTitle: String?,
    val ChapterNo: Int?,
    val StartPage: Int?,
    val EndPage: Int?,
    val SrcID: Int
)