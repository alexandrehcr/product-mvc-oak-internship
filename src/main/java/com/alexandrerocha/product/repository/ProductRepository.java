package com.alexandrerocha.product.repository;

import com.alexandrerocha.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
