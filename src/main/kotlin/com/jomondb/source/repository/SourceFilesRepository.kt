package com.jomondb.source.repository

import com.jomondb.source.domain.SourceFiles
import org.springframework.data.repository.CrudRepository

interface SourceFilesRepository : CrudRepository<SourceFiles?, Int?> {
}