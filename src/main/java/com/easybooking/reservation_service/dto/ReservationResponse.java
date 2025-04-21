package com.easybooking.reservation_service.dto;

import lombok.Data;

@Data
public class ReservationResponse {
    private Long reservationId;
    private String status;
}
