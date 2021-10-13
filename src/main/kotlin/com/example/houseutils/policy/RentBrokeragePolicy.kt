package com.example.houseutils.policy

class RentBrokeragePolicy : BrokeragePolicy {

    private val rules: List<BrokerageRule>

    init {
        rules = listOf(
            BrokerageRule(lessThan = 50_000_000L, brokeragePercent = 0.5, limitAmount = 200_000L),
            BrokerageRule(lessThan = 100_000_000L, brokeragePercent = 0.4, limitAmount = 300_000L),
            BrokerageRule(lessThan = 300_000_000L, brokeragePercent = 0.3),
            BrokerageRule(lessThan = 600_000_000L, brokeragePercent = 0.4),
            BrokerageRule(lessThan = Long.MAX_VALUE, brokeragePercent = 0.8)
        )
    }

    override fun getRules() = rules

}