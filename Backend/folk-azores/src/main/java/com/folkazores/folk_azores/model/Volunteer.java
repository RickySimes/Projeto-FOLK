package com.folkazores.folk_azores.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "volunteers")
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", length = 150, nullable = false)
    private String fullName;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "tshirt_size", length = 4)
    private String tshirtSize;

    @Column(name = "cc_number", length = 16, nullable = false)
    private String ccNumber;

    @Column(name = "nif", length = 15, nullable = false)
    private String nif;

    @Column(name = "level_of_education", length = 100)
    private String levelOfEducation;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "instagram_link", length = 255)
    private String instagramLink;

    @Column(name = "occupation", length = 100)
    private String occupation;

    @Column(name = "languages_spoken", length = 255)
    private String languagesSpoken;

    @Column(name = "preferred_activity", length = 100)
    private String preferredActivity;

    @Column(name = "week_availability", length = 100)
    private String weekAvailability;

    @Column(name = "time_of_day_availability", length = 100)
    private String timeOfDayAvailability;

}