package com.example.qlks_spring.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "booking_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "booking_id",referencedColumnName = "id")
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "id")
    private Service service;

    // getters and setters
}
