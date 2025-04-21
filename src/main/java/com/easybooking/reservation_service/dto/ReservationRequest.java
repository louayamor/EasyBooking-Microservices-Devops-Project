package com.easybooking.reservation_service.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReservationRequest {
    private Long userId;
    private Long roomId;
    private LocalDate startDate;
    private LocalDate endDate;
}
