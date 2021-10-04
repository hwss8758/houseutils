package com.example.houseutils.policy

/**
 * 매매일때 중계수수로를 계산해주는 class
 */
class PurchaseBrokeragePolicy : BrokeragePolicy {

    override fun createBrokerageRule(price: Long): BrokerageRule {
        return if (price < 50_000_000) {
            BrokerageRule(brokeragePercent = 0.6, limitAmount = 250_000L)
        } else if (price < 200_000_000) {
            BrokerageRule(brokeragePercent = 0.5, limitAmount = 800_000L)
        } else if (price < 600_000_000) {
            BrokerageRule(brokeragePercent = 0.4)
        } else if (price < 900_000_000) {
            BrokerageRule(brokeragePercent = 0.5)
        } else {
            BrokerageRule(brokeragePercent = 0.9)
        }
    }
}