package com.reserve.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserve.entity.Booktable;

public interface BooktableRepo extends JpaRepository<Booktable, Integer> {

}
