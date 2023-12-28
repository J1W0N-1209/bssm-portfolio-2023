package com.bssm.bssmportfolio2023.service.dto

import com.bssm.bssmportfolio2023.domain.AttachFile

data class CreateAttachFileDto(
    val fileUid: String,
    val filePath: String,
    val fileName: String,
    val fileSize: Long,
)

fun CreateAttachFileDto.toEntity() = AttachFile(
    fileUid = fileUid,
    filePath = filePath,
    fileName = fileName,
    fileSize = fileSize,
)
