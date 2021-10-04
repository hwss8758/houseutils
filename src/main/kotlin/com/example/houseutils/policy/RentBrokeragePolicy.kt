package com.example.houseutils.policy

class RentBrokeragePolicy : BrokeragePolicy {

    override fun createBrokerageRule(price: Long): BrokerageRule {
        return if (price < 50_000_000) {
            BrokerageRule(brokeragePercent = 0.5, limitAmount = 200_000L)
        } else if (price < 100_000_000) {
            BrokerageRule(brokeragePercent = 0.4, limitAmount = 300_000L)
        } else if (price < 300_000_000) {
            BrokerageRule(brokeragePercent = 0.3)
        } else if (price < 600_000_000) {
            BrokerageRule(brokeragePercent = 0.4)
        } else {
            BrokerageRule(brokeragePercent = 0.8)
        }
    }
}