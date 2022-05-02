package com.reserve.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reserve.entity.Items;
import com.reserve.repository.ItemsRepo;
import com.reserve.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService service;
	
	@Autowired
	private ItemsRepo repo;
	@PostMapping("/addItem")
	@CrossOrigin(origins="http://localhost:4200")
	
	public Items saveItems(@RequestBody Items item) {
		Items itemObj =null;
		itemObj= service.saveItem(item);
		 return itemObj;
	}
	
	@GetMapping("/vitems")
	@CrossOrigin(origins="http://localhost:4200")
	 public List<Items> findAllItems(){
		return repo.findAll();
	}
	
	@DeleteMapping("/cancel/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Items> deleteItem(@PathVariable int id){
		 repo.deleteById(id);
		return repo.findAll();
	}
	

	
	
		 
 }

