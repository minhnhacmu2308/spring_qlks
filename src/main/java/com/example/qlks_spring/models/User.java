package com.example.qlks_spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = false)
    private String fullName;

    @Column(length = 255, nullable = false)
    private String userName;

    @Column(length = 255, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 255)
    private String phoneNumber;

    @Column(length = 255)
    private String address;

    private String gender;

    private int status;


    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<RoomComment> roomComments;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

    // getters and setters
}