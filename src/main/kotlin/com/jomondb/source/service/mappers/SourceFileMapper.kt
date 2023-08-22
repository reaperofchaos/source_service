package com.jomondb.source.service.mappers

import com.jomondb.source.dataobject.SourceFileDTO
import com.jomondb.source.domain.SourceFiles

class SourceFileMapper {
    fun SourceFiles.toSourceFileDTO() = SourceFileDTO(
        ID = ID,
        SrcId = SrcId,
        SrcType = SrcType,
        SrcLocation = SrcLocation,
        driveId = driveId,
        Website = Website,
        DOI = DOI
    )

    fun SourceFileToSourceFileDTO(sourceFile: SourceFiles): SourceFileDTO {
        return sourceFile.toSourceFileDTO()
    }

    fun listSourceFileToListSourceFileDTO(sourceList: List<SourceFiles>): List<SourceFileDTO>{
        var dtoList = mutableListOf<SourceFileDTO>()
        sourceList.forEach{it->dtoList.add(it.toSourceFileDTO())}
        return dtoList;
    }

    fun SourceFileDTO.toSourceFile() = SourceFiles(
        ID = ID,
        SrcId = SrcId,
        SrcType = SrcType,
        SrcLocation = SrcLocation,
        driveId = driveId,
        Website = Website,
        DOI = DOI
    )

    fun SourceFileDTOToSourceFile(sourceFileDTO: SourceFileDTO): SourceFiles {
        return sourceFileDTO.toSourceFile()
    }

    fun listSourceFileDTOToListSourceFile(sourceList: List<SourceFileDTO>): List<SourceFiles>{
        var dtoList = mutableListOf<SourceFiles>()
        sourceList.forEach{it->dtoList.add(it.toSourceFile())}
        return dtoList;
    }


}