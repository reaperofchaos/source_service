package com.jomondb.source.integration.rest.dataobject

data class ExpertDTO (
    val ID: Int,
    val FirstName: String,
    val MiddleName: String?,
    val LastName: String?,
    val Suffix: String?
)