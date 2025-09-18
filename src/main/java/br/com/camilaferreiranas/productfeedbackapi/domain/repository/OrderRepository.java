package br.com.camilaferreiranas.productfeedbackapi.domain.repository;

import br.com.camilaferreiranas.productfeedbackapi.domain.enums.OrderStatus;
import br.com.camilaferreiranas.productfeedbackapi.domain.model.Order;
import br.com.camilaferreiranas.productfeedbackapi.domain.model.Product;
import br.com.camilaferreiranas.productfeedbackapi.domain.model.User;

import java.util.List;

public interface OrderRepository {

    void save(Order order);
    void changeStatus(Order order, OrderStatus orderStatus);
    List<Order> findAll();
}
