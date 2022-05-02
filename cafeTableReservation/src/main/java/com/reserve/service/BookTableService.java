package com.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reserve.entity.Booktable;
import com.reserve.repository.BooktableRepo;
@Service
public class BookTableService {

	@Autowired
	private BooktableRepo repo;
	
	public Booktable saveTable(Booktable booktable)
	{
		return repo.save(booktable);
		
	}
	
	public List<Booktable> getAllTable() {
		return repo.findAll();
	}
}
