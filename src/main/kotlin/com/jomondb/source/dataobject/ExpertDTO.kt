package com.jomondb.source.dataobject

import jakarta.persistence.Id

data class ExpertDTO (
    val ID: Int,
    val FirstName: String,
    val MiddleName: String,
    val LastName: String,
    val Suffix: String
);