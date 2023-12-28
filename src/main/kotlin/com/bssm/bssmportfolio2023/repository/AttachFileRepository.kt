package com.bssm.bssmportfolio2023.repository

import com.bssm.bssmportfolio2023.domain.AttachFile
import org.springframework.data.jpa.repository.JpaRepository

interface AttachFileRepository : JpaRepository<AttachFile,Long>{
    fun findByFileUid(fildUid: String): AttachFile?
}
