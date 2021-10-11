package com.example.houseutils.policy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class PurchaseBrokeragePolicyTest {
    lateinit var purchaseBrokeragePolicy: PurchaseBrokeragePolicy

    @BeforeEach
    fun setup() {
        purchaseBrokeragePolicy = PurchaseBrokeragePolicy()
    }

    @Test
    fun testPurchaseBrokeragePolicy() {
        assertEquals(purchaseBrokeragePolicy.calculate(30_000_000L), 180_000L)
        assertEquals(purchaseBrokeragePolicy.calculate(100_000_000L), 500_000L)
        assertEquals(purchaseBrokeragePolicy.calculate(500_000_000L), 2_000_000L)
        assertEquals(purchaseBrokeragePolicy.calculate(800_000_000L), 4_000_000L)
        assertEquals(purchaseBrokeragePolicy.calculate(1000_000_000L), 9_000_000L)
    }
}