package com.example.houseutils.policy

interface BrokeragePolicy {

    fun createBrokerageRule(price: Long): BrokerageRule

    fun calculate(price: Long): Long {
        val rule = createBrokerageRule(price)
        return rule.calcMaxBrokerage(price)
    }
}