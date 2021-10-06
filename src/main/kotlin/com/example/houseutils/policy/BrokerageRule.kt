package com.example.houseutils.policy

import kotlin.math.floor

/**
 * 가격이 특정범위일때 상한효율과 상환금액을 가지는 클래스
 */
data class BrokerageRule(
    val brokeragePercent: Double,
    val limitAmount: Long? = null
) {
    fun calcMaxBrokerage(price: Long): Long {
        return if (limitAmount == null) multiplyPercent(price)
        else multiplyPercent(price).coerceAtMost(limitAmount)
    }

    private fun multiplyPercent(price: Long): Long = floor(brokeragePercent / 100 * price).toLong()

}