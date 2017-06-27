package com.test.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.spring.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
}
