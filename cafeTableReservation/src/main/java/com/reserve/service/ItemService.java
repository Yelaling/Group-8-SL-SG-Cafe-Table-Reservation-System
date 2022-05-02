package com.reserve.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserve.entity.Items;
import com.reserve.repository.ItemsRepo;


@Service
public class ItemService{
	
	@Autowired
	private ItemsRepo repo;
	
	public Items saveItem(Items item) {
		return repo.save(item);
	}
	
	
//	public List<Items> getAllUser() {
//		return repo.findAll();
//	}


	
	

   
}
