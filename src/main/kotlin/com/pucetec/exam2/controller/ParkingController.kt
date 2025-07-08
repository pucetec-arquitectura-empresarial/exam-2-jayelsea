package com.pucetec.exam2.controller


import com.ejemplo.parqueadero.service.ParkingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/parking/availability")
class ParkingController(@Autowired val parkingService: ParkingService) {


    @PostMapping("/enter/{level}/{ticketId}")
    fun vehicleEntry(
        @PathVariable level: String,
        @PathVariable ticketId: String,
    ): String {
        return parkingService.vehicleEntry(level, ticketId)
    }





