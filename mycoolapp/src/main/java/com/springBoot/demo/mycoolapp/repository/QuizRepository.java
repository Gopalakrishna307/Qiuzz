package com.springBoot.demo.mycoolapp.repository;


import com.springBoot.demo.mycoolapp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // Custom methods for quiz-related operations
}