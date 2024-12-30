package com.somari.galaxy.service.product;

import com.somari.galaxy.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);

    Product getProductById(Long id);
    Product updateProduct(Product product, Long productId);
    void deleteProduct(Long id);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(Long categoryId);
    List<Product> getProductsByCategoryName(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice);
    List<Product> getProductsByInventory(int inventory);
    List<Product> getProductsByDescription(String description);
    List<Product> getProductsByCategoryAndBrand(Long categoryId, String brand);
    List<Product> getProductsByCategoryAndPriceRange(Long categoryId, Double minPrice, Double maxPrice);
    List<Product> getProductsByCategoryAndInventory(Long categoryId, int inventory);
    List<Product> getProductsByCategoryAndDescription(Long categoryId, String description);
    List<Product> getProductsByNyName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);


}
