package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class DemoController {
	
	@Autowired
    DemoService questionService;
	
    @GetMapping  // Fix: No "/", so it maps directly to /job
    public String home() {
        return "Hello, Job Application is running!";
    }
    
    @GetMapping("allQuestions")
    public ResponseEntity<List<Demo>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    
    @GetMapping("category/{category}")
    public ResponseEntity<List<Demo>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
    
}


