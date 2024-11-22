package com.springBoot.demo.mycoolapp.repository;

import com.springBoot.demo.mycoolapp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom methods for user-related operations
    public List<Users> findByUsername(String username);
}