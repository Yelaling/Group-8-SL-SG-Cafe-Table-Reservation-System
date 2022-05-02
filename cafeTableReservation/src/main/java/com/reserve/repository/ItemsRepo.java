package com.reserve.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.reserve.entity.Items;

@Repository

public interface ItemsRepo extends JpaRepository<Items, Integer>{
	
//	@Transactional
//	@Modifying
//	@Query("UPDATE Items SET price = :price WHERE name = :name")
//	Integer updatePriceByName(double price, String name);

	
	
}
