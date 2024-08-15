package com.folkazores.folk_azores.service;

import com.folkazores.folk_azores.model.Volunteer;
import com.folkazores.folk_azores.repository.VolunteerRepostiory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VolunteerServiceImpl implements VolunteerService {

    @Autowired
    VolunteerRepostiory volunteerRepostiory;

    @Override
    public List<Volunteer> getAllVolunteers() {
        return List.of();
    }

    @Override
    public Optional<Volunteer> getVolunteerByID(Long id) {
        return Optional.empty();
    }

    @Override
    public Volunteer createVolunteer() {
        return null;
    }

    @Override
    public void DeleteVolunteer(Long id) {

    }

    @Override
    public Volunteer updateVolunteer(Long id, Volunteer volunteer) {
        return null;
    }
}
