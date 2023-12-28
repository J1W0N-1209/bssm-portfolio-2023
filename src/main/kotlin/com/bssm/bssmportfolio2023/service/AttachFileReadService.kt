package com.bssm.bssmportfolio2023.service

import com.bssm.bssmportfolio2023.domain.AttachFile
import com.bssm.bssmportfolio2023.repository.AttachFileRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AttachFileReadService(
    private val attachFileRepository: AttachFileRepository,
) {
    fun findByFileUidOrThrow(fileUid: String) : AttachFile {
        return attachFileRepository.findByFileUid(fileUid)
            ?: throw IllegalArgumentException("존재하지 않는 파일")
    }
}
