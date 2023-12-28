package com.bssm.bssmportfolio2023.repository

import com.bssm.bssmportfolio2023.domain.Portfolio
import org.springframework.data.jpa.repository.JpaRepository

interface PortfolioRepository : JpaRepository<Portfolio,Long>{
}
