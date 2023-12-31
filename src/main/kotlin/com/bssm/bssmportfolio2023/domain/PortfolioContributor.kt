package com.bssm.bssmportfolio2023.domain

import jakarta.persistence.*

@Entity
class PortfolioContributor(
    portfolio: Portfolio,
    member: Member,
) : BaseDateTime() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "portfolio_id",
        nullable = false,
        foreignKey = ForeignKey(name = "FK_PORTFOLIO_CONTRIBUTOR_PORTFOLIO_ID")
    )
    var portfolio: Portfolio = portfolio
        protected set

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "member_id",
        nullable = false,
        foreignKey = ForeignKey(name = "FK_PORTFOLIO_CONTRIBUTOR_MEMBER_ID")
    )
    var member: Member = member
        protected set
}
