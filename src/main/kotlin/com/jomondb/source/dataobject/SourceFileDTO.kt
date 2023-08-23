package com.jomondb.source.dataobject

data class SourceFileDTO (
    val ID: Int,
    val SrcId: Int,
    val SrcType: String,
    val SrcLocation: String,
    val DriveId: String,
    val Website: String?,
    val DOI: String?,
        )