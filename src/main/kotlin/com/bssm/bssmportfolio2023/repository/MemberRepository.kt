package com.bssm.bssmportfolio2023.repository

import com.bssm.bssmportfolio2023.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}
