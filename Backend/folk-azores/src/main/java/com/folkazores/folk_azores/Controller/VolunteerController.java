package com.folkazores.folk_azores.Controller;

import com.folkazores.folk_azores.model.Volunteer;
import com.folkazores.folk_azores.repository.VolunteerRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerRepostiory volunteerRepository;

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Volunteer> getVolunteerById(@PathVariable Long id){
        Optional<Volunteer> volunteer = volunteerRepository.findById(id);
        if (volunteer.isPresent()){
            return ResponseEntity.ok(volunteer.get());
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<Volunteer> createVolunteer(@RequestBody Volunteer volunteer){
        try {
            Volunteer savedVolunteer = volunteerRepository.save(volunteer);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedVolunteer);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
