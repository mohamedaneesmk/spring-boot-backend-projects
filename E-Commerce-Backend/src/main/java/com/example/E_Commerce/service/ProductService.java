package com.example.E_Commerce.service;

import com.example.E_Commerce.model.Product;
import com.example.E_Commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    // 🔹 Get all products
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    // 🔹 Get product by ID
    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    // 🔹 Save product (JSON only)
    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    // 🔹 Save product with image
    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        if (imageFile != null && !imageFile.isEmpty()) {
            product.setImageName(imageFile.getOriginalFilename());
            product.setImageType(imageFile.getContentType());
            product.setImageData(imageFile.getBytes());
        }
        return repo.save(product);
    }

    // 🔹 Update product (JSON only)
    @Transactional
    public void updateProduct(int id, Product newProduct) {
        Product existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existing.setName(newProduct.getName());
        existing.setDescription(newProduct.getDescription());
        existing.setBrand(newProduct.getBrand());
        existing.setCategory(newProduct.getCategory());
        existing.setPrice(newProduct.getPrice());
        existing.setReleaseDate(newProduct.getReleaseDate());
        existing.setProductAvailable(newProduct.isProductAvailable());
        existing.setStockQuantity(newProduct.getStockQuantity());
    }

    // 🔹 Delete product
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    // 🔹 Search
    public List<Product> searchProducts(String keyword) {
        return repo.searchProducts(keyword);
    }
}
