package com.somari.galaxy.service.product;

import com.somari.galaxy.exceptions.ProductNotFoundException;
import com.somari.galaxy.model.Product;
import com.somari.galaxy.repository.ProductRepository;

import java.util.List;

public abstract class ProductService implements IProductService{

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow( () -> new ProductNotFoundException("Product with id: " + id + " not found"));
    }

    @Override
    public Product updateProduct(Product product, Long productId) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.findById(id).ifPresentOrElse(product -> productRepository.delete(product), () -> {
            throw new ProductNotFoundException("Product with id: " + id + " not found");
        });
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProductsByCategoryName(String category) {
        return productRepository.findProductByCategoryName(category);
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findProductByBrand(brand);
    }

    @Override
    public List<Product> getProductsByPriceRange(Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public List<Product> getProductsByInventory(int inventory) {
        return null;
    }

    @Override
    public List<Product> getProductsByDescription(String description) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(Long categoryId, String brand) {
        return productRepository.findProductByCategoryAndBrand(categoryId, brand);
    }

    @Override
    public List<Product> getProductsByCategoryAndPriceRange(Long categoryId, Double minPrice, Double maxPrice) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryAndInventory(Long categoryId, int inventory) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryAndDescription(Long categoryId, String description) {
        return null;
    }

    @Override
    public List<Product> getProductsByNyName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return null;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return null;
    }

}
