package com.food;

import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.reserve.entity.*;

public class SpringbootTestcase
{
	//user
	@Autowired
	
	@Test
	@Order(1)
	
	public void TestCreate()
	{
		User u = new User();
		
		u.setId(1);
		u.setUserName("ravi");
		u.setEmailId("ravi@gmail.com");
		u.setPassword("ravi@123");
		
		}
	
	@Test
	@Order(2)
	public void testcase()
	{
		Booktable bt = new Booktable();
		
		bt.setId(2);
		bt.setCustomerName("pvan");
		bt.setContact(25512659l);
		bt.setTableNo(5);
		bt.setAc("yes");
		bt.setPeoples(10);
		bt.setDate1("20-01-2021");
		bt.setTime("02:01");
				
	}
	
	@Test
	@Order(3)
	public void feedback()
	{
		Feedback fb = new Feedback();
		
		fb.setId(5);
		fb.setRating(5);
		fb.setDescription("good");
		fb.setName("fine");
		}
	
	
	@Test
	@Order(4)
	public void item()
	
	{
		Items it = new Items();
		
		it.setFid(01);
		it.setName("bannana");
		it.setDescription("it very testy");
		it.setImage("nxjx");
		it.setPrice(253.0);
		it.setQuantity("large");
		
		}
	
	
	

}
