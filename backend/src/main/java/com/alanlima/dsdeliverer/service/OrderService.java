package com.alanlima.dsdeliverer.service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alanlima.dsdeliverer.dto.OrderDTO;
import com.alanlima.dsdeliverer.dto.ProductDTO;
import com.alanlima.dsdeliverer.entities.Order;
import com.alanlima.dsdeliverer.entities.OrderStatus;
import com.alanlima.dsdeliverer.entities.Product;
import com.alanlima.dsdeliverer.repositories.OrderRepository;
import com.alanlima.dsdeliverer.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	@Autowired
	private ProductRepository productRepository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repo.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}

	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(),
				OrderStatus.PENDING);
		for (ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		order = repo.save(order);
		return new OrderDTO(order);
	}
}
