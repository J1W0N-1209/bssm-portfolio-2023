package com.bssm.bssmportfolio2023.controller

import com.bssm.bssmportfolio2023.controller.rq.UploadAttachFileRq
import com.bssm.bssmportfolio2023.controller.rq.toDto
import com.bssm.bssmportfolio2023.global.ApiPath
import com.bssm.bssmportfolio2023.service.AttachFileService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AttachFileController (
    private val attachFileService: AttachFileService,
){
    @PostMapping(ApiPath.FILE_V1)
    fun uploadFile(@RequestBody rq: UploadAttachFileRq): String{
        return attachFileService.create(rq.toDto())
    }
}
