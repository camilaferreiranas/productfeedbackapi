package br.com.camilaferreiranas.productfeedbackapi.domain.repository;

import br.com.camilaferreiranas.productfeedbackapi.domain.model.Product;

import java.util.List;

public interface ProductRepository {

    void save(Product product);
    List<Product> findAll();
    Product findByTitle(String title);
}
