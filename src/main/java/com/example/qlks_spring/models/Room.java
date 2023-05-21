package com.example.qlks_spring.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String image;

    private String description;

    private int discount;

    private int cost;

    private int view;

    private int numberChildren;

    private int numberAdult;

    @ManyToOne
    @JoinColumn(name = "type_id",referencedColumnName = "id")
    private Type type;

    @OneToMany(mappedBy = "room")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "room")
    private List<RoomComment> roomComments;

    // getters and setters
}