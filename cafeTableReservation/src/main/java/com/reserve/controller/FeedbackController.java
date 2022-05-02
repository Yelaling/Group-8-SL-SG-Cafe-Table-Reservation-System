package com.reserve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.entity.Feedback;
import com.reserve.repository.FeebackRepo;
import com.reserve.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService service;
	
	@Autowired
	private FeebackRepo Repo;
	
	@PostMapping("/addFeedback")
	@CrossOrigin(origins="http://localhost:4200")
	
	public Feedback saveFeed(@RequestBody Feedback Feed) {
		Feedback FeedObj =null;
		FeedObj= service.saveFeed(Feed);
		 return FeedObj;
	}
	
	@GetMapping("/vFeedback")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Feedback> findAllFeedbacList(){
		return Repo.findAll();
	}
	
	@DeleteMapping("/cancelfeed/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Feedback> deleFeedbacks(@PathVariable int id){
		 Repo.deleteById(id);
		return Repo.findAll();
	}

}
