package com.bssm.bssmportfolio2023.controller

import com.bssm.bssmportfolio2023.controller.rq.MemberRq
import com.bssm.bssmportfolio2023.controller.rq.toDto
import com.bssm.bssmportfolio2023.global.ApiPath
import com.bssm.bssmportfolio2023.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController (
    private val memberService: MemberService,
){
    @PostMapping(ApiPath.MEMVER_V1)
    fun createMember(@RequestBody rq: MemberRq): Long {
        return memberService.create(rq.toDto())
    }
}
