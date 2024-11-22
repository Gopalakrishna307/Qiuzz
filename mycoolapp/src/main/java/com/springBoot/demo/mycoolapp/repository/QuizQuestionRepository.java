package com.springBoot.demo.mycoolapp.repository;


import com.springBoot.demo.mycoolapp.entity.Quiz;
import com.springBoot.demo.mycoolapp.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
    // Custom methods for quiz question-related operations
    public List<QuizQuestion> findByQuiz(Quiz quiz);
}
