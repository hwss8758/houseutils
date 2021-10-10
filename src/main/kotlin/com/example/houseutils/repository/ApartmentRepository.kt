package com.example.houseutils.repository

import com.example.houseutils.entity.Apartment
import org.springframework.data.jpa.repository.JpaRepository

interface ApartmentRepository : JpaRepository<Apartment, Long> {
}