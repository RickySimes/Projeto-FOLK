package com.folkazores.folk_azores.service;

import com.folkazores.folk_azores.model.Volunteer;

import java.util.List;
import java.util.Optional;

public interface VolunteerService {

    List<Volunteer> getAllVolunteers();
    Optional<Volunteer> getVolunteerByID(Long id);
    Volunteer createVolunteer(Volunteer volunteer);
    void deleteVolunteer(Long id);
}
