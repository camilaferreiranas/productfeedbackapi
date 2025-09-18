package br.com.camilaferreiranas.productfeedbackapi.domain.model;

import br.com.camilaferreiranas.productfeedbackapi.domain.enums.ProductType;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String title;
    private String description;
    private ProductType productType;
    private BigDecimal price;
    private Double review;

    public Product() {
    }

    public Product(Long id, String title, String description, ProductType productType, BigDecimal price, Double review) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.productType = productType;
        this.price = price;
        this.review = review;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getReview() {
        return review;
    }

    public void setReview(Double review) {
        this.review = review;
    }
}
