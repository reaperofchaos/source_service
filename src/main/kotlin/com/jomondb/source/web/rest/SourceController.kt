package com.jomondb.source.web.rest

import com.jomondb.source.dataobject.SourceDTO
import com.jomondb.source.dataobject.SourceFileDTO
import com.jomondb.source.domain.AuthorsInSource
import com.jomondb.source.domain.SourceFiles
import com.jomondb.source.integration.rest.dataobject.DownloadFile
import com.jomondb.source.service.AuthorInSourceService
import com.jomondb.source.service.GSuiteService
import com.jomondb.source.service.SourceFilesService
import com.jomondb.source.service.SourceService
import com.jomondb.source.service.mappers.SourceFileMapper
import com.jomondb.source.service.mappers.SourceMapper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/g")
class SourceController(val sourceService: SourceService,
                       val authorInSourceService: AuthorInSourceService,
                       val sourceFilesService: SourceFilesService,
    val gSuiteService: GSuiteService){

    val mapper = SourceMapper()
    val sourceFileMapper = SourceFileMapper()

    @GetMapping("/")
    fun test(): String{
        return "test";
    }

    @GetMapping("/folders")
    fun getFolders(): List<DownloadFile> {
        return gSuiteService.getFolders();
    }

    @GetMapping("/{id}")
    fun getSourceById(@PathVariable id: Int): SourceDTO?{
        return sourceService.findSourceById(id)?.let { mapper.SourceToSourceDTO(it) } ?: throw
        ResponseStatusException(HttpStatus.NOT_FOUND, "This source does not exist")
    }

    @PostMapping("/")
    fun createSource(@RequestBody source: SourceDTO): ResponseEntity<SourceDTO> {
        val creationResponse = sourceService.createSource(mapper.SourceDTOToSource(source))
        val id = creationResponse.ID
        val authors = source.authors;

        //if authors exist add them to the authors in source table
        if(authors !== null) {
            for (author in authors) {
                val authorDTO: AuthorsInSource = AuthorsInSource(author.type, author.ID, id )

                authorInSourceService.createAuthorInSource(authorDTO);
            }
        }

        return ResponseEntity(mapper.SourceToSourceDTO(creationResponse), HttpStatus.OK)
    }

    @PostMapping("/file")
    fun addFileToSource(@RequestBody sourceFile: SourceFileDTO): ResponseEntity<SourceFileDTO> {
        println(sourceFile)
        val creationResponse = sourceFilesService.createNewSourceFile(sourceFileMapper.SourceFileDTOToSourceFile(sourceFile))

        return ResponseEntity(sourceFile, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteAuthor(@PathVariable id: Int): ResponseEntity<String>{
        return ResponseEntity(sourceService.deleteSource(id), HttpStatus.OK)
    }
}