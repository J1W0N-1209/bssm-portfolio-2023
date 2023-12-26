package com.bssm.bssmportfolio2023.service

import com.bssm.bssmportfolio2023.repository.MemberRepository
import com.bssm.bssmportfolio2023.service.dto.CreateMemberDto
import com.bssm.bssmportfolio2023.service.dto.toEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class MemberService (
    private val memberRepository: MemberRepository,
){
    fun create(dto : CreateMemberDto): Long {
        val member = dto.toEntity()
        memberRepository.save(member)
        return member.id
    }
}
