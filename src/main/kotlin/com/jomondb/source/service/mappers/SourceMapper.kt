package com.jomondb.source.service.mappers

import com.jomondb.source.dataobject.SourceDTO
import com.jomondb.source.domain.Sources
import java.util.*

class SourceMapper {
    fun Sources.toSourceDTO() = SourceDTO(
        ID = ID,
        src_type = src_type,
        Year = Year,
        Date = Date,
        Title = Title,
        english_title = english_title,
        Journal = Journal,
        Volume = Volume,
        Issue = Issue,
        Level = Level,
        Publisher = Publisher,
        Location = Location,
        ConferenceID = ConferenceID)

    fun SourceToSourceDTO(source: Sources): SourceDTO{
        return source.toSourceDTO()
    }

    fun listSourceToListSourceDTO(sourceList: List<Sources>): List<SourceDTO>{
        var dtoList = mutableListOf<SourceDTO>()
        sourceList.forEach{it->dtoList.add(it.toSourceDTO())}
        return dtoList;
    }

    fun SourceDTO.toSource() = Sources(
        ID = ID,
        src_type = src_type,
        Year = Year,
        Date = Date,
        Title = Title,
        english_title = english_title,
        Journal = Journal,
        Volume = Volume,
        Issue = Issue,
        Level = Level,
        Publisher = Publisher,
        Location = Location,
        ConferenceID = ConferenceID)


    fun SourceDTOToSource(sourceDTO: SourceDTO): Sources{
        return sourceDTO.toSource()
    }

    fun listSourceDTOToSourceList(sourceDTOList: List<SourceDTO>): List<Sources>{
        var sourceList = mutableListOf<Sources>()
        sourceDTOList.forEach{it->sourceList.add(it.toSource())}
        return sourceList;
    }

}