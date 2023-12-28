package com.bssm.bssmportfolio2023.service.dto

import com.bssm.bssmportfolio2023.domain.AttachFile
import com.bssm.bssmportfolio2023.domain.Member
import com.bssm.bssmportfolio2023.domain.Portfolio
import com.bssm.bssmportfolio2023.enums.PortfolioProtectType
import com.bssm.bssmportfolio2023.enums.PortfolioThemeType

data class CreatePortfolioDto(
    val title: String,
    val theme: PortfolioThemeType,
    val protectType: PortfolioProtectType,
    val description: String,
    val webUrl: String,
    var gitUrl: String,
    var memberId: Long,
    val videoFileUid: String,
    val thumnailFileUid: String,
)

fun CreatePortfolioDto.toEntity(
    member: Member,
    videoFile: AttachFile,
    thumbnailFile: AttachFile,
) = Portfolio(
        title = title,
        theme = theme,
        protectType = protectType,
        description = description,
        webUrl = webUrl,
        gitUrl = gitUrl,
        member = member,
        videoFile = videoFile,
        thumbnailFile = thumbnailFile
    )

