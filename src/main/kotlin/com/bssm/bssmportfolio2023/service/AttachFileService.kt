package com.bssm.bssmportfolio2023.service

import com.bssm.bssmportfolio2023.repository.AttachFileRepository
import com.bssm.bssmportfolio2023.service.dto.CreateAttachFileDto
import com.bssm.bssmportfolio2023.service.dto.toEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class AttachFileService (
    private val attachFileRepository: AttachFileRepository
){
    fun create(dto: CreateAttachFileDto): String {
        val attachFile = attachFileRepository.save(dto.toEntity())
        return attachFile.fileUid
    }
}
