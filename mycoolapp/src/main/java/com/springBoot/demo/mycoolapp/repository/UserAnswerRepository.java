package com.springBoot.demo.mycoolapp.repository;


import com.springBoot.demo.mycoolapp.entity.UserAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswers, Long> {
    // Custom methods for user answer-related operations
}