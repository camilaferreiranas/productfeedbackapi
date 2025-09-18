package br.com.camilaferreiranas.productfeedbackapi.domain.model;

import br.com.camilaferreiranas.productfeedbackapi.domain.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;
    private List<Product> products;
    private User user;
    private BigDecimal total;
    private LocalDate dateCreated;
    private OrderStatus status;

    public Order() {
    }

    public Order(Long id, List<Product> products, User user, BigDecimal total, LocalDate dateCreated, OrderStatus status) {
        this.id = id;
        this.products = products;
        this.user = user;
        this.total = total;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
