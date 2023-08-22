package com.jomondb.source.service

import com.jomondb.source.domain.SourceFiles

interface SourceFilesService {
    fun createNewSourceFile(sourceFile: SourceFiles): String;

    fun getSourceFilesForSource(id: Int): List<SourceFiles>
}
