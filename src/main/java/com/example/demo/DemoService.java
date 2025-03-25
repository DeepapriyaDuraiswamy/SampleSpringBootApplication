package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
	
	    @Autowired
	    DemoRepo questionDao;

	    public ResponseEntity<List<Demo>> getAllQuestions() {
	        try {
	            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	    }

	    public ResponseEntity<List<Demo>> getQuestionsByCategory(String category) {
	        try {
	            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

	    }
}
