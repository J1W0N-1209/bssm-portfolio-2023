package com.bssm.bssmportfolio2023.service

import com.bssm.bssmportfolio2023.domain.Member
import com.bssm.bssmportfolio2023.repository.MemberRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberReadService (
    private val memberRepository: MemberRepository
){
    fun findByIdOrThrow(id: Long): Member {
        return memberRepository.findByIdOrNull(id)
            ?: throw IllegalArgumentException("회원이 존재하지 않습니다.")
    }
}
