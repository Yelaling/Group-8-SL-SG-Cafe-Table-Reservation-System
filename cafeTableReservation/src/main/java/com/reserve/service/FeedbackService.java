package com.reserve.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserve.entity.Feedback;
import com.reserve.repository.FeebackRepo;

@Service
public class FeedbackService {
	@Autowired
	private FeebackRepo Repo;
	
	public Feedback saveFeed(Feedback Feed) {
		return Repo.save(Feed);
		
	}
	
	
	

}
