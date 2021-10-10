package com.example.houseutils.service

import com.example.houseutils.exception.HouseUtilsException
import com.example.houseutils.repository.ApartmentRepository
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

internal class ApartmentServiceTest {

    private val repository = mock(ApartmentRepository::class.java)

    private lateinit var service: ApartmentService

    @BeforeEach
    fun init() {
        service = ApartmentService(repository)
    }

    @Test
    fun ExceptionTest() {
        assertThrows(HouseUtilsException::class.java) {
            service.getPriceOrThrow(2L)
        }
    }

}