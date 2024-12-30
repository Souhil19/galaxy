package com.somari.galaxy.repository;

import com.somari.galaxy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductByCategoryName(String category);

    List<Product> findProductByBrand(String brand);

    List<Product> findProductByCategoryAndBrand(Long categoryId, String brand);
}
