package com.easybooking.reservation_service.service;

import org.springframework.stereotype.Service;

import com.easybooking.reservation_service.bean.Reservation;
import com.easybooking.reservation_service.dto.ReservationRequest;
import com.easybooking.reservation_service.repository.ReservationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(ReservationRequest request) {
        Reservation reservation = new Reservation();
        reservation.setUserId(request.getUserId());
        reservation.setRoomId(request.getRoomId());
        reservation.setStartDate(request.getStartDate());
        reservation.setEndDate(request.getEndDate());
        reservation.setStatus("PENDING");

        return reservationRepository.save(reservation);
    }
}
