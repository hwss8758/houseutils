package com.example.houseutils.service

import com.example.houseutils.entity.Apartment
import com.example.houseutils.repository.ApartmentRepository
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class ApartmentService(
    private val apartmentRepository: ApartmentRepository
) {

    @PostConstruct
    fun init() {
        val apartment = Apartment(name = "apartmentA", address = "addressA", price = 1000000000)
        apartmentRepository.save(apartment)
    }

    fun getPriceOrThrow(apartmentId: Long): Long {
        return apartmentRepository.findById(apartmentId).get().price
    }
}