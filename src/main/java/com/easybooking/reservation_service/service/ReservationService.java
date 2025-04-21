package com.easybooking.reservation_service.service;

import com.easybooking.reservation_service.bean.Reservation;
import com.easybooking.reservation_service.dto.ReservationRequest;

public interface ReservationService {
    Reservation createReservation(ReservationRequest request);
}
