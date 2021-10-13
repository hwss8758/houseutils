package com.example.houseutils.policy

import com.example.houseutils.exception.ErrorCode
import com.example.houseutils.exception.HouseUtilsException

interface BrokeragePolicy {

    fun getRules(): List<BrokerageRule>

    fun calculate(price: Long): Long {
        val brokerageRule = getRules().find { rule -> price < rule.lessThan }
            ?: throw HouseUtilsException(ErrorCode.INTERNAL_ERROR)
        return brokerageRule.calcMaxBrokerage(price)
    }
}