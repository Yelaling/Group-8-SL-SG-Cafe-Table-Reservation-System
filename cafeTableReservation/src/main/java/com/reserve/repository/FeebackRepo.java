package com.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserve.entity.Feedback;

public interface FeebackRepo extends JpaRepository<Feedback, Integer>  {

}
