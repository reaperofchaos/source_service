package com.jomondb.source.repository

import com.jomondb.source.domain.Sources
import org.springframework.data.repository.CrudRepository


interface SourceRepository : CrudRepository<Sources?, Int?>{

}