package com.folkazores.folk_azores.service;

import com.folkazores.folk_azores.model.Volunteer;
import com.folkazores.folk_azores.repository.VolunteerRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerServiceImpl implements VolunteerService {

    @Autowired
    VolunteerRepostiory volunteerRepostiory;

    @Override
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepostiory.findAll();
    }

    @Override
    public Optional<Volunteer> getVolunteerByID(Long id) {
        return volunteerRepostiory.findById(id);
    }

    @Override
    public Volunteer createVolunteer(Volunteer volunteer) {
        return volunteerRepostiory.save(volunteer);
    }


    @Override
    public void deleteVolunteer(Long id) {
        volunteerRepostiory.deleteById(id);
    }
}
