package com.reactboot.repository;

import com.reactboot.model.user;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<user, Integer> {

	void saveAll(User user);

}