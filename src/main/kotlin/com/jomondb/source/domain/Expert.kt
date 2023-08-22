package com.jomondb.source.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Experts (
    @Id
    var ID: Int,
    val first_name: String,
    val middle_name: String?,
    val last_name: String?,
    val Suffix: String?
);