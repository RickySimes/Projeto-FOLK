package com.folkazores.folk_azores.repository;

import com.folkazores.folk_azores.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
