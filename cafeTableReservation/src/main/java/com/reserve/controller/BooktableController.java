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

import com.reserve.entity.Booktable;
import com.reserve.repository.BooktableRepo;
import com.reserve.service.BookTableService;

@RestController
public class BooktableController {

@Autowired
private BookTableService service;
	@Autowired
	private BooktableRepo repo;
	
	@PostMapping("/booktable")
	@CrossOrigin(origins="http://localhost:4200")
	public Booktable savaTable(@RequestBody Booktable book)
	{
		Booktable  bookObj= null;
		bookObj =service.saveTable(book);
		return bookObj;
	}
	
	@GetMapping("/viewtables")
	@CrossOrigin(origins="http://localhost:4200")
	 public List<Booktable> getAllTable(){
		return repo.findAll();
	}
	
	@DeleteMapping("/canceltable/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Booktable> deleteItem(@PathVariable int id){
		 repo.deleteById(id);
		return repo.findAll();
	}
}
