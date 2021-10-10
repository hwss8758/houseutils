package com.example.houseutils.controller

import com.example.houseutils.constants.ActionType
import com.example.houseutils.policy.BrokeragePolicyFactory
import com.example.houseutils.service.ApartmentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class BrokerageQueryController(
    private val apartmentService: ApartmentService
) {

    @GetMapping("/api/calc/brokerage")
    fun calcBrokerage(@RequestParam actionType: ActionType, @RequestParam price: Long): Long {

        // 타입의 처리에 관한 부분은 factory class에서만 분기되도록 한다.
        val policy = BrokeragePolicyFactory.of(actionType)
        return policy.calculate(price)
    }

    @GetMapping("/api/calc/apartment/{apartmentId}")
    fun calcBrokerageByApartmentId(
        @PathVariable apartmentId: Long,
        @RequestParam actionType: ActionType
    ): Long {
        val policy = BrokeragePolicyFactory.of(actionType)
        return policy.calculate(apartmentService.getPriceOrThrow(apartmentId))
    }
}