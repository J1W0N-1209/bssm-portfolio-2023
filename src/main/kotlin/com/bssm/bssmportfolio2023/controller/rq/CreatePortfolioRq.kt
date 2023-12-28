package com.bssm.bssmportfolio2023.controller.rq

import com.bssm.bssmportfolio2023.enums.PortfolioProtectType
import com.bssm.bssmportfolio2023.enums.PortfolioThemeType

data class CreatePortfolioRq(
    val title: String,
    val theme: PortfolioThemeType,
    val protectType: PortfolioProtectType,
    var description: String,
    var webUrl: String,
    val gitUrl: String,
    val member: Long,
    val videoFile: String,
    val thumbnailFile: String,
)
