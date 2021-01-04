package com.alanlima.dsdeliverer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanlima.dsdeliverer.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
