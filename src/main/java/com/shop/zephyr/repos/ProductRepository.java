package com.shop.zephyr.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.zephyr.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
