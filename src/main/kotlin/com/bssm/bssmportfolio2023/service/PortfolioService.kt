package com.bssm.bssmportfolio2023.service

import com.bssm.bssmportfolio2023.repository.PortfolioRepository
import com.bssm.bssmportfolio2023.service.dto.CreatePortfolioDto
import com.bssm.bssmportfolio2023.service.dto.toEntity
import org.springframework.stereotype.Service

@Service
class PortfolioService (
    private val portfolioRepository: PortfolioRepository,
    private val attachFileReadService: AttachFileReadService,
    private val memberReadService: MemberReadService,
){
    fun create(dto: CreatePortfolioDto): Long {
        val member = memberReadService.findByIdOrThrow(dto.memberId)
        val videoFile = attachFileReadService.findByFileUidOrThrow(dto.videoFileUid)
        val thumbnailFile = attachFileReadService.findByFileUidOrThrow(dto.thumnailFileUid)
        return portfolioRepository.save(dto.toEntity(member,videoFile,thumbnailFile)).id
    }
}
