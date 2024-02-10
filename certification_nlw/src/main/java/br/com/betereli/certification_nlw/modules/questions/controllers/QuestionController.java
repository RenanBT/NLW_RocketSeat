package br.com.betereli.certification_nlw.modules.questions.controllers;

import br.com.betereli.certification_nlw.modules.questions.entities.QuestionEntity;
import br.com.betereli.certification_nlw.modules.questions.repositories.QuestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/technology{technology}")
    public List<QuestionEntity> findByTechnology(String technology){
        return this.questionRepository.findByTechnology(technology);

    }
    
}
