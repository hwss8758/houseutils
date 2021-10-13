package com.example.houseutils.policy

import com.example.houseutils.constants.ActionType
import com.example.houseutils.exception.ErrorCode
import com.example.houseutils.exception.HouseUtilsException

class BrokeragePolicyFactory {

    companion object {
        fun of(actionType: ActionType): BrokeragePolicy {

            val rentBrokeragePolicy = RentBrokeragePolicy()
            val purchaseBrokeragePolicy = PurchaseBrokeragePolicy()

            return when (actionType) {
                ActionType.RENT -> rentBrokeragePolicy
                ActionType.PURCHASE -> purchaseBrokeragePolicy
                else -> throw HouseUtilsException(ErrorCode.INVALID_REQUEST, "해당 actionType에 대한 정책이 존재하지 않습니다.")
            }
        }
    }
}