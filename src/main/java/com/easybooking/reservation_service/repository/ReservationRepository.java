package com.easybooking.reservation_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easybooking.reservation_service.bean.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {}
