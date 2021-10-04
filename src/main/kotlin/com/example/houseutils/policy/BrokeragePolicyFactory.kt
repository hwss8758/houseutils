package com.example.houseutils.policy

import com.example.houseutils.constants.ActionType

class BrokeragePolicyFactory {

    companion object {
        fun of(actionType: ActionType): BrokeragePolicy {
            return when (actionType) {
                ActionType.RENT -> RentBrokeragePolicy()
                ActionType.PURCHASE -> PurchaseBrokeragePolicy()
                else -> throw IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않습니다.")
            }
        }
    }
}