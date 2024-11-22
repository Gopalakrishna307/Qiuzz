package com.springBoot.demo.mycoolapp.repository;



import com.springBoot.demo.mycoolapp.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
    // Custom methods for question-related operations
}
