package com.jomondb.source.service.impl

import com.jomondb.source.domain.AuthorsInSubSource
import com.jomondb.source.domain.SourceFiles
import com.jomondb.source.repository.SourceFilesRepository
import com.jomondb.source.service.SourceFilesService
import org.springframework.stereotype.Service

@Service
class SourceFilesServiceImpl(val sourceFilesRepository: SourceFilesRepository):
    SourceFilesService {
    override fun createNewSourceFile(sourceFile: SourceFiles): String{
        sourceFilesRepository.save(sourceFile)
        return "The file have been successfully attached to the source."
    }

    override fun getSourceFilesForSource(id: Int): List<SourceFiles>{
        val ids = arrayListOf<Int>(id);

        return sourceFilesRepository.findAllById(ids) as List<SourceFiles>
    }

}