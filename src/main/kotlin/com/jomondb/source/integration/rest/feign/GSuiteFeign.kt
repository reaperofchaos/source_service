package com.jomondb.source.integration.rest.feign

import com.jomondb.source.integration.rest.dataobject.DownloadFile
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile

@FeignClient(value = "gsuite", url="\${gateway.hostname}/" + "gsuite/")
public interface GSuiteFeign {
    @PostMapping("/file/upload", produces = ["application/json"])
    fun uploadFile(@RequestParam("file") file: MultipartFile,
                   @RequestParam("folderId") folderId: String?
    ): ResponseEntity<String>

    @GetMapping("/file/{id}")
    fun download(@PathVariable id: String): ResponseEntity<ByteArray>

    @GetMapping("/file/info/{name}")
    fun getInfoByName(@PathVariable name: String): List<DownloadFile>

    @GetMapping("/folder/info")
    fun getFolderInfo(
        @RequestParam("folderName") folderName: String,
        @RequestParam("parentId") parentId: String
    ): List<DownloadFile>

    @GetMapping("/folder/folders", produces = ["application/json"])
    fun getFolders(): List<DownloadFile>

    @PostMapping("/folder/create")
    fun createFolder(
        @RequestParam("folderName") folderName: String,
        @RequestParam("parentId") parentId: String): ResponseEntity<String>

    @GetMapping("/folder/files/{folderId}")
    fun getFilesInFolder(@PathVariable folderId: String): List<DownloadFile>
}