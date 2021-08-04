package com.shop.zephyr.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.zephyr.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
