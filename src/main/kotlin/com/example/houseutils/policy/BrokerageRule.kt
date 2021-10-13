package com.example.houseutils.policy

import kotlin.math.floor

/**
 * 가격이 특정범위일때 상한효율과 상환금액을 가지는 클래스
 */
data class BrokerageRule(
    val lessThan: Long,
    val brokeragePercent: Double,
    val limitAmount: Long = Long.MAX_VALUE
) {
    fun calcMaxBrokerage(price: Long): Long = multiplyPercent(price).coerceAtMost(limitAmount)

    private fun multiplyPercent(price: Long): Long = floor(brokeragePercent / 100 * price).toLong()
}