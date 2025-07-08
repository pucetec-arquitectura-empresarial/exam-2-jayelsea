package com.pucetec.exam2.entities

import jakarta.persistence.Entity
import org.springframework.data.annotation.Id


@Entity
data class ParkingFloor(
    @Id val id: Long,
    val floorNumber: Int,
    val totalSlots: Int,
    var availableSlots: Int,


    )
