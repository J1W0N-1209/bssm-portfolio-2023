package com.bssm.bssmportfolio2023.domain

import com.bssm.bssmportfolio2023.enums.MemberRoleType
import jakarta.persistence.*

@Entity
class Member private constructor(
    email: String,
    password: String,
    name: String,
    roleType: MemberRoleType,
) : BaseDateTime() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    @Column(nullable = false)
    var email: String = email
        protected set

    @Column(nullable = false)
    var password: String = password
        protected set

    @Column(nullable = false)
    var name: String = name
        protected set

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var roleType: MemberRoleType = roleType
        protected set

    @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL], orphanRemoval = true)
    var comments: List<Comment> = mutableListOf()
        protected set

    @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL], orphanRemoval = true)
    var contributors: List<PortfolioContributor> = mutableListOf()
        protected set

    companion object {
        fun createAdmin(
            email: String,
            password: String,
            name: String,
        ): Member {
            return Member(
                email = email,
                password = password,
                name = name,
                roleType = MemberRoleType.ADMIN
            )
        }

        fun createUser(
            email: String,
            password: String,
            name: String,
        ): Member {
            return Member(
                email = email,
                password = password,
                name = name,
                roleType = MemberRoleType.USER
            )
        }
    }
}
