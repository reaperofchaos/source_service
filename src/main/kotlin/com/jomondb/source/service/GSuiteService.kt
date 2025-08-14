package com.jomondb.source.service

import com.jomondb.source.integration.rest.dataobject.DownloadFile
import com.jomondb.source.integration.rest.feign.GSuiteFeign
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class GSuiteService {
    @Autowired
    private lateinit var gSuiteFeign: GSuiteFeign;

    fun uploadFile(file: MultipartFile, folderId: String?): String{
        val response = gSuiteFeign.uploadFile(file, folderId)
        return response.body ?: throw RuntimeException("Upload failed - no response body")
    }

    fun downloadFile(id: String): ByteArray{
        val response = gSuiteFeign.download(id);
        return response.body ?: throw RuntimeException("Download failed - no response body")
    }

    fun getFileInfo(name: String): List<DownloadFile>{
        return gSuiteFeign.getInfoByName(name);
    }

    fun getFolderInfo(folderName: String, parentId: String): List<DownloadFile>{
        return gSuiteFeign.getFolderInfo(folderName, parentId);
    }

    fun getFolders(): List<DownloadFile>{
        return gSuiteFeign.getFolders();
    }

    fun createFolder(folderName: String, parentId: String): String{
        return gSuiteFeign.createFolder(folderName, parentId).body ?: throw RuntimeException("Create folder failed - no response body")
    }

    fun getFilesInFolder(folderId: String):List<DownloadFile>{
        return gSuiteFeign.getFilesInFolder(folderId)
    }
}