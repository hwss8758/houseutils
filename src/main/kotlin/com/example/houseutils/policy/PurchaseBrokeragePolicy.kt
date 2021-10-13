package com.example.houseutils.policy

/**
 * 매매일때 중계수수로를 계산해주는 class
 */
class PurchaseBrokeragePolicy : BrokeragePolicy {

    private val rules: List<BrokerageRule>

    init {
        rules = listOf(
            BrokerageRule(lessThan = 50_000_000L, brokeragePercent = 0.6, limitAmount = 250_000L),
            BrokerageRule(lessThan = 200_000_000L, brokeragePercent = 0.5, limitAmount = 800_000L),
            BrokerageRule(lessThan = 600_000_000L, brokeragePercent = 0.4),
            BrokerageRule(lessThan = 900_000_000L, brokeragePercent = 0.5),
            BrokerageRule(lessThan = Long.MAX_VALUE, brokeragePercent = 0.9)
        )
    }

    override fun getRules(): List<BrokerageRule> {
        return rules
    }
}