package com.shop.zephyr.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.zephyr.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(final String username, final String password);
}
