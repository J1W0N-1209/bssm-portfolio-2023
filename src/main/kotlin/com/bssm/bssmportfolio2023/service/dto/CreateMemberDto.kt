package com.bssm.bssmportfolio2023.service.dto

import com.bssm.bssmportfolio2023.domain.Member

data class CreateMemberDto(
    val email: String,
    val password: String,
    val name: String,
)

fun CreateMemberDto.toEntity(): Member {
    return Member.createUser(
        email = email,
        password = password,
        name = name
    )
}
