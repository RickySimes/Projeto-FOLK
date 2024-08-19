package com.folkazores.folk_azores.repository;

import com.folkazores.folk_azores.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepostiory extends JpaRepository<Volunteer, Long> {
}
