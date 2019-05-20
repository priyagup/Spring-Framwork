package com.reactboot.repository;

import com.reactboot.model.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<data, Integer> {

	data findByName(String groupName);

}